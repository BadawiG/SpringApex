package com.alibou.security.groupe_constantes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.alibou.security.uitil.BaseDTO;

@RestController
@RequestMapping("/api/groupe-constantes")
public class GroupeConstantesController {

	private final GroupeConstantesService groupeConstantesService;

	@Autowired
	public GroupeConstantesController(GroupeConstantesService groupeConstantesService) {
		this.groupeConstantesService = groupeConstantesService;
	}

	private BaseDTO createBaseDTO() {
		return new BaseDTO();
	}

	@GetMapping
	public BaseDTO getAllGroupeConstantes() {
		BaseDTO dto = createBaseDTO();
		try {
			List<GroupesConstantesModel> groupesConstantesModelList;
			groupesConstantesModelList =groupeConstantesService.getAllGroupeConstantes(); 
			if (groupesConstantesModelList.size()!= 0) {
				dto.setData(groupesConstantesModelList);
			} else { 
				dto.setMessage("No Data not found");
			} 
		} catch (Exception e) {
			dto.setErrorStatus();
			dto.setMessage("An error occurred while fetching groupe constantes: " + e.getMessage());
		}
		return dto;
	}

	@GetMapping("/{cdGroupe}")
	public BaseDTO getGroupeConstantesById(@PathVariable String cdGroupe) {
		BaseDTO dto = createBaseDTO();
		try {
			GroupesConstantesModel groupeConstantes = groupeConstantesService.getGroupeConstantesById(cdGroupe);
			if (groupeConstantes != null) {
				dto.setData(groupeConstantes);
			} else { 
				dto.setMessage("No Data not found");
			}
		} catch (Exception e) {
			dto.setErrorStatus();
			dto.setMessage("An error occurred while fetching groupe constantes: " + e.getMessage());
		}
		return dto;
	}

	@PostMapping
	public BaseDTO createGroupeConstantes(@RequestBody GroupesConstantesModel groupeConstantes) {
		BaseDTO dto = createBaseDTO();
		try {
			GroupesConstantesModel createdGroupeConstantes = groupeConstantesService
					.createOrUpdateGroupeConstantes(groupeConstantes);
			dto.setData(createdGroupeConstantes);
		} catch (Exception e) {
			dto.setErrorStatus();
			dto.setMessage("An error occurred while creating groupe constantes: " + e.getMessage());
		}
		return dto;
	}

	@PutMapping("/{cdGroupe}")
	public BaseDTO updateGroupeConstantes(@PathVariable String cdGroupe,
			@RequestBody GroupesConstantesModel groupeConstantes) {
		BaseDTO dto = createBaseDTO();
		try {
			if (groupeConstantesService.getGroupeConstantesById(cdGroupe) != null) {
				groupeConstantes.setCdGroupe(cdGroupe);
				GroupesConstantesModel updatedGroupeConstantes = groupeConstantesService
						.createOrUpdateGroupeConstantes(groupeConstantes);
				dto.setData(updatedGroupeConstantes);
			} else {
				dto.setErrorStatus();
				dto.setMessage("GroupesConstantesModel not found");
			}
		} catch (Exception e) {
			dto.setErrorStatus();
			dto.setMessage("An error occurred while updating groupe constantes: " + e.getMessage());
		}
		return dto;
	}

	@DeleteMapping("/{cdGroupe}")
	public BaseDTO deleteGroupeConstantes(@PathVariable String cdGroupe) {
		BaseDTO dto = createBaseDTO();
		try {
			if (groupeConstantesService.getGroupeConstantesById(cdGroupe) != null) {
				groupeConstantesService.deleteGroupeConstantes(cdGroupe);
				dto.setMessage("GroupesConstantesModel deleted successfully");
			} else {
				dto.setErrorStatus();
				dto.setMessage("GroupesConstantesModel not found");
			}
		} catch (Exception e) {
			dto.setErrorStatus();
			dto.setMessage("An error occurred while deleting groupe constantes: " + e.getMessage());
		}
		return dto;
	}
}
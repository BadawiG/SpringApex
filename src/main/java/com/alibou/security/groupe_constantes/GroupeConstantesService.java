package com.alibou.security.groupe_constantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GroupeConstantesService {

    private final GroupeConstantesRepository groupeConstantesRepository;

    @Autowired
    public GroupeConstantesService(GroupeConstantesRepository groupeConstantesRepository) {
        this.groupeConstantesRepository = groupeConstantesRepository;
    }

    public List<GroupesConstantesModel> getAllGroupeConstantes() {
        return groupeConstantesRepository.findAll();
    }

    public GroupesConstantesModel getGroupeConstantesById(String cdGroupe) {
        return groupeConstantesRepository.findById(cdGroupe).orElse(null);
    }

    public GroupesConstantesModel createOrUpdateGroupeConstantes(GroupesConstantesModel groupeConstantes) {
        return groupeConstantesRepository.save(groupeConstantes);
    }

    public void deleteGroupeConstantes(String cdGroupe) {
        groupeConstantesRepository.deleteById(cdGroupe);
    }
}


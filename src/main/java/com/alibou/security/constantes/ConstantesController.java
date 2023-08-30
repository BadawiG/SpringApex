package com.alibou.security.constantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/constantes")
public class ConstantesController {

    private final ConstantesService constantesService;

    @Autowired
    public ConstantesController(ConstantesService constantesService) {
        this.constantesService = constantesService;
    }

    @GetMapping
    public List<ConstantesModel> getAllConstantes() {
        return constantesService.getAllConstantes();
    }

    @GetMapping("/{cdGroupe}/{nom}")
    public ResponseEntity<ConstantesModel> getConstantesById(@PathVariable String cdGroupe, @PathVariable String nom) {
        ConstantesId id = new ConstantesId(cdGroupe, nom);
        Optional<ConstantesModel> constantes = constantesService.getConstantesById(id);
        return constantes.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ConstantesModel createConstantes(@RequestBody ConstantesModel constantes) {
        return constantesService.createOrUpdateConstantes(constantes);
    }

    @PutMapping("/{cdGroupe}/{nom}")
    public ResponseEntity<ConstantesModel> updateConstantes(@PathVariable String cdGroupe, @PathVariable String nom,
                                                       @RequestBody ConstantesModel constantes) {
        ConstantesId id = new ConstantesId(cdGroupe, nom);
        if (constantesService.getConstantesById(id).isPresent()) {
            constantes.setId(id);
            ConstantesModel updatedConstantes = constantesService.createOrUpdateConstantes(constantes);
            return ResponseEntity.ok(updatedConstantes);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{cdGroupe}/{nom}")
    public ResponseEntity<Void> deleteConstantes(@PathVariable String cdGroupe, @PathVariable String nom) {
        ConstantesId id = new ConstantesId(cdGroupe, nom);
        if (constantesService.getConstantesById(id).isPresent()) {
            constantesService.deleteConstantes(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

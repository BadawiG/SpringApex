package com.alibou.security.constantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ConstantesService {

    private final ConstantesRepository constantesRepository;

    @Autowired
    public ConstantesService(ConstantesRepository constantesRepository) {
        this.constantesRepository = constantesRepository;
    }

    public List<ConstantesModel> getAllConstantes() {
        return constantesRepository.findAll();
    }

    public Optional<ConstantesModel> getConstantesById(ConstantesId id) {
        return constantesRepository.findById(id);
    }

    public ConstantesModel createOrUpdateConstantes(ConstantesModel constantes) {
        return constantesRepository.save(constantes);
    }

    public void deleteConstantes(ConstantesId id) {
        constantesRepository.deleteById(id);
    }
}


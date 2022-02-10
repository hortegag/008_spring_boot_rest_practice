    package com.kata.budgetplanner.service.impl;

import java.io.Serializable;

import com.kata.budgetplanner.entity.IdentificationType;
import com.kata.budgetplanner.repository.IdentificationTypeRepository;
import com.kata.budgetplanner.service.IdentificationTypeService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IdentificationTypeServiceImpl implements IdentificationTypeService, Serializable {


    @Autowired
    private transient IdentificationTypeRepository identificationTypeRepository;

    @Override
    public Optional<IdentificationType> findById(Long id) {
        return identificationTypeRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        identificationTypeRepository.deleteById(id);
    }

    @Override
    public Optional<IdentificationType> save(IdentificationType identificationType) {
        return Optional.ofNullable(identificationTypeRepository.save(identificationType));
    }

    @Override
    public Long count() {
        return identificationTypeRepository.count();
    }

    @Override
    public List<IdentificationType> findByName(String searchName) {
        return identificationTypeRepository.findByName(searchName);
    }

    @Override
    @Transactional(readOnly = true)
    public List<IdentificationType> findAll() {

        return identificationTypeRepository.findAll()

    }

}

package com.kata.budgetplanner.service;

import com.kata.budgetplanner.entity.IdentificationType;

import javax.persistence.Tuple;

import java.util.List;
import java.util.Optional;

public interface IdentificationTypeService extends BaseService<IdentificationType,Long>{

    public Optional<IdentificationType> findById(Long id);

    public void deleteById(Long id);

    public Optional<IdentificationType> save(IdentificationType identificationType);

    public List<IdentificationType> findAll();

    public List<IdentificationType> findByName(String searchName);



}

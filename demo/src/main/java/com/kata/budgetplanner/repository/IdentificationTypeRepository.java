package com.kata.budgetplanner.repository;

import com.kata.budgetplanner.entity.IdentificationType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface IdentificationTypeRepository extends PagingAndSortingRepository<IdentificationType, Long> {


    List<IdentificationType> findByName(String name);


    Page<TransactionType> findByNameOrDescription(String name, String description, Pageable pageable);





}

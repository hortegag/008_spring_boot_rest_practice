package com.kata.budgetplanner.service;

import java.util.List;
import java.util.Optional;

public interface BaseService<E, K> {
    public Optional<E> findById(Long id);

    public void deleteById(K id);

    public Optional<E> save(E entity);

    public Long count();

}
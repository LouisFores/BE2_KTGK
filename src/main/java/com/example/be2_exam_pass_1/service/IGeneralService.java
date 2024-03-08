package com.example.be2_exam_pass_1.service;

import java.util.Optional;


public interface IGeneralService<E> {
    Iterable<E> findAll();


    Optional<E> findById(Long id);


    E save(E e);


    void remove(Long id);
}

package com.example.be2_exam_pass_1.repository;

import com.example.be2_exam_pass_1.model.Computer;
import com.example.be2_exam_pass_1.model.Staff;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface ComputerRepository extends PagingAndSortingRepository<Computer, Long> {
    Optional<Computer> findByFullNameContaining(String name);

}
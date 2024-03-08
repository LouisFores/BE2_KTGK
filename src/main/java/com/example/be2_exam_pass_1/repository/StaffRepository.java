package com.example.be2_exam_pass_1.repository;

import com.example.be2_exam_pass_1.model.Staff;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StaffRepository extends PagingAndSortingRepository<Staff, Long> {
    Optional<Staff> findByFullNameContaining(String name);
}

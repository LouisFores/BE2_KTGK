package com.example.be2_exam_pass_1.service;

import com.example.be2_exam_pass_1.model.Staff;

import java.util.Optional;

public interface IStaffService extends IGeneralService<Staff> {
    Optional<Staff> findByName(String name);
}

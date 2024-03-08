package com.example.be2_exam_pass_1.service;

import com.example.be2_exam_pass_1.model.Computer;
import com.example.be2_exam_pass_1.model.Staff;

import java.util.Optional;

public interface IComputerService extends IGeneralService<Computer>{
    Optional<Computer> findByName(String name);

}

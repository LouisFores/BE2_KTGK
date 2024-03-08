package com.example.be2_exam_pass_1.service;

import com.example.be2_exam_pass_1.model.Staff;
import com.example.be2_exam_pass_1.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;


@Service
public class StaffService implements IStaffService{


    @Autowired
    private StaffRepository staffRepository;


    @Override
    public Iterable<Staff> findAll() {
        return staffRepository.findAll();
    }


    @Override
    public Optional<Staff> findById(Long id) {
        return staffRepository.findById(id);
    }


    @Override
    public Staff save(Staff customer) {
        return staffRepository.save(customer);
    }


    @Override
    public void remove(Long id) {
        staffRepository.deleteById(id);
    }

    @Override
    public Optional<Staff> findByName(String name) {
        return staffRepository.findByFullNameContaining(name);
    }
}

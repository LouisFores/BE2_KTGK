package com.example.be2_exam_pass_1.service;

import com.example.be2_exam_pass_1.model.Computer;
import com.example.be2_exam_pass_1.model.Staff;
import com.example.be2_exam_pass_1.repository.ComputerRepository;
import com.example.be2_exam_pass_1.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ComputerService implements IComputerService{
    @Autowired
    private ComputerRepository computerRepository;


    @Override
    public Iterable<Computer> findAll() {
        return computerRepository.findAll();
    }

    @Override
    public Optional<Computer> findById(Long id) {
        return computerRepository.findById(id);
    }

    @Override
    public Computer save(Computer computer) {
        return computerRepository.save(computer);
    }

    @Override
    public void remove(Long id) {
        computerRepository.deleteById(id);
    }

    @Override
    public Optional<Computer> findByName(String name) {
        return computerRepository.findByFullNameContaining(name);
    }
}

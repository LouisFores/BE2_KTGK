package com.example.be2_exam_pass_1.controller;

import com.example.be2_exam_pass_1.model.Computer;
import com.example.be2_exam_pass_1.model.Staff;
import com.example.be2_exam_pass_1.service.ComputerService;
import com.example.be2_exam_pass_1.service.IComputerService;
import com.example.be2_exam_pass_1.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/computers")
public class ComputerController {


    @Autowired
    private IComputerService iComputerService;


    @GetMapping
    public ResponseEntity<Iterable<Computer>> findAllComputer() {
        List<Computer> computerList = (List<Computer>) iComputerService.findAll();
        if (computerList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(computerList, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Computer> findComputerById(@PathVariable Long id) {
        Optional<Computer> computerOptional = iComputerService.findById(id);
        if (!computerOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(computerOptional.get(), HttpStatus.OK);
    }

    @GetMapping("/searchByName")
    public ResponseEntity searchByName(@RequestParam String name){
        Optional<Computer> computer = iComputerService.findByName(name);
        if (computer.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(computer, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Computer> saveComputer(@RequestBody Computer computer) {
        return new ResponseEntity<>(iComputerService.save(computer), HttpStatus.CREATED);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Computer> updateComputer(@PathVariable Long id, @RequestBody Computer computer) {
        Optional<Computer> computerOptional = iComputerService.findById(id);
        if (!computerOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        computer.setId(computerOptional.get().getId());
        return new ResponseEntity<>(iComputerService.save(computer), HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Computer> deleteComputer(@PathVariable Long id) {
        Optional<Computer> computerOptional = iComputerService.findById(id);
        if (!computerOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iComputerService.remove(id);
        return new ResponseEntity<>(computerOptional.get(), HttpStatus.OK);
    }


}

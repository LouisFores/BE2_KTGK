package com.example.be2_exam_pass_1.controller;

import javax.persistence.*;

import com.example.be2_exam_pass_1.model.Staff;
import com.example.be2_exam_pass_1.repository.StaffRepository;
import com.example.be2_exam_pass_1.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/staffs")
public class StaffController {


    @Autowired
    private IStaffService iStaffService;


    @GetMapping
    public ResponseEntity<Iterable<Staff>> findAllStaff() {
        List<Staff> staffList = (List<Staff>) iStaffService.findAll();
        if (staffList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(staffList, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Staff> findStaffById(@PathVariable Long id) {
        Optional<Staff> staffOptional = iStaffService.findById(id);
        if (!staffOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(staffOptional.get(), HttpStatus.OK);
    }

    @GetMapping("/searchByName")
    public ResponseEntity searchByName(@RequestParam String name){
        Optional<Staff> staff = iStaffService.findByName(name);
        if (staff.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(staff, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Staff> saveStaff(@RequestBody Staff staff) {
        return new ResponseEntity<>(iStaffService.save(staff), HttpStatus.CREATED);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Staff> updateStaff(@PathVariable Long id, @RequestBody Staff staff) {
        Optional<Staff> staffOptional = iStaffService.findById(id);
        if (!staffOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        staff.setId(staffOptional.get().getId());
        return new ResponseEntity<>(iStaffService.save(staff), HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Staff> deleteStaff(@PathVariable Long id) {
        Optional<Staff> staffOptional = iStaffService.findById(id);
        if (!staffOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iStaffService.remove(id);
        return new ResponseEntity<>(staffOptional.get(), HttpStatus.OK);
    }


}

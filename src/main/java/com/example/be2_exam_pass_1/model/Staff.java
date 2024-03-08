package com.example.be2_exam_pass_1.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String fullName;
    private int age;
    private String gender;
    private int birthday;
    private String address;
    private String numberPhone;
    private String email;
    private String department; //Phòng ban
    private String position; //Chức vụ
    private String wage; //Lương
    private String firstDayStartWork; //Ngày đầu làm việc
    private String statusWorking; //Trạng thái làm việc
    private String insuranceInformation; //Thông tin bảo hiểm


    public Staff() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public String getFirstDayStartWork() {
        return firstDayStartWork;
    }

    public void setFirstDayStartWork(String firstDayStartWork) {
        this.firstDayStartWork = firstDayStartWork;
    }

    public String getStatusWorking() {
        return statusWorking;
    }

    public void setStatusWorking(String statusWorking) {
        this.statusWorking = statusWorking;
    }

    public String getInsuranceInformation() {
        return insuranceInformation;
    }

    public void setInsuranceInformation(String insuranceInformation) {
        this.insuranceInformation = insuranceInformation;
    }

    public Staff(Long id, String fullName, int age, String gender, int birthday, String address, String numberPhone, String email, String department, String position, String wage, String firstDayStartWork, String statusWorking, String insuranceInformation) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.numberPhone = numberPhone;
        this.email = email;
        this.department = department;
        this.position = position;
        this.wage = wage;
        this.firstDayStartWork = firstDayStartWork;
        this.statusWorking = statusWorking;
        this.insuranceInformation = insuranceInformation;
    }
}

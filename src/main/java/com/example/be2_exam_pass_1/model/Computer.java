package com.example.be2_exam_pass_1.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "computer")
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    @NotBlank
    private String type; //Loại máy tính
    private String systemComputer; //Hệ điều hành
    private String cpu;
    @NotBlank
    private String ram;
    private String memory; //Bộ nhớ trong
    private String card; //Card đồ hoạ
    private String screen; //Màn hình
    private String price; //Giá bán
    private String dateManuFacture; //Ngày sản xuất
    private String statusComputer; //Trạng thái
    private String description; //Mô tả

    public Computer() {
    }

    public Computer(Long id, String name, String brand, String type, String systemComputer, String cpu, String ram, String memory, String card, String screen, String price, String dateManuFacture, String statusComputer, String describe) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.systemComputer = systemComputer;
        this.cpu = cpu;
        this.ram = ram;
        this.memory = memory;
        this.card = card;
        this.screen = screen;
        this.price = price;
        this.dateManuFacture = dateManuFacture;
        this.statusComputer = statusComputer;
        this.description = describe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSystemComputer() {
        return systemComputer;
    }

    public void setSystemComputer(String systemComputer) {
        this.systemComputer = systemComputer;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDateManuFacture() {
        return dateManuFacture;
    }

    public void setDateManuFacture(String dateManuFacture) {
        this.dateManuFacture = dateManuFacture;
    }

    public String getStatusComputer() {
        return statusComputer;
    }

    public void setStatusComputer(String statusComputer) {
        this.statusComputer = statusComputer;
    }

    public String getDescribe() {
        return description;
    }

    public void setDescribe(String describe) {
        this.description = describe;
    }
}

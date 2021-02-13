package org.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

public class Car implements Serializable {
    private UUID carId;
    private String regNumber;
    private String brand;
    private String model;
  @JsonFormat(shape =JsonFormat.Shape.STRING )
    private LocalDate regDate;
    private Owner owner;




    public Car(String regNumber) {
        this.regNumber = regNumber;
    }

    public Car(String regNumber, String brand, String model) {
        this.regNumber = regNumber;
        this.brand = brand;
        this.model = model;
    }

    public Car(String regNumber, String brand, String model, LocalDate regDate, Owner owner) {
        this.carId = UUID.randomUUID();
        this.regNumber = regNumber;
        this.brand = brand;
        this.model = model;
        this.regDate = regDate;
        this.owner = owner;
    }

    public UUID getCarId() {
        return carId;
    }

    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", regNumber=" + regNumber +
                ", brand='" + brand + '\'' +
                ", model=" + model +
                ", regDate=" + regDate +
                ", owner=" + owner +
                '}';
    }
}

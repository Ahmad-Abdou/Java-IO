package org.example.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

public class Owner implements Serializable {
    private UUID OwnerID;
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate birthDay;

    public Owner() {
    }

    public Owner(String name, LocalDate birthDay) {
        this.OwnerID = UUID.randomUUID();
        this.name = name;
        this.birthDay = birthDay;
    }

    public UUID getOwnerID() {
        return OwnerID;
    }

    public void setOwnerID(UUID ownerID) {
        OwnerID = ownerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "OwnerID=" + OwnerID +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}

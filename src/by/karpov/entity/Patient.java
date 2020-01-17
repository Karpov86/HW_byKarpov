package by.karpov.entity;

import java.util.Date;

public class Patient extends Person {

    public Patient(String id, String name, String surname, String address, Date birthDate, Sex sex, Clinic clinic, Insurance insurance) {
        super(id, name, surname, address, birthDate, sex, clinic, insurance);
    }

}

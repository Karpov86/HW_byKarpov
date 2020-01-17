package by.karpov.entity;

import java.util.Date;

public class TechnicalStaff extends Person {

    public TechnicalStaff(String id, String name, String surname, String address, Date birthDate, Sex sex, Clinic clinic, Insurance insurance) {
        super(id, name, surname, address, birthDate, sex, clinic, insurance);
    }

}

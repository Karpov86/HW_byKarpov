package by.karpov.entity;

import java.util.Date;

public class Nurse extends Employees {

    public Nurse(String id, String name, String surname, String address, Date birthDate, Sex sex, Clinic clinic, Insurance insurance, int workExperience) {
        super(id, name, surname, address, birthDate, sex, clinic, insurance, workExperience);
    }
}

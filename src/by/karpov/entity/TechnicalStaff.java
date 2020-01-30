package by.karpov.entity;

import java.util.Date;

public class TechnicalStaff extends Employees {

    public TechnicalStaff(int id, String name, String surname, String address, Date birthDate, Sex sex, Clinic clinic, int workExperience) {
        super(id, name, surname, address, birthDate, sex, clinic, workExperience);
    }
}

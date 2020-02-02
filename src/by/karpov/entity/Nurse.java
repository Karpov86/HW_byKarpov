package by.karpov.entity;

import java.util.Date;

public class Nurse extends Employees {

    public Nurse(int id, String name, String surname, String address, Date birthDate, Sex sex, int workExperience) {
        super(id, name, surname, address, birthDate, sex, workExperience);
    }
}

package by.karpov.entity;

import java.util.Date;

public abstract class Employees extends Person {

    private int workExperience;


    public Employees(int id, String name, String surname, String address, Date birthDate, Sex sex, Clinic clinic, int workExperience) {
        super(id, name, surname, address, birthDate, sex, clinic);
        this.workExperience = workExperience;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
}

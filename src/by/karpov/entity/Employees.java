package by.karpov.entity;

import java.util.Date;

public abstract class Employees extends Person {

    private int workExperience;


    public Employees(String id, String name, String surname, String address, Date birthDate, Sex sex, Clinic clinic, Insurance insurance, int workExperience) {
        super(id, name, surname, address, birthDate, sex, clinic, insurance);
        this.workExperience = workExperience;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
}

package by.karpov.entity;

import java.util.Date;

public class Nurse extends Person {

    private int workExperience;
    private Clinic clinic;

    public Nurse(String id, String name, String surname, String address, Date birthDate, Sex sex, Clinic clinic, Insurance insurance, int workExperience, Clinic clinic1) {
        super(id, name, surname, address, birthDate, sex, clinic, insurance);
        this.workExperience = workExperience;
        this.clinic = clinic1;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public Clinic getClinic() {
        return clinic;
    }

    @Override
    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }
}

package by.karpov.entity;

import java.util.Date;

public class Doctor extends Person {

    private Specialty specialty;
    private int workExperience;
    private Clinic clinic;

    public Doctor(String id, String name, String surname, String address, Date birthDate, Sex sex, Clinic clinic, Insurance insurance, Specialty specialty, int workExperience, Clinic clinic1) {
        super(id, name, surname, address, birthDate, sex, clinic, insurance);
        this.specialty = specialty;
        this.workExperience = workExperience;
        this.clinic = clinic1;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
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

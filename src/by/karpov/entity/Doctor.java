package by.karpov.entity;

import java.util.Date;

public class Doctor extends Employees {

    private Specialty specialty;

    public Doctor(String id, String name, String surname, String address, Date birthDate, Sex sex, Clinic clinic, Insurance insurance, int workExperience, Specialty specialty) {
        super(id, name, surname, address, birthDate, sex, clinic, insurance, workExperience);
        this.specialty = specialty;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }
}

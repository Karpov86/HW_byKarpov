package by.karpov.entity;

import java.util.Objects;

public class Doctor extends Person {

    private int workExperience;
    private Specialty specialty;

    public Doctor(String name, String surname, String address, Sex sex, int workExperience, Specialty specialty) {
        super(name, surname, address, sex);
        this.workExperience = workExperience;
        this.specialty = specialty;
    }

    public Doctor() {

    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return specialty == doctor.specialty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specialty);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "workExperience=" + workExperience +
                ", specialty=" + specialty +
                '}';
    }
}

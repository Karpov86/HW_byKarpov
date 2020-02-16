package by.karpov.entity;

import java.util.Objects;

public abstract class Employees extends Person {

    private int workExperience;


    public Employees(String name, String surname, String address, Sex sex, int workExperience) {
        super(name, surname, address, sex);
        this.workExperience = workExperience;
    }


    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employees employees = (Employees) o;
        return workExperience == employees.workExperience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), workExperience);
    }
}

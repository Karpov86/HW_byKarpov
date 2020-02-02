package by.karpov.entity;

import java.util.Date;

public class Patient extends Person {

    private Insurance insurance;

    public Patient(int id, String name, String surname, String address, Date birthDate, Sex sex, Insurance insurance) {
        super(id, name, surname, address, birthDate, sex);
        this.insurance = insurance;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
}

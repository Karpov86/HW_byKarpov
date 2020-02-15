package by.karpov.entity;

import java.util.Date;
import java.util.Objects;

public class Patient extends Person {

    private Insurance insurance;

    public Patient(Long id, String name, String surname, String address, Sex sex, Insurance insurance) {
        super(id, name, surname, address, sex);
        this.insurance = insurance;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(insurance, patient.insurance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), insurance);
    }
}

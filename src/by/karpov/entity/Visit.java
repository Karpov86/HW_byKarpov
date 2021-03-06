package by.karpov.entity;

import java.sql.Date;
import java.util.Objects;

public class Visit {
    private Long id;
    private Date date;
    private Doctor doctor;
    private Patient patient;

    public Visit(Date date, Doctor doctor, Patient patient) {
        this.date = date;
        this.doctor = doctor;
        this.patient = patient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visit visit = (Visit) o;
        return Objects.equals(id, visit.id) &&
                Objects.equals(date, visit.date) &&
                Objects.equals(doctor, visit.doctor) &&
                Objects.equals(patient, visit.patient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, doctor, patient);
    }

    @Override
    public String toString() {
        return "Visit{" +
                "id=" + id +
                ", date=" + date +
                ", doctor=" + doctor +
                ", patient=" + patient +
                '}';
    }
}

package by.karpov.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Visit {
    private long id;
    private Date date;
    private List<Doctor> doctors = new ArrayList();
    private List<Patient> patients = new ArrayList();

    public Visit(long id, Date date, List<Doctor> doctors, List<Patient> patients) {
        this.id = id;
        this.date = date;
        this.doctors = doctors;
        this.patients = patients;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}

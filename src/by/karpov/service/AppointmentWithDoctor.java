package by.karpov.service;

import by.karpov.entity.Doctor;
import by.karpov.entity.Patient;

import java.util.Date;

public interface AppointmentWithDoctor {

    boolean appointment(Patient patient, Doctor doctor, Date date);
}

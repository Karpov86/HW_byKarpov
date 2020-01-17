package by.karpov.service;

import by.karpov.entity.Doctor;
import by.karpov.entity.Patient;

public interface AppointmentWithDoctor {

    boolean appointment(Patient patient, Doctor doctor);
}

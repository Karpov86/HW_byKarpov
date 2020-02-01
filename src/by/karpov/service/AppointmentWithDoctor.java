package by.karpov.service;

import by.karpov.entity.Doctor;
import by.karpov.entity.Patient;

import java.util.Date;

public interface AppointmentWithDoctor {

    boolean appointment(Doctor doctor, Date date);
}

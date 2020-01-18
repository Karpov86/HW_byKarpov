package by.karpov.service;

import by.karpov.entity.Doctor;
import by.karpov.entity.Patient;

import java.util.Date;

public class AppointmentWithDoctorImpl implements AppointmentWithDoctor {

    @Override
    public boolean appointment(Patient patient, Doctor doctor, Date date) {

        CheckDateAppointmentWithDoctorImpl checkDate = new CheckDateAppointmentWithDoctorImpl();
        if (checkDate.checkDate(date)) {
            System.out.println("Вы записаны к " + doctor + "прием " + date);
            return true;
        }
        return false;
    }
}

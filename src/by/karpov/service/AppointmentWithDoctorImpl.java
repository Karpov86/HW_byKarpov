package by.karpov.service;

import by.karpov.entity.Doctor;
import by.karpov.entity.Patient;

import java.util.Date;

public class AppointmentWithDoctorImpl implements AppointmentWithDoctor {

    @Override
    public boolean appointment(Doctor doctor, Date date) {

        if (checkDate(date)) {
            System.out.println("Вы записаны к " + doctor.getSurname() + "прием " + date);
            return true;
        }
        return false;
    }
    private boolean checkDate(Date date) {
        // запрос в БД 'Visits', если дата свободна возвращаем true
        return false;
    }
}

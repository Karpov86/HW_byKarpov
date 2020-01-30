package by.karpov.service;

import by.karpov.entity.Doctor;
import by.karpov.entity.Patient;

import java.util.Date;

public class AppointmentWithDoctorImpl implements AppointmentWithDoctor {

    @Override
    public boolean appointment(Patient patient, Doctor doctor, Date date) {

        if (checkDate(date)) {
            System.out.println("Вы записаны к " + doctor + "прием " + date);
            return true;
        }
        return false;
    }
    private boolean checkDate(Date date) {
        // в параметрах нужна дата ввиде месяц/день и время час/минуты, далее открывается конкретная карта,
        // где К это время, а V наличие "талончика"(1 - есть талон,
        // -1 нет талона.
        return false;
    }
}

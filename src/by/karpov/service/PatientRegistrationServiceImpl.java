package by.karpov.service;

import by.karpov.entity.Patient;

import java.util.Date;

public class PatientRegistrationServiceImpl implements PatientRegistrationService {

    @Override
    public boolean register(Patient patient) {

        Date localDate = new Date();
        Date birthDate = patient.getBirthDate();
        long age = (birthDate.getTime() - localDate.getTime()) / (24 * 60 * 60 * 1000);
        return patient.getInsurance() != null && age >= (18 * 365 + 5) || age >= (18 * 365 + 4);
    }
}

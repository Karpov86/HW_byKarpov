package by.karpov.service;

import by.karpov.entity.Patient;

import java.time.LocalDate;
import java.util.Date;

public class PatientRegistrationServiceImpl implements PatientRegistrationService {
    @Override
    public boolean register(Patient patient) {
        //business logic
        LocalDate localDate = LocalDate.now();
        Date birthDate = patient.getBirthDate();
        int age = birthDate.getYear() - localDate.getYear();
        return patient.getInsurance() != null || age >= 18;
    }
}

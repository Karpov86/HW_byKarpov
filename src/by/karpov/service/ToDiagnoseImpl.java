package by.karpov.service;

import by.karpov.entity.Doctor;
import by.karpov.entity.Patient;

public class ToDiagnoseImpl implements ToDiagnose {

    @Override
    public String diagnosis(Patient patient, Doctor doctor) {

        String diagnose;
        diagnose = patient.getSurname() + " " + patient.getName() + " Some diagnose, recommendations, \n" +
                "treatment." + doctor.getSurname() + doctor.getName();
        return diagnose;
    }
}

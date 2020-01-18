package by.karpov.service;

import by.karpov.entity.Doctor;
import by.karpov.entity.Patient;

public interface ToDiagnose {

    String diagnosis(Patient patient, Doctor doctor);
}

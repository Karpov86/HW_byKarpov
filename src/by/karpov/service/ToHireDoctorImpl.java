package by.karpov.service;

public class ToHireDoctorImpl implements ToHireEmployees {

    @Override
    public boolean ToHire(Employees employees, int requiredWorkExperience) {

        if (employees.getWorkExperience() < requiredWorkExperience) {
            return false;
        }
        return true;
    }
}

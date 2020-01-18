package by.karpov.service;

import by.karpov.entity.Employees;

public class ToHireNurseImpl implements ToHireEmployees {

    @Override
    public boolean ToHire(Employees employees, int requiredWorkExperience) {

        if (employees.getWorkExperience() < requiredWorkExperience) {
            return false;
        }
        return true;
    }
}

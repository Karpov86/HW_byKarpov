package by.karpov.transactions.dao;

import by.karpov.entity.Doctor;
import by.karpov.entity.Patient;

public class VisitDaoImpl implements VisitDao <Doctor, Patient> {

    @Override
    public boolean save(Doctor entity1, Patient entity2) {
        return false;
    }

    @Override
    public void read() {

    }

    @Override
    public boolean update(Long id, String string) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}

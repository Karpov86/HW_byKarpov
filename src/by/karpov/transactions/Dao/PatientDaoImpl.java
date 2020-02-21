package by.karpov.transactions.dao;

import by.karpov.entity.Patient;
import by.karpov.transactions.connection.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PatientDaoImpl implements PersonDao <Patient> {
    private static PatientDaoImpl INSTANCE;

    private PatientDaoImpl() {
    }

    public static PatientDaoImpl newInstance() {
        if (INSTANCE == null) {
            synchronized (PatientDaoImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new PatientDaoImpl();
                }
            }
        }
        return INSTANCE;
    }

    public boolean save(Patient patient) {

        try (Connection connection = ConnectionManager.newConnection()) {
            String sql = "INSERT INTO patients (name, surname, address, sex) VALUES (?, ?, ?, ?);";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, patient.getName());
            statement.setString(2, patient.getSurname());
            statement.setString(3, patient.getAddress());
            statement.setString(4, String.valueOf(patient.getSex()));
            statement.executeUpdate();

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
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
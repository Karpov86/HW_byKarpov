package by.karpov.transactions.Dao;

import by.karpov.entity.Patient;
import by.karpov.transactions.connection.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PatientDao {
    private static PatientDao INSTANCE;

    private PatientDao(){}

    public static PatientDao newInstance() {
        if (INSTANCE == null) {
            synchronized (PatientDao.class) {
                if (INSTANCE == null) {
                    INSTANCE = new PatientDao();
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
}

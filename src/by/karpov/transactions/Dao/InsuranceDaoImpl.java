package by.karpov.transactions.dao;

import by.karpov.entity.Insurance;
import by.karpov.entity.Patient;
import by.karpov.transactions.connection.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsuranceDaoImpl implements InsuranceDao <Insurance, Patient> {
    private static InsuranceDaoImpl INSTANCE;

    private InsuranceDaoImpl() {
    }

    public static InsuranceDaoImpl newInstance() {

        if (INSTANCE == null) {
            synchronized (InsuranceDaoImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new InsuranceDaoImpl();
                }
            }
        }
        return INSTANCE;
    }

    public boolean save(Insurance insurance, Patient patient) {

        try (Connection connection = ConnectionManager.newConnection()) {
            String sql = "INSERT INTO insurance (date_from, date_to, patient_id) VALUES (?, ?, ?);";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, String.valueOf(insurance.getDateFrom()));
            statement.setString(2, String.valueOf(insurance.getDateTo()));
            statement.setLong(3, insurance.getId());
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

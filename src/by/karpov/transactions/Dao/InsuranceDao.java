package by.karpov.transactions.Dao;

import by.karpov.entity.Insurance;
import by.karpov.entity.Patient;
import by.karpov.transactions.connection.ConnectionManager;

import java.sql.*;

public class InsuranceDao {
    private static InsuranceDao INSTANCE;

    private InsuranceDao() {}

    public static InsuranceDao newInstance(){

        if (INSTANCE == null){
            synchronized (InsuranceDao.class){
                if (INSTANCE == null) {
                    INSTANCE = new InsuranceDao();
                }
            }
        }
        return INSTANCE;
    }

    public boolean save(Insurance insurance, Patient patient) {

        try(Connection connection = ConnectionManager.newConnection()) {
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
}

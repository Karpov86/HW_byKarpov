package by.karpov.transactions.dao;

import by.karpov.entity.Doctor;
import by.karpov.transactions.connection.ConnectionManager;

import java.sql.*;

public class DoctorDao {

    private static DoctorDao INSTANCE;

    private DoctorDao() {
    }

    public static DoctorDao newInstance() {
        if (INSTANCE == null) {
            synchronized (DoctorDao.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoctorDao();
                }
            }
        }
        return INSTANCE;
    }

    public boolean save(Doctor doctor) {

        try (Connection connection = ConnectionManager.newConnection()) {
            String sql = "INSERT INTO doctors (name, surname, address, sex, speciality, work_experience) VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, doctor.getName());
            statement.setString(2, doctor.getSurname());
            statement.setString(3, doctor.getAddress());
            statement.setString(4, String.valueOf(doctor.getSex()));
            statement.setString(5, String.valueOf(doctor.getSpecialty()));
            statement.setInt(6, doctor.getWorkExperience());
            statement.executeUpdate();

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean update(Long id, String newAddress) {

        try (Connection connection = ConnectionManager.newConnection()) {
            PreparedStatement statement = connection.prepareStatement("UPDATE doctors SET address = ? WHERE id = ?;");
            statement.setString(1, newAddress);
            statement.setLong(2, id);
            statement.executeUpdate();

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean delete(Long id) {

        try (Connection connection = ConnectionManager.newConnection()) {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM doctors WHERE id = ?;");
            statement.setLong(1, id);
            statement.executeUpdate();

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void read() {

        try (Connection connection = ConnectionManager.newConnection()) {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM doctors;");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("name") + " " + resultSet.getString("surname")
                        + "\naddress: " + resultSet.getString("address") + "\nsex: " + resultSet.getString("sex") + ", speciality: " +
                        resultSet.getString("speciality") + "\nwork experience " + resultSet.getInt("work_experience") + " years");
                System.out.println("===========================================================");
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

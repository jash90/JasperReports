/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasperreports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ZimnY
 */
public class JDBC {

    public static ResultSet result(String zapytanie) {
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost/facebook", "postgres", "krosno2016");
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(zapytanie);
            return resultSet;

        } catch (SQLException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
        return null;

    }

    public static ResultSet resultf(String zapytanie) {
        Connection connection = null;
        ResultSet resultSet = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost/faktury", "postgres", "krosno2016");
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(zapytanie);
            return resultSet;

        } catch (SQLException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
        return null;

    }
}

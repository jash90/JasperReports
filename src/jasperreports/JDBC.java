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
import javafx.scene.control.Alert;

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
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z połączeniem z bazą. " + e.getLocalizedMessage());
            alert.showAndWait();
            System.out.println("Problem z połączeniem z bazą. " + e.getLocalizedMessage());

        } catch (ClassNotFoundException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z połączeniem z bazą. " + e.getLocalizedMessage());
            alert.showAndWait();
            System.out.println("Problem z połączeniem z bazą. " + e.getLocalizedMessage());

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
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z połączeniem z bazą. " + e.getLocalizedMessage());
            alert.showAndWait();
            System.out.println("Problem z połączeniem z bazą. " + e.getLocalizedMessage());

        } catch (ClassNotFoundException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText(null);
            alert.setContentText("Problem z połączeniem z bazą. " + e.getLocalizedMessage());
            alert.showAndWait();
            System.out.println("Problem z połączeniem z bazą. " + e.getLocalizedMessage());

        }
        return null;

    }
}

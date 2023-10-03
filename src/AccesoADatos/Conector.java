/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author charl
 */
public class Conector {

    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String DB_ = "proyecto-final";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection conector;

    public Conector() {
    }

    public static Connection getConnection() {
        if (conector == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conector = DriverManager.getConnection(URL + DB_, USUARIO, PASSWORD);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
            }

        }
        return conector;
    }

}

package dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anton
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionOracle {
    
    // Define las credenciales como constantes (buenas prácticas)
    private static final String URL = "jdbc:oracle:thin:@192.168.1.139:1521/XEPDB1"; // o @localhost...
    private static final String USUARIO = "boton";
    private static final String CONTRASENA = "boton123";

    /**
     * Devuelve una conexión activa a la base de datos Oracle.
     * @return Connection
     * @throws SQLException Si hay un error de conexión (usuario, contraseña, URL).
     */
    public static Connection getConnection() throws SQLException {
        // DriverManager.getConnection intenta establecer la conexión.
        // Si tiene éxito, devuelve un objeto Connection.
        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
    }
    
    // Puedes mantener el método main para pruebas rápidas de conexión:
    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            System.out.println("Conexion exitosa a Oracle!");
        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

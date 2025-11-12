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
    public static void main(String[] args){
        String url = "jdbc:oracle:thin:@192.168.1.139:1521/XEPDB1"; // o @localhost:1521/XEPDB1
        String usuario = "boton";
        String contraseña = "boton123";
        
        try (Connection conn = DriverManager.getConnection(url, usuario, contraseña)) {
            System.out.println("Conexion exitosa a Oracle");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }
}

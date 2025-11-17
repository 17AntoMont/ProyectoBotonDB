/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author anton
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BotonLogDAO {
    
    public void insertarMensaje(Connection conn, String mensaje) throws SQLException {
        String sql = "INSERT INTO BOTON_LOG (MENSAJE) VALUES (?)";
        
        try (java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)){
           
       
        pstmt.setString(1, mensaje);
        pstmt.executeUpdate();
        
        System.out.println("Registro insertado correctamente.");
        }  
    }
}

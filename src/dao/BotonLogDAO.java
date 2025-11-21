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
import java.sql.Timestamp;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class BotonLogDAO {
    
    public void insertarMensaje(Connection conn, String mensaje) throws SQLException {
        String sql = "INSERT INTO BOTON_LOG (MENSAJE) VALUES (?)";
        
        try (java.sql.PreparedStatement pstmt = conn.prepareStatement(sql)){
           
       
        pstmt.setString(1, mensaje);
        pstmt.executeUpdate();
        
        System.out.println("Registro insertado correctamente.");
        }  
    }
    
    public List<BotonLog> obtenerRegistros(){
        List<BotonLog> lista = new ArrayList<>();
        
        String sql = "SELECT ID, FECHA, MENSAJE FROM BOTON_LOG ORDER BY ID DESC";
        
        try (Connection conn = ConexionOracle.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()){
            
            while (rs.next()){
                int id = rs.getInt("ID");
                Timestamp fecha = rs.getTimestamp("FECHA");
                String mensaje = rs.getString("MENSAJE");
                lista.add(new BotonLog(id, fecha, mensaje));
            }
            
        } catch (SQLException e){
            System.out.println("Error obteniendo registros: " + e.getMessage());
        }
        
        return lista;
    }
    
    public void limpiarRegistros(Connection conn) throws SQLException {
        String sql = "DELETE FROM BOTON_LOG";
        try (PreparedStatement ps = conn.prepareStatement(sql)){
            ps.executeUpdate();
        }
    }
}

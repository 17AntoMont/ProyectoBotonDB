package dao;


import java.sql.Timestamp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anton
 */


public class BotonLog {
    
    private int id;
    private Timestamp fecha;
    private String mensaje;
    
    public BotonLog(int id, Timestamp fecha, String mensaje){
        this.id = id;
        this.fecha = fecha;
        this.mensaje = mensaje;
    }
    
    public int getId(){
        return id;
    }
    
    public Timestamp getFecha(){
        return fecha;
    }
    
    public String getMensaje(){
        return mensaje;
    }
    
    @Override
    
    public String toString(){
        return "ID: " + id + " | Fecha: " + fecha + " | Mensaje: " + mensaje;
    }
    
}


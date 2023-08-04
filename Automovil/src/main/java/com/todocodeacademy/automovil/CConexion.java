
package com.todocodeacademy.automovil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class CConexion {
    
    Connection conectar = null;
    String usuario = "root";
    String contrasenia = "root";
    String bd = "automovil";
    String ip = "localhost";
    String puerto ="3306";
    
    String cadena = "jdbc:mysql://" + ip + ":" + puerto +"/"+bd;
    
    public Connection estableceConexion(){
    try {
            
             
        Class.forName("com.mysql.jdbc.Driver");
        conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
        JOptionPane.showMessageDialog(null, "Se conectó a la base de datos  correctamente ");
                 
    } 
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se conectó a la base de datos, error: " + e.toString());
        }
    
    return conectar;
    }
    
}

package com.todocodeacademy.automovil;
import com.todocodeacademy.automovil.igu.Principal;

public class Automovil {

    public static void main(String[] args) {
      
        CConexion objetoConexion = new CConexion();
       // objetoConexion.estableceConexion();
        
        // llamamos y hacemos visible a nuestra igu
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
    }
}

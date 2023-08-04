
package com.todocodeacademy.automovil.persistencia;

import com.todocodeacademy.automovil.logica.Automovil;


public class ControladoraPersistencia {

    AutomovilJpaController autoJpa = new AutomovilJpaController();
    public void agregarAutomovil(Automovil auto) {
        
        autoJpa.create(auto);
        
    }       
}

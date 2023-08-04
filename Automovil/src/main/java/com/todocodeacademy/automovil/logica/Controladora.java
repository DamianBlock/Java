
package com.todocodeacademy.automovil.logica;
import com.todocodeacademy.automovil.persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    // se agrega el metodo desde AltaAutomovil
    public void agregarAutomovil(String modelo, String marca, String color, String motor, String patente, String placa, int cantPuertas) {
        
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setPlaca(placa);
        auto.setCantPuertas(cantPuertas);
              
        controlPersis.agregarAutomovil(auto);
    }
    
}



package com.todocodeacademy.automovil.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Automovil implements Serializable {
    @Id   
    @GeneratedValue(strategy=GenerationType.AUTO) // se mapea la clase para la persistencia
    
    private int id;
    private String modelo;
    private String marca;
    private String color;
    private String motor;
    private String patente;
    private String placa;
    private int cantPuertas;

    public Automovil(int id, String modelo, String marca, String color, String motor, String patente, String placa, int cantPuertas) {
       
        this.id = id;       
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.motor = motor;        
        this.patente = patente;
        this.placa = placa;
        this.cantPuertas = cantPuertas;
    }

    Automovil() {
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
   
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vhiculo;

/**
 *
 * @author Acer
 */
public class Vehiculo {
    private String ModeloVehiculo;
    private Pasajero pasajero;
    private Conductor conductor;

    public Vehiculo(Conductor conductor){ 
    this.conductor = conductor; 
    }
    
    public Vehiculo(Pasajero pasajero,Conductor conductor,
            String ModeloVehiculo)
    {
        this.pasajero = pasajero;
    }
    
    
    
    
    
    /**
     * @return the ModeloVehiculo
     */
    public String getModeloVehiculo() {
        return ModeloVehiculo;
    }

    /**
     * @param ModeloVehiculo the ModeloVehiculo to set
     */
    public void setModeloVehiculo(String ModeloVehiculo) {
        this.ModeloVehiculo = ModeloVehiculo;
    }

    /**
     * @return the pasajero
     */
    public Pasajero getPasajero() {
        return pasajero;
    }

    /**
     * @param pasajero the pasajero to set
     */
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    /**
     * @return the conductor
     */
    public Conductor getConductor() {
        return conductor;
    }

    /**
     * @param conductor the conductor to set
     */
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
}

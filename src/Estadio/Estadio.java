/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estadio;

/**
 *
 * @author Acer
 */
public class Estadio {
    private String NomEstadio;
    private Asientos asientos;
    private Espectador espectadores;
    
    public Estadio(Asientos asientos){ 
    this.asientos = asientos; 
    }
    
    public Estadio(Asientos asientoso,Espectador espectadores,
            String NomEstadio)
    {
        this.espectadores = espectadores;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cine;

/**
 *
 * @author Acer
 */
public class Cine {
    private String NomCine;
    private sala sala;
    private Espectadores espectadores;
    
    public Cine(sala sala){ 
    this.sala = sala; 
    }
    
    public Cine(sala sala,Espectadores espectadores,
            String NomCine)
    {
        this.espectadores = espectadores;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Museo;

/**
 *
 * @author Acer
 */
public class Museo {
    private String NombreMUseo;
    private Exhibicion exhibicion;
    private ObraARte obraarte;
    
    public Museo(Exhibicion exhibicion){ 
    this.exhibicion = exhibicion; 
    }
    
    public Museo(Exhibicion exhibicion, ObraARte obraarte,
            String NombreMUseo)    {
        this.obraarte = obraarte;
    }
}

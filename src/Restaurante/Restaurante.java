/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

/**
 *
 * @author Acer
 */
public class Restaurante {
    private String NombreREst;
    private Menú menu;
    private Comensal comensales;
    
    public Restaurante(Menú menu){ 
    this.menu = menu; 
    }
    
    public Restaurante(Menú menu,Comensal comensales,
            String NombreREst)    {
        this.comensales = comensales;
    }
}

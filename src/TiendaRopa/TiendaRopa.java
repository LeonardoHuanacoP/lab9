/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaRopa;

/**
 *
 * @author Acer
 */
public class TiendaRopa {
    private String NombreTienR;
    private Prenda prenda ;
    private Cliente clientes;
    
    public TiendaRopa(Prenda prenda){ 
    this.prenda = prenda; 
    }
    
    public TiendaRopa(Prenda prenda,Cliente clientes,
            String NombreTienR)    {
        this.clientes = clientes;
    }
}

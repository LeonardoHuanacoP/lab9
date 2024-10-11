/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServEntrega;

/**
 *
 * @author Acer
 */
public class ServicioEntr {
    private String NombreservicioEnt;
    private Paquete paquete ;
    private Cliente clientes;
    
    public ServicioEntr(Paquete paquete){ 
    this.paquete = paquete; 
    }
    
    public ServicioEntr(Paquete paquete,Cliente clientes,
            String NombreservicioEnt)    {
        this.clientes = clientes;
    }
}

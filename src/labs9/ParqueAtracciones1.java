/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labs9;

/**
 *
 * @author Acer
 */
public class ParqueAtracciones1 {

    private String nombrePArque;
    private Visitante1 visitante;
    private Atraccion1 atracciones;

    public ParqueAtracciones1(Atraccion1 atracciones){ 
    this.atracciones = atracciones; 
    }
    
    public ParqueAtracciones1(Atraccion1 atracciones,Visitante1 visitante,
            String nombrePArque)
    {
        this.visitante = visitante;
    
    }
    
    
    
    
    
    /**
     * @return the nombrePArque
     */
    public String getNombrePArque() {
        return nombrePArque;
    }

    /**
     * @param nombrePArque the nombrePArque to set
     */
    public void setNombrePArque(String nombrePArque) {
        this.nombrePArque = nombrePArque;
    }

    /**
     * @return the visitante
     */
    public Visitante1 getVisitante() {
        return visitante;
    }

    /**
     * @param visitante the visitante to set
     */
    public void setVisitante(Visitante1 visitante) {
        this.visitante = visitante;
    }

    /**
     * @return the atracciones
     */
    public Atraccion1 getAtracciones() {
        return atracciones;
    }

    /**
     * @param atracciones the atracciones to set
     */
    public void setAtracciones(Atraccion1 atracciones) {
        this.atracciones = atracciones;
    }
    

    
}

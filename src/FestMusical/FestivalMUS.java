/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FestMusical;

/**
 *
 * @author Acer
 */
public class FestivalMUS {
    private String NomFest;
    private Escenario escenario;
    private Asistente asistente;
    
    public FestivalMUS(Escenario escenario){ 
    this.escenario = escenario; 
    }
    
    public FestivalMUS(Escenario escenario,Asistente asistente,
            String NomFest)
    {
        this.asistente = asistente;
    }
    
}

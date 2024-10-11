/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author Acer
 */
public class Hotel {
    private String NomHotel;
    private Habitacion habitacion;
    private Reservacion reservaciones;
    
    public Hotel(Habitacion habitacion){ 
    this.habitacion = habitacion; 
    }
    
    public Hotel(Habitacion habitacion,Reservacion reservaciones,
            String NomHotel)
    {
        this.reservaciones = reservaciones;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JHON ROSAS
 */
import java.time.LocalDate;

public class Alquiler {
    private Cliente cliente;
    private Barco barco;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int posicionAmarre;
    
    // Constructor que recibe los datos del alquiler
    public Alquiler(Cliente cliente, Barco barco, LocalDate fechaInicio, LocalDate fechaFin, int posicionAmarre) {
        this.cliente = cliente;
        this.barco = barco;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.posicionAmarre = posicionAmarre;
    }
    
    // Método para calcular el costo del alquiler
    public double calcularCostoAlquiler() {
        long diasOcupacion = fechaInicio.until(fechaFin).getDays();
        double costoDiario = 25000;
        double impuestos = 10000; // Suponiendo un valor fijo de impuestos
        
        return (diasOcupacion * costoDiario) + impuestos;
    }

}
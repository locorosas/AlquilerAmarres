/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JHON ROSAS
 */
public class Barco {
    private String matricula;
    private double eslora;
    private int anoFabricacion;
    
    // Constructor que recibe los datos del barco
    public Barco(String matricula, double eslora, int anoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
    }

    // Método para obtener la matrícula del barco
    public String getMatricula() {
        return matricula;
    }

    // Método para obtener la eslora del barco
    public double getEslora() {
        return eslora;
    }

    // Método para obtener el año de fabricación del barco
    public int getAnoFabricacion() {
        return anoFabricacion;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JHON ROSAS
 */
public class Cliente {
    private String nombre;
    private int cantidadClientes;
    
    // Constructor que recibe los datos del cliente
    public Cliente(String nombre, int cantidadClientes) {
        this.nombre = nombre;
        this.cantidadClientes = cantidadClientes;
    }

    // Método para obtener el nombre del cliente
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la cantidad de clientes
    public int getCantidadClientes() {
        return cantidadClientes;
    }
}
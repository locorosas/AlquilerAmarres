/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JHON ROSAS
 */
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar datos del cliente
        System.out.println("Ingrese datos del cliente:");
        System.out.print("Nombre: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Cantidad de clientes: ");
        int cantidadClientes = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        
        Cliente cliente = new Cliente(nombreCliente, cantidadClientes);
        
        // Solicitar datos del barco
        System.out.println("\nIngrese datos del barco:");
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Eslora: ");
        double eslora = scanner.nextDouble();
        System.out.print("Año de fabricación: ");
        int anoFabricacion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        
        Barco barco = new Barco(matricula, eslora, anoFabricacion);
        
        // Solicitar datos del alquiler
        System.out.println("\nIngrese datos del alquiler:");
        System.out.print("Fecha de inicio (YYYY-MM-DD): ");
        String fechaInicioStr = scanner.nextLine();
        LocalDate fechaInicio = LocalDate.parse(fechaInicioStr);
        System.out.print("Fecha de fin (YYYY-MM-DD): ");
        String fechaFinStr = scanner.nextLine();
        LocalDate fechaFin = LocalDate.parse(fechaFinStr);
        System.out.print("Posición del amarre: ");
        int posicionAmarre = scanner.nextInt();
        
        Alquiler alquiler = new Alquiler(cliente, barco, fechaInicio, fechaFin, posicionAmarre);
        
        // Calcular y mostrar el costo del alquiler
        double costoAlquiler = alquiler.calcularCostoAlquiler();
        System.out.println("\nCosto del alquiler: $" + costoAlquiler);
        
        // Mostrar recibo de alquiler con todos los detalles
        System.out.println("\nRECIBO DE ALQUILER");
        System.out.println("==================");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Cantidad de clientes: " + cliente.getCantidadClientes());
        // Mostrar más detalles del cliente según necesidad
        System.out.println("Barco - Matrícula: " + barco.getMatricula());
        System.out.println("Eslora: " + barco.getEslora() + " metros");
        System.out.println("Año de fabricación: " + barco.getAnoFabricacion());
        // Mostrar más detalles del barco según necesidad
        System.out.println("Fechas de alquiler: " + fechaInicioStr + " a " + fechaFinStr);
        System.out.println("Posición del amarre: " + posicionAmarre);
        System.out.println("Costo del alquiler: $" + costoAlquiler);
        
        scanner.close();
    }
}
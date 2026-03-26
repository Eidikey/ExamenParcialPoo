package app;

import java.util.Scanner;
import modelo.*;
import inventario.Inventario;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario miTienda = new Inventario();
        int opcionMenu = 0;

        System.out.println("--- SISTEMA DE GESTIÓN DE INVENTARIO ---");

        while (opcionMenu != 5) {
            System.out.println("\nMENÚ PRINCIPAL:");
            System.out.println("1. Registrar Producto Físico");
            System.out.println("2. Registrar Producto Digital");
            System.out.println("3. Listar Inventario");
            System.out.println("4. Ver Valor Total");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcionMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcionMenu) {
                case 1:
                    System.out.println("\n-- Registro de Producto Físico --");
                    System.out.print("ID del producto: "); 
                    String idFisico = scanner.nextLine();
                    System.out.print("Nombre comercial: "); 
                    String nombreFisico = scanner.nextLine();
                    System.out.print("Precio base de venta: "); 
                    double precioBaseFisico = scanner.nextDouble();
                    System.out.print("Cantidad en stock: "); 
                    int stockFisico = scanner.nextInt();
                    System.out.print("Peso del paquete (kg): "); 
                    double pesoKilogramos = scanner.nextDouble();
                    System.out.print("Costo de envío nacional: "); 
                    double costoEnvioFisico = scanner.nextDouble();
                    
                    Producto nuevoFisico = new ProductoFisico(idFisico, nombreFisico, precioBaseFisico, stockFisico, pesoKilogramos, costoEnvioFisico);
                    miTienda.agregarProducto(nuevoFisico);
                    System.out.println(">> Producto físico registrado exitosamente.");
                    break;

                case 2:
                    System.out.println("\n-- Registro de Producto Digital --");
                    System.out.print("ID del producto: "); 
                    String idDigital = scanner.nextLine();
                    System.out.print("Nombre del software/archivo: "); 
                    String nombreDigital = scanner.nextLine();
                    System.out.print("Precio base de licencia: "); 
                    double precioBaseDigital = scanner.nextDouble();
                    System.out.print("Licencias disponibles: "); 
                    int stockDigital = scanner.nextInt();
                    System.out.print("Tamaño del archivo (MB): "); 
                    double tamanoMegabytes = scanner.nextDouble();
                    System.out.print("Costo de activación de licencia: "); 
                    double costoLicenciaDigital = scanner.nextDouble();
                    
                    Producto nuevoDigital = new ProductoDigital(idDigital, nombreDigital, precioBaseDigital, stockDigital, tamanoMegabytes, costoLicenciaDigital);
                    miTienda.agregarProducto(nuevoDigital);
                    System.out.println(">> Producto digital registrado exitosamente.");
                    break;

                case 3:
                    System.out.println("\n--- REPORTE DE INVENTARIO ---");
                    miTienda.mostrarTodos();
                    break;

                case 4:
                    double valorTotalCalculado = miTienda.calcularValorTotal();
                    System.out.println("\nVALOR MONETARIO TOTAL: $" + valorTotalCalculado);
                    break;

                case 5:
                    System.out.println("Cerrando sesión en el sistema...");
                    break;

                default:
                    System.out.println("Error: La opción ingresada no existe.");
            }
        }
        scanner.close();
    }
}

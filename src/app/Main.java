package app;

import modelo.*;
import inventario.*;

public class Main {
    public static void main(String[] args) {
        Inventario miTienda = new Inventario();

        // 1. Creación de productos (Polimorfismo en acción)
        Producto laptop = new ProductoFisico("F01", "Laptop Gaming", 25000, 5, 2.5, 150);
        Producto curso = new ProductoDigital("D01", "Curso Java Avanzado", 500, 100, 1500, 50);

        // 2. Inserción en el inventario
        miTienda.agregarProducto(laptop);
        miTienda.agregarProducto(curso);

        // 3. Consulta de información y Polimorfismo
        System.out.println("=== LISTADO DE PRODUCTOS ===");
        miTienda.mostrarTodos();

        // 4. Cálculo de precios finales y valor total
        System.out.println("Valor total del inventario: $" + miTienda.calcularValorTotal());

        // 5. Búsqueda y actualización
        System.out.println("\nBuscando producto 'D01'...");
        Producto p = miTienda.buscarProducto("D01");
        if (p != null) {
            System.out.println("Encontrado: " + p.getNombre());
            miTienda.actualizarExistencias("D01", 80);
            System.out.println("Nueva cantidad disponible: " + p.getCantidadDisponible());
        }
    }
}

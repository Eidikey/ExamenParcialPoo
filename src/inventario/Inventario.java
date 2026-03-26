package inventario;

import modelo.Producto;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public Producto buscarProducto(String criterio) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(criterio) || p.getNombre().equalsIgnoreCase(criterio)) {
                return p;
            }
        }
        return null;
    }

    public void mostrarTodos() {
        for (Producto p : productos) {
            // Usamos el método que definiste en la clase abstracta
            p.mostrarInformacion();
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularPrecioFinal();
        }
        return total;
    }
    
    public void actualizarExistencias(String id, int nuevaCantidad) {
        Producto p = buscarProducto(id);
        if (p != null) {
            p.setCantidadDisponible(nuevaCantidad);
        }
    }
}

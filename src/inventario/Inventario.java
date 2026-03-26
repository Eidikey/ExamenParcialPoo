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
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            if (p.getId().equalsIgnoreCase(criterio) || p.getNombre().equalsIgnoreCase(criterio)) {
                return p;
            }
        }
        return null;
    }

    public void mostrarTodos() {
        for (int i = 0; i < productos.size(); i++) {
            productos.get(i).mostrarInformacion();
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total += productos.get(i).calcularPrecioFinal();
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

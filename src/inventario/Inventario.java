package inventario;

import modelo.Producto;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> listaDeProductos;

    public Inventario() {
        this.listaDeProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto nuevoProducto) {
        listaDeProductos.add(nuevoProducto);
    }

    public Producto buscarProducto(String criterioDeBusqueda) {
        for (int i = 0; i < listaDeProductos.size(); i++) {
            Producto productoEncontrado = listaDeProductos.get(i);
            if (productoEncontrado.getId().equalsIgnoreCase(criterioDeBusqueda) || 
                productoEncontrado.getNombre().equalsIgnoreCase(criterioDeBusqueda)) {
                return productoEncontrado;
            }
        }
        return null;
    }

    public void mostrarTodos() {
        for (int i = 0; i < listaDeProductos.size(); i++) {
            Producto productoAVisualizar = listaDeProductos.get(i);
            productoAVisualizar.mostrarInformacion();
        }
    }

    public double calcularValorTotal() {
        double montoTotalAcumulado = 0;
        for (int i = 0; i < listaDeProductos.size(); i++) {
            Producto productoParaSumar = listaDeProductos.get(i);
            montoTotalAcumulado += productoParaSumar.calcularPrecioFinal();
        }
        return montoTotalAcumulado;
    }

    public void actualizarExistencias(String idBuscado, int nuevaCantidadStock) {
        Producto productoAActualizar = buscarProducto(idBuscado);
        if (productoAActualizar != null) {
            productoAActualizar.setCantidadDisponible(nuevaCantidadStock);
        }
    }
}

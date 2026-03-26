abstract class Producto {

  private int id;
  private String nombre;
  private float precioBase;
  private int cantidadDisponible;

  double calcularPrecioFinal() {
    return precioBase;
  }

  void mostrarInformacion() {
    System.out.println("ID del producto: " + id + "Nombre del Producto: " + nombre + "Precio base: " + precioBase
        + "Cantidad Disponible: " + cantidadDisponible);
  }

}

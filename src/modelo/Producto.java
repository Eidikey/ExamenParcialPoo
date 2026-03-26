package modelo;

public abstract class Producto {
  protected String id;
  protected String nombre;
  protected double precioBase;
  protected int cantidadDisponible;

  public Producto(String id, String nombre, double precioBase, int cantidadDisponible) {
    this.id = id;
    this.nombre = nombre;
    setPrecioBase(precioBase);
    setCantidadDisponible(cantidadDisponible);
  }

  public abstract double calcularPrecioFinal();

  public abstract void mostrarInformacion();

  // Getters y Setters
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecioBase() {
    return precioBase;
  }

  public void setPrecioBase(double precioBase) {
    if (precioBase >= 0) {
      this.precioBase = precioBase;
    } else {
      System.err.println("Error: El precio base no puede ser negativo.");
      this.precioBase = 0;
    }
  }

  public int getCantidadDisponible() {
    return cantidadDisponible;
  }

  public void setCantidadDisponible(int cantidadDisponible) {
    if (cantidadDisponible >= 0) {
      this.cantidadDisponible = cantidadDisponible;
    } else {
      System.err.println("Error: La cantidad no puede ser negativa.");
      this.cantidadDisponible = 0;
    }
  }
}

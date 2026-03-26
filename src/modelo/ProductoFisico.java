package modelo;

public class ProductoFisico extends Producto {
  private double peso;
  private double costoEnvio;

  public ProductoFisico(String id, String nombre, double precioBase, int cantidadDisponible, double peso,
      double costoEnvio) {
    super(id, nombre, precioBase, cantidadDisponible);
    setPeso(peso);
    setCostoEnvio(costoEnvio);
  }

  @Override
  public double calcularPrecioFinal() {
    return precioBase + costoEnvio;
  }

  @Override
  public void mostrarInformacion() {
    System.out.println("TIPO: Producto Fisico");
    System.out.println("ID: " + id);
    System.out.println("Nombre: " + nombre);
    System.out.println("Stock: " + cantidadDisponible);
    System.out.println("Peso: " + peso + "kg");
    System.out.println("Costo Envio: $" + costoEnvio);
    System.out.println("Precio Final: $" + calcularPrecioFinal());
    System.out.println("---------------------------");
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    if (peso >= 0) {
      this.peso = peso;
    } else {
      this.peso = 0;
    }
  }

  public double getCostoEnvio() {
    return costoEnvio;
  }

  public void setCostoEnvio(double costoEnvio) {
    if (costoEnvio >= 0) {
      this.costoEnvio = costoEnvio;
    } else {
      this.costoEnvio = 0;
    }
  }
}

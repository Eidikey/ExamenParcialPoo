package modelo;

public class ProductoDigital extends Producto {
  private double tamanoMB;
  private double porcentajeLicencia;

  public ProductoDigital(String id, String nombre, double precioBase, int cantidadDisponible, double tamanoMB,
      double porcentajeLicencia) {
    super(id, nombre, precioBase, cantidadDisponible);
    setTamanoMB(tamanoMB);
    this.porcentajeLicencia = porcentajeLicencia;
  }

  @Override
  public double calcularPrecioFinal() {
    return precioBase + porcentajeLicencia;
  }

  @Override
  public void mostrarInformacion() {
    System.out.println("TIPO: Producto Fisico");
    System.out.println("ID: " + id);
    System.out.println("Nombre: " + nombre);
    System.out.println("Stock: " + cantidadDisponible);
    System.out.println("Peso: " + tamanoMB + "MB");
    System.out.println("POrcentaje Licencia: $" + porcentajeLicencia);
    System.out.println("Precio Final: $" + calcularPrecioFinal());
    System.out.println("---------------------------");
  }

  public double getTamanoMB() {
    return tamanoMB;
  }

  public void setTamanoMB(double tamanoMB) {
    if (tamanoMB >= 0) {
      this.tamanoMB = tamanoMB;
    } else {
      this.tamanoMB = 0;
    }
  }

  public double getPorcentajeLicencia() {
    return porcentajeLicencia;
  }

  public void setPorcentajeEnvio(double porcentajeLicencia) {
    if (porcentajeLicencia >= 0) {
      this.porcentajeLicencia = porcentajeLicencia;
    } else {
      this.porcentajeLicencia = 0;
    }
  }
}

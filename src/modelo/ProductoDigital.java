public class ProductoDigital extends Producto {
  private double tamanoMB;
  private double porcentajeLicencia;

  @Override
  double calcularPrecioFinal() {
    return super.calcularPrecioFinal() + porcentajeLicencia;
  }
}

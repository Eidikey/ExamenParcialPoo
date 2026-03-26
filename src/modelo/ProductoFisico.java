public class ProductoFisico extends Producto {
  private double peso;
  private double costoEnvio;

  @Override
  double calcularPrecioFinal() {
    return super.calcularPrecioFinal() + costoEnvio;
  }
}

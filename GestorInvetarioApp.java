public class GestorInvetarioApp {
    public static void main(String[] args){
        ArticuloInventario articulo = new ArticuloInventario("Laptop Pro", 12500.0, 8);

        CalculadoraInventario calculadora  = new CalculadoraInventario();

        double descuentoAplicado = 10.0;
        double totalFinal = calculadora.calcularTotalConDescuento(articulo, descuentoAplicado);

        System.out.println("Articulo: " + articulo.getNombre() + " | Stock: " + articulo.getCantidadStock());
        System.out.println("Total inventario valorizado $"+totalFinal);
    }
}

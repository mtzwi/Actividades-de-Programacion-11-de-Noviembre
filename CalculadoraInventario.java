public class CalculadoraInventario {
    
    public double calcularSubtutal(ArticuloInventario articulo){
        return articulo.getCantidadStock() * articulo.getPrecioUnitario();
    }
    public double calcularTotalConDescuento(ArticuloInventario articulo, double porcentajeDescuento){
        double subtotal = calcularSubtutal(articulo);
        double descuentoMonto = subtotal * (porcentajeDescuento/100.00);
        return subtotal - descuentoMonto;
    }
}

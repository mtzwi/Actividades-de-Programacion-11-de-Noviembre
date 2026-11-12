public class ArticuloInventario{
    private String nombre;
    private double precioUnitario;
    private int cantidadStock;

    public ArticuloInventario(String nombre, double precioUnitario, int cantidadStock){
        this.nombre = nombre;
        this.precioUnitario  = precioUnitario;
        this.cantidadStock = cantidadStock;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecioUnitario(){
        return precioUnitario;
    }
    public int getCantidadStock(){
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock){
        this.cantidadStock = cantidadStock;
    }
    public void setPrecioUnitario(double precioUnitario){
        this.precioUnitario = precioUnitario;
    }
}

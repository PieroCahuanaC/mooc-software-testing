package tudelft.Inventario;

public class Producto {

    private String nombre;
    private double precio;
    private int stock;
    private static int numProductos;

    public Producto(String nombre, double precio, int stock) { //Se crean los productos, pero aun no se registran en inventario
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre ingresado no es valido");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;

    }
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getStock(){
        return this.stock;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setStock(int stock){
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock;
    }
}

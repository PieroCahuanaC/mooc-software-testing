package tudelft.Tienda;

public class Abarrotes {
    private String nombre;
    private int stock;
    private double precio;

    public Abarrotes(String nombre, int stock, double precio){
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setStock (int stock){
        this.stock = stock;
    }
    public void setPrecio (double precio){
        this.precio = precio;
    }

    public String getNombre (){
        return this.nombre;
    }

    public int getStock (){
        return this.stock;
    }

    public double getPrecio(){
        return this.precio;
    }

    public String toString(){
        return "Producto: " + this.nombre + "Precio: " + this.precio + " Stock : " +this.stock;
    }
}

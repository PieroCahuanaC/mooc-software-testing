package tudelft.Inventario;

public class Main {
    public static void main (String[] args){


        Inventario inv = new Inventario();

        Producto leche = new Producto("Leche", 4,100);
        Producto azucar = new Producto("Azucar", 5,20);
        Producto fideos = new Producto("Fideos", 2,50);

        inv.agregarProducto(leche);
        inv.agregarProducto(azucar);
        inv.agregarProducto(fideos);

        inv.mostrarInventario();


    }
}

    package tudelft.Inventario;

    import java.util.ArrayList;

    public class Inventario {

        ArrayList<Producto> productos = new ArrayList<>();

        public void agregarProducto(Producto producto){
            if (producto.getPrecio()<1){
                throw new IllegalArgumentException("El precio ingresado es negativo o cero! ");
            }
            if (producto.getStock()<1){
                throw new IllegalArgumentException("El stock no es permitido");
            }

            productos.add(producto);
        }

        public void eliminarProducto(Producto producto){
            if (!productos.contains(producto)){
                throw new IllegalArgumentException("El producto que ingreso no existe en el inventario, no se puede eliminar");
            }
            productos.remove(producto);
        }

        public void mostrarInventario() {
            System.out.println("\n Inventario de Productos:");
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }

    }

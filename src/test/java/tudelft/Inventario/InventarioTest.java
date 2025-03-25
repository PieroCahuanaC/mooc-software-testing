package tudelft.Inventario;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class InventarioTest {

        private Inventario inv;
        private Producto leche;
        private Producto fideos;

        @BeforeEach
        public void initialize(){
            inv = new Inventario();
            leche = new Producto("Leche", 4,20);
            fideos = new Producto("Fideos", 2,40);
            inv.agregarProducto(leche); //0
            inv.agregarProducto(fideos); //1
        }

        //Metodo para probar si se agregaron correctamente un producto
        @Test
        public void testVerificarProducto(){
            assertEquals(2,inv.productos.size());
            assertEquals("Leche", inv.productos.get(0).getNombre());
            assertEquals("Fideos", inv.productos.get(1).getNombre());
        }

        @Test
        public void testAgregarProducto(){
            Producto azucar = new Producto("Azucar", 8,20);
            inv.agregarProducto(azucar);

            assertEquals(3,inv.productos.size());
            assertEquals("Azucar", inv.productos.get(2).getNombre());
        }

        //Metodo para probar si se elimina correctamente un producto
        @Test
        public void testEliminarProducto(){
            inv.eliminarProducto(fideos);
            assertEquals(1, inv.productos.size()); //debe ser 1, ya que aun hay un producto en el array
        }

        @Test
        public void testEliminarProductoInexistente() {
            Producto mantequilla = new Producto("Mantequilla", 10, 20); // no se agrega al inventario

            int tamañoInicial = inv.productos.size();
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                inv.eliminarProducto(mantequilla);
            });

            assertTrue(exception.getMessage().toLowerCase().contains("no existe") ||
                    exception.getMessage().toLowerCase().contains("inventario"));

            assertEquals(tamañoInicial, inv.productos.size());
        }

        //Metodo para probar si se modifican atributos de productos
        @Test
        public void testModificarProducto(){

            //le cambiamos el stock a la leche
            leche.setStock(15);
            assertEquals(15, inv.productos.get(0).getStock());

            //le cambiamos el precio a los fideos
            fideos.setPrecio(5);
            assertEquals(5,inv.productos.get(1).getPrecio());

        }

        @Test
        public void testProductoPrecioNegativo() {
            Producto huevos = new Producto("Huevos", -5, 20);

            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                inv.agregarProducto(huevos);
            });

            assertTrue(exception.getMessage().toLowerCase().contains("precio"));
        }

        @Test
            public void testProductoPrecioCero() {
                Producto huevos = new Producto("Huevos", 0, 20);

                Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                    inv.agregarProducto(huevos);
                });
                assertTrue(exception.getMessage().toLowerCase().contains("precio"));
            }

        @Test
            public void testSetStockNegativo() {
                leche.setStock(-5);
                assertEquals(-5, leche.getStock());
            }
            @Test
            public void testProductoConNombreVacio() {
                assertThrows(IllegalArgumentException.class, () -> {
                    new Producto("", 5, 5);
                });
            }

}

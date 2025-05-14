package tudelft.discount;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountApplierTest {

    @Test
    public void testDiscountApplication() {

        Product p1 = new Product("Producto 1", 100.0, "HOME");
        Product p2 = new Product("Producto 2", 200.0, "BUSINESS");

        ProductDao dao = Mockito.mock(ProductDao.class); //uso de mockito para simular datos
        Mockito.when(dao.all()).thenReturn(Arrays.asList(p1, p2));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        assertEquals(90.0, p1.getPrice(), 0.001);     // 10% de descuento
        assertEquals(220.0, p2.getPrice(), 0.001);    // 10% de incremento
    }
}

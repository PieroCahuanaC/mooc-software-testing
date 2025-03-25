package tudelft.Tienda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AbarrotesTest {


    private Abarrotes leche;

    @BeforeEach
    public void initialize(){
         leche = new Abarrotes("Leche", 10, 4);

    }

    @Test
    public void insercionTest(){
        Abarrotes queso = new Abarrotes("Queso", 5, 10);
        queso.setPrecio(15);
        assertEquals(15,queso.getPrecio());
    }

    @Test
    public void setNombreTest(){
        leche.setNombre("LecheCondensada");
        assertEquals("LecheCondensada", leche.getNombre());
    }

    @Test
    public void comprobarNombre(){
        assertEquals("Leche", leche.getNombre());
    }
}

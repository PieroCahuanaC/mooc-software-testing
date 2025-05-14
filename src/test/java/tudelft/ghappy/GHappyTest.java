package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    GHappy test1;

     @BeforeEach
     public void initialize(){
         test1 = new GHappy();
     }

    @Test
    public void todosPareja(){ //se usa los limites de inicio y fin
        Assertions.assertTrue(test1.gHappy("ggxxgg")); //true
    }

    @Test
    public void casiTodosPareja(){
         Assertions.assertFalse(test1.gHappy("xgxggxgg")); //false
    }

    @Test
    public void ningunaPareja(){
         Assertions.assertTrue(test1.gHappy("xxxxx")); //false
    }
}

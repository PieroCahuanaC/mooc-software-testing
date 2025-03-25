package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    CaesarShiftCipher cipher;

    @BeforeEach
    public void initialize() {
        cipher = new CaesarShiftCipher();
    }

    @Test
    public void letrasMinusculas() { //letras sin espacio
        Assertions.assertEquals("def", cipher.encrypt("abc", 3));
    }

    @Test
    public void letrasConEspacios() { //letras con espacio
        Assertions.assertEquals("b c d", cipher.encrypt("a b c", 1));
    }


    @Test
    public void caracteresInvalidos() { //letras invalidas
        Assertions.assertEquals("invalid", cipher.encrypt("a#c", 2));
    }
}


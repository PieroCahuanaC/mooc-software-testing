package tudelft.mirror;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MirrorTest {

    @Test
    public void testCoincidenciaCompleta() {
        // palindromo completo
        Mirror mirror = new Mirror();
        assertEquals("aba", mirror.mirrorEnds("aba"));
    }

    @Test
    public void testCoincidenciaParcial() {
        // coincidencia donde solo la primera letra y la segunda coinciden
        Mirror mirror = new Mirror();
        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
    }

    @Test
    public void testSinCoincidencia() {
        // no hay coincidencias
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds("xyz"));
    }

    @Test
    public void testCadenaVacia() {
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds(""));
    }

    @Test
    public void testUnSoloCaracter() {
        Mirror mirror = new Mirror();
        assertEquals("x", mirror.mirrorEnds("x"));
    }

    @Test
    public void testCoincidenciaParcialCorrecta() {
        Mirror mirror = new Mirror();
        assertEquals("ab", mirror.mirrorEnds("abXYZba")); // 💥 Esto debería fallar si devuelve "ba"
    }

    @Test
    public void testPalindromoParCompleto() {
        Mirror mirror = new Mirror();
        assertEquals("abba", mirror.mirrorEnds("abba"));
    }

}

package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void testLastCharacterR() {
        int words = new CountLetters().count("cats|r");
        Assertions.assertEquals(2, words); // r se pone como ultimo caracter
    }

    @Test
    public void testLastCharacterS() {
        int words = new CountLetters().count("cats|s");
        Assertions.assertEquals(2, words); // s se pone como ultimo caracter
    }



    @Test
    public void testLastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words); // Última palabra no termina en 'r' o 's'
    }



    @Test
    public void testEmptyString() {
        int words = new CountLetters().count("");
        Assertions.assertEquals(0, words); // No hay palabras
    }

    @Test
    public void testNoDelimiter() {
        int words = new CountLetters().count("catsr");
        Assertions.assertEquals(1, words); // Una palabra terminada en 'r'
    }

    @Test
    public void testWithPunctuation() {
        int words = new CountLetters().count("cats.|dogs,|bears!");
        Assertions.assertEquals(3, words); // "cats", "dogs", "bears"
    }


    @Test
    public void testStartWithMatchingCharacter() {
        int words = new CountLetters().count("r|cats|s|dogs");
        Assertions.assertEquals(4, words); // "r", "cats", "dogs"
    }

}
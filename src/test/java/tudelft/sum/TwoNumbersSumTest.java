package tudelft.sum;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumbersSumTest {

    @Test
    public void testNoCarry() {
        // Sin acarreo (numero de un digito)
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(2)),
                new ArrayList<>(Arrays.asList(3))
        );
        assertEquals(Arrays.asList(5), result);
    }

    @Test
    public void testFinalCarryMissing() {
        // Con acarreo (numero de dos digitos)
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> result = sum.addTwoNumbers(
                new ArrayList<>(Arrays.asList(9)),
                new ArrayList<>(Arrays.asList(9))
        );
        assertEquals(Arrays.asList(1, 8), result);
    }
}

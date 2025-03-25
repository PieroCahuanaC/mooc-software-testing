package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChocolateBagsBeforeBoundaryTest {
    @Test
    public void totalIsBiggerThanAmountOfBars() {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(1, 1, 10);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void onlyBigBars() {
        int result = new ChocolateBags().calculate(5, 3, 10);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void suficienteChocolatePequeño(){
        int result = new ChocolateBags().calculate(4,2,14);
        Assertions.assertEquals(4,result);
    }
    @Test
    public void soloChocolatePequeño(){
        int result = new ChocolateBags().calculate(5,0,5);
        Assertions.assertEquals(5,result);
    }


}

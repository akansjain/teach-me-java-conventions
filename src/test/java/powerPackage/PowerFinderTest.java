package powerPackage;

import org.junit.Test;

public class PowerFinderTest {
    @Test
    public void testOneRaisedToOneIsOne() {

        assert PowerFinder.calculatePower(1,1) == 1;
    }

    @Test
    public void testTwoRaisedToOneIsTwo() {

        assert PowerFinder.calculatePower(2,1) == 2;
    }

    @Test
    public void testTwoRaisedToTwoIsFour() {

        assert PowerFinder.calculatePower(2, 2) == 4;
    }

    @Test
    public void testThreeRaisedToTwoIsNine() {

        assert PowerFinder.calculatePower(3, 2) == 3*3;
    }
}

package powerPackage;

import org.junit.Test;

public class PowerFinderTest {
    @Test
    public void one_raised_to_one_is_onew() {

        assert PowerFinder.calculatePower(1,1) == 1;
    }

    @Test
    public void twoRaised_to_one_is_2() {

        assert PowerFinder.calculatePower(2,1) == 2;
    }

    @Test
    public void two_power_2_is_4() {

        assert PowerFinder.calculatePower(2, 2) == 4;
    }

    @Test
    public void power_of_2_and_3_Is_SIX() {

        assert PowerFinder.calculatePower(3, 2) == 3*3;
    }
}

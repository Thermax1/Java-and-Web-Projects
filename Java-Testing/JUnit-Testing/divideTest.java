package testing;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class divideTest {

    @Test(expected = ArithmeticException.class) //it expects this error to be thrown when b == 0.
    public void divideZero(){
        JunitTesting test = new JunitTesting();
        double output = test.divide(5,0);
    }
    @Test
    public void divideCorrect() {
        JunitTesting test = new JunitTesting();
        double output = test.divide(10,2);
        assertEquals(5,output,0); //delta is the difference we can tolerate in the values for them to be considered equal
    }
}
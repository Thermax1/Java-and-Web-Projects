package testing;

import org.junit.Test;

import static org.junit.Assert.*; //allows us to use AssertEquals to test output

public class squareTest {

    @Test
    public void test() {

        JunitTesting test = new JunitTesting(); //creates test, which has all the source code from JunitTesting.java
        int output = test.square(5); // calls square method
        assertEquals(25, output); //looks for the number 25, which depends on what we put in output
    }
}
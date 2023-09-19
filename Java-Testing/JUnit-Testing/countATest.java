package testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class countATest {

    @Test
    public void test() {
        JunitTesting test = new JunitTesting();
        int output = test.countA("Alphabet");
        assertEquals(2,output);
    }
}
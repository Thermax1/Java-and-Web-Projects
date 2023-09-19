package testing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.*;
@RunWith(Suite.class) //this runs all of our test cases at once
@Suite.SuiteClasses({countATest.class, squareTest.class, divideTest.class})
public class AllTests {

}
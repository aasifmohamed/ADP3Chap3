package ac.za.cput;

import org.junit.*;
import org.junit.Ignore;


import static org.junit.Assert.*;

public class Q2PersonTest {
    Q2Person a = new Q2Person(25,"Harry","Wall");
    Q2Person b = new Q2Person(25,"Harry","Wall");
    Q2Person c = a;

    @Before
    public void setUpEquality(){
    }
    @Test
    public void testEquality()
    {
        // TESTING EQUALITY USING OVERRIDDEN equals() METHOD
        assertEquals("Person A equals Person C", true ,a.equals(c));
    }
    @After
    public void tearDownEquality(){
    }

    @Before
    public void setUpIdentity(){
    }
    @Test
    public void testIdentity(){
        assertSame(true, a.hashCode() != b.hashCode());
    }
    @After
    public void tearDownIdentity(){
    }

    @Before
    public void setUpFail(){
    }
    @Ignore
    @Test
    public void failingTest(){
        try {
            a.setAge(Integer.parseInt("twenty five"));
        }catch(NumberFormatException e){
            Assert.fail("Test failed");
        }
    }@After
    public void tearDownFail(){
    }

    @Before
    public void setUpTimeOut(){
    }
    @Test(timeout = 100)
    public void testWithTimeout(){
        boolean constant = false;

        try {
            while(constant){
            }
        }catch(Exception e){
            constant = true;

            assertEquals("This test will run for 100 milliseconds, throw an exception and pass.", true, constant);
        }
    }
    @After
    public void tearDownTimeout(){
    }
}

package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

public class FailingTest {
    @Test
    public void fail() {
        Failing failed = new Failing();
        Assert.assertEquals("This test is a pass", failed.fail());
    }
}
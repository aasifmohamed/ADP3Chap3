package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

public class ignoreTest {
    @org.junit.Ignore
    @Test
    public void hello() {
        Ignore ignore = new Ignore();
        Assert.assertEquals("This test is disabled", ignore.hello());
    }

}
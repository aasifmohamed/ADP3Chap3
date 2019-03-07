package ac.za.cput;

import org.junit.Test;

public class timeOutTest {

    @Test(timeout = 200)
    public void test1() throws Exception {
        Thread.sleep(1000);
    }
}
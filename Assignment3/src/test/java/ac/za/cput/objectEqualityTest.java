package ac.za.cput;

import org.junit.Assert;
import org.junit.Test;

public class objectEqualityTest {

    objectEquality object1 = objectEquality.getInstance();
    objectEquality object2 = objectEquality.getInstance();

    @Test
    public void getInstance() {
        Assert.assertEquals(object1, object2);
        System.out.println(object1);
        System.out.println(object2);
    }
}
package ac.za.cput;


import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertSame;


public class objectIdentityTest {

    public String getPropValue(final String key){
        Map<String, String> appProps = new HashMap<String, String>();
        appProps.put("key1", "value 1");
        appProps.put("key2", "value 2");
        appProps.put("key3", "value 3");
        return appProps.get(key);
    }

    @Test
    public void isSameReferenceTest(){

        objectIdentityTest msnt = new objectIdentityTest();
        assertSame(msnt.getPropValue("key1"), msnt.getPropValue("key1"));
    }
}
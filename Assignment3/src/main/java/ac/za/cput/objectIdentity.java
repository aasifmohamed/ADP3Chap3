package ac.za.cput;

import java.util.HashMap;
import java.util.Map;

public class objectIdentity {
    public String getPropValue(final String key) {
        Map<String, String> appProps = new HashMap<String, String>();
        appProps.put("key1", "value 1");
        appProps.put("key2", "value 2");
        appProps.put("key3", "value 3");

        String keys = "";

        objectIdentity msnt = new objectIdentity();
        if (msnt.getPropValue("key1") == msnt.getPropValue("key1"))
            keys = appProps.get(key);

        return keys;
    }
}

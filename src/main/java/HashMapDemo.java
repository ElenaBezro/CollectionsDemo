import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Zalando", 15);
        map.put("Android", 20);
        map.put("IOS", 2);

        for (String key: map.keySet()) {
            System.out.println("For key: " + key + " the value is " + map.get(key));
        }
    }
}

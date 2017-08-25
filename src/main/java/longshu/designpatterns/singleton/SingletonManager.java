package longshu.designpatterns.singleton;

import java.util.HashMap;
import java.util.Map;

public class SingletonManager {
    private static Map<String, Object> objMap = new HashMap<String, Object>();

    private SingletonManager() {
    }

    public static void registerService(String key, Object instance) {
        synchronized (objMap) { // 或者使用 ConcurrentHashMap
            if (!objMap.containsKey(key)) {
                objMap.put(key, instance);
            }
        }
    }

    public static Object getService(String key) {
        return objMap.get(key);
    }
}

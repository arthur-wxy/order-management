package com.biyun.order.service.local;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ConfigFactory {
    private Map<String, ConfigHandler> map = new HashMap<>();
    public void regist(String key, ConfigHandler value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        }
    }
    public ConfigHandler get(String key) {
        if (!map.containsKey(key)) {
            return null;
        }
        return map.get(key);
    }
}

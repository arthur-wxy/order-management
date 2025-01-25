package com.biyun.order.service.excel.listener;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ExcelParserFactory {
    private static final Map<String, BaseExcelListener> listenerMap = new ConcurrentHashMap<>();

    public static void registParser(String type, BaseExcelListener listener) {
        listenerMap.put(type.toLowerCase(), listener);
    }

    public static BaseExcelListener getListener(String type) {
        return listenerMap.getOrDefault(type.toLowerCase(), null);
    }
}

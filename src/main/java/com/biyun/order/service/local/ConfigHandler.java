package com.biyun.order.service.local;

public interface ConfigHandler {
    void handle(String content);
    String getTag();

    String getContent();
}

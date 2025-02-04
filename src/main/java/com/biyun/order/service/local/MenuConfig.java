package com.biyun.order.service.local;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MenuConfig implements InitializingBean, ConfigHandler {
    private String content = "[]";
    @Autowired
    private ConfigFactory factory;
    @Override
    public void afterPropertiesSet() throws Exception {
        factory.regist(this.getClass().getSimpleName(), this);
    }

    @Override
    public void handle(String content) {
        this.content = content;
    }

    @Override
    public String getTag() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String getContent() {
        return this.content;
    }
}

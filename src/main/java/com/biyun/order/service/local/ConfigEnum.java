package com.biyun.order.service.local;

public enum ConfigEnum {
    // 注意本地配置的文件名要和此枚举一一对应
    MENU("MenuConfig", "页面左侧菜单栏配置");
    private String name;
    private String desc;

    ConfigEnum(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

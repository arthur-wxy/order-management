package com.biyun.order.starter;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.biyun.order.service.local.ConfigEnum;
import com.biyun.order.service.local.ConfigFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/menu")
@Slf4j
public class MainMenuController {
    @Autowired
    private ConfigFactory configFactory;
    @RequestMapping(value = "/getMenuConf.json")
    public ApiResponse<JSONArray> getMenuConf() {
        if (null == configFactory.get(ConfigEnum.MENU.getName())) {
            return new ApiResponse<JSONArray>(){{
                setSuccess(false);
                setContent(new JSONArray());
            }};
        }
        String result = configFactory.get(ConfigEnum.MENU.getName()).getContent();
        return new ApiResponse<>(){{
            setSuccess(true);
            setContent(JSON.parseArray(result));
        }};
    }
}

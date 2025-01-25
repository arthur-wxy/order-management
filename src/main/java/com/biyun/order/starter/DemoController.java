package com.biyun.order.starter;

import com.biyun.order.model.Order;
import com.biyun.order.model.OrderExample;
import com.biyun.order.service.excel.EasyExcelService;
import com.biyun.order.service.excel.listener.DemoListener;
import com.biyun.order.service.impl.OrderServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Date;

@RestController
@Slf4j
public class DemoController {
    @Autowired
    private OrderServiceImpl orderService;

    @Autowired
    private EasyExcelService easyExcelService;

    @RequestMapping(value = "/demo")
    public String demo() {
        return "HelloWorld!";
    }

    @RequestMapping(value = "/excel")
    public String excel() {
        File file = new File("C:\\Users\\pc\\Desktop\\Demo.xlsx");
        easyExcelService.readExcel(file, DemoListener.class.getSimpleName());
        return "easyExcel success!";
    }

    @RequestMapping(value = "insert.json")
    public String insert(@RequestParam String ext) {
//        Order order = new Order();
//        order.setGmtCreate(new Date());
//        order.setGmtModified(new Date());
//        order.setCreator("xiaoyuan");
//        order.setModifier("qiwu");
//        order.setIsDeleted("n");
//        order.setOrderStatus("INIT");
//        return "" + orderService.insert(order);

        return orderService.query().size() + "";
    }
}

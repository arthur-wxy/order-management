package com.biyun.order.service.excel.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class DemoData extends BaseExcelPojo {
    @ExcelProperty("Order ID")
    private String orderID;

    @ExcelProperty("字段B")
    private String columnB;

    @ExcelProperty("数字标题")
    private String doubleData;

    @Override
    public String name() {
        return this.getClass().getSimpleName().toLowerCase();
    }

    @Override
    public Object convert() {
        return null;
    }
}

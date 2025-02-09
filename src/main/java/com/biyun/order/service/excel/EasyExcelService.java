package com.biyun.order.service.excel;

import com.biyun.order.service.excel.pojo.BaseExcelPojo;

import java.io.File;
import java.util.List;

public interface EasyExcelService {
    <T extends BaseExcelPojo> List<T> readExcel(File file, String type);
}

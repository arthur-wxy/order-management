package com.biyun.order.service.excel;

import com.alibaba.excel.EasyExcel;
import com.biyun.order.service.excel.listener.BaseExcelListener;
import com.biyun.order.service.excel.listener.ExcelParserFactory;
import com.biyun.order.service.excel.pojo.BaseExcelPojo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
@Slf4j
public class EasyExcelServiceImpl implements EasyExcelService {
    private static final Logger logger = LoggerFactory.getLogger(EasyExcelServiceImpl.class);

    @Override
    public <T extends BaseExcelPojo> List<T> readExcel(File file, String type) {
        BaseExcelListener listener = ExcelParserFactory.getListener(type);
        if (listener == null) {
            logger.info("没有找到对应的解析器");
            return null;
        }
        EasyExcel.read(file, listener.getClz(),listener).sheet().doRead();
        return listener.getDataList();
    }
}
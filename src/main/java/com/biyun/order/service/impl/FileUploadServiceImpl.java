package com.biyun.order.service.impl;

import com.alibaba.excel.EasyExcel;
import com.biyun.order.service.FileUploadService;
import com.biyun.order.service.excel.EasyExcelServiceImpl;
import com.biyun.order.service.excel.listener.DemoListener;
import com.biyun.order.service.excel.pojo.OriginalOrderData;
import com.biyun.order.starter.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;

@Service
public class FileUploadServiceImpl implements FileUploadService {

    @Autowired
    private EasyExcelServiceImpl easyExcelService;

    @Override
    public ApiResponse uploadOriginalOrders(InputStream inputStream, String type) throws Exception {

        if (inputStream == null) {
            throw new Exception("文件为空");
        }

        File orderFile = File.createTempFile("temp", ".xlsx");
        Files.copy(inputStream, orderFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

        List<?> result = easyExcelService.readExcel(orderFile, DemoListener.class.getSimpleName());
        // 将结果转换为字符串
        String resultString = result.toString();

        // 返回 ApiResponse，这里假设 ApiResponse 有一个构造函数接受数据列表
        return new ApiResponse<>() {{
            setSuccess(true);
            setContent(resultString);
        }};
    }
}
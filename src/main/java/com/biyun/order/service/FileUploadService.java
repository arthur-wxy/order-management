package com.biyun.order.service;

import com.biyun.order.starter.ApiResponse;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
public interface FileUploadService {

    /**
     * 订单源文件上传
     * @param inputStream
     * @return
     */
    ApiResponse uploadOriginalOrders(InputStream inputStream, String type) throws Exception;
}

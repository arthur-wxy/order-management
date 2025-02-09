package com.biyun.order.starter;

import com.biyun.order.model.Order;
import com.biyun.order.model.OrderExample;
import com.biyun.order.service.FileUploadService;
import com.biyun.order.service.excel.EasyExcelService;
import com.biyun.order.service.excel.EasyExcelServiceImpl;
import com.biyun.order.service.excel.listener.DemoListener;
import com.biyun.order.service.impl.FileUploadServiceImpl;
import com.biyun.order.service.impl.OrderServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private OrderServiceImpl orderService;

    @Autowired
    private EasyExcelService easyExcelService;

    @Autowired
    private FileUploadService fileUploadService;

    @RequestMapping(value = "/demo")
    public String demo() {
        return "HelloWorld!";
    }

    @RequestMapping(value = "/excel")
    public ApiResponse excel(@RequestParam("importFile") MultipartFile importFile,
                        @RequestParam("type") String type
    ) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setSuccess(false);

        if (importFile == null) {
            apiResponse.setErrorMsg(ApiErrorCode.FILE_NOT_FOUND.getMessage());
            apiResponse.setErrorCode(ApiErrorCode.FILE_NOT_FOUND.getCode());
            return apiResponse;
        }

        String originalFilename = importFile.getOriginalFilename();
        if (originalFilename == null || originalFilename.trim().isEmpty()) {
            apiResponse.setErrorMsg(ApiErrorCode.FILE_NAME_EMPTY.getMessage());
            apiResponse.setErrorCode(ApiErrorCode.FILE_NAME_EMPTY.getCode());
            return apiResponse;
        }

        if (!originalFilename.toLowerCase().endsWith(".xlsx") && !originalFilename.toLowerCase().endsWith(".xls")) {
            apiResponse.setErrorMsg(ApiErrorCode.FILE_TYPE_ERROR.getMessage());
            apiResponse.setErrorCode(ApiErrorCode.FILE_TYPE_ERROR.getCode());
            return apiResponse;
        }

        try {
            InputStream inputStream = importFile.getInputStream();
            apiResponse = fileUploadService.uploadOriginalOrders(inputStream, type);

        } catch (Exception e) {
            logger.error("文件上传失败", e);
            apiResponse.setErrorMsg(ApiErrorCode.FILE_UPLOAD_ERROR.getMessage());
            apiResponse.setErrorCode(ApiErrorCode.FILE_UPLOAD_ERROR.getCode());
        }
//        File file = new File("D:\\order-management\\originOrders.xlsx");
//        List<?> result = easyExcelService.readExcel(file, DemoListener.class.getSimpleName());
//        // 将结果转换为字符串
//        String resultString = result.toString();
        return apiResponse;
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

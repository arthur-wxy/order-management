package com.biyun.order.service.excel.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.biyun.order.service.excel.pojo.DemoData;
import com.biyun.order.service.excel.pojo.OriginalOrderData;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class DemoListener extends BaseExcelListener<OriginalOrderData> {
    private final List<OriginalOrderData> dataList = new CopyOnWriteArrayList<>();

    @Override
    public void invoke(OriginalOrderData demoData, AnalysisContext analysisContext) {
        dataList.add(demoData);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("所有数据解析完成");
    }

    @Override
    public List<OriginalOrderData> getDataList() {
        List<OriginalOrderData> result = Collections.unmodifiableList(dataList);
        dataList.clear();
        return result;
    }

    @Override
    public Class<?> getClz() {
        return OriginalOrderData.class;
    }
}

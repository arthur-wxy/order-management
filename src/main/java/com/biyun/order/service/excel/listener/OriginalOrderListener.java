package com.biyun.order.service.excel.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.biyun.order.service.excel.pojo.DemoData;

import java.util.List;

public class OriginalOrderListener extends BaseExcelListener<DemoData>{
    @Override
    public List<DemoData> getDataList() {
        return List.of();
    }

    @Override
    public Class<?> getClz() {
        return null;
    }

    @Override
    public void invoke(DemoData demoData, AnalysisContext analysisContext) {

    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}

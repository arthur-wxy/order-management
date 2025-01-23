package com.biyun.order.service.excel.listener;

import com.alibaba.excel.event.AnalysisEventListener;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public abstract class BaseExcelListener<T> extends AnalysisEventListener<T> implements InitializingBean {

    public abstract List<T> getDataList();
    public abstract Class<?> getClz();
    @Override
    public void afterPropertiesSet() {
        ExcelParserFactory.registParser(this.getClass().getSimpleName().toLowerCase(), this);
    }
}

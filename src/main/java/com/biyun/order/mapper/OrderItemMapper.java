package com.biyun.order.mapper;

import java.util.List;
import com.biyun.order.model.OrderItem;
import com.biyun.order.model.OrderItemExample;
import org.apache.ibatis.annotations.Param;

public interface OrderItemMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(OrderItemExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(OrderItemExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(OrderItem row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(OrderItem row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<OrderItem> selectByExampleWithBLOBs(OrderItemExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<OrderItem> selectByExample(OrderItemExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    OrderItem selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") OrderItem row, @Param("example") OrderItemExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleWithBLOBs(@Param("row") OrderItem row, @Param("example") OrderItemExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") OrderItem row, @Param("example") OrderItemExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(OrderItem row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeyWithBLOBs(OrderItem row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(OrderItem row);
}
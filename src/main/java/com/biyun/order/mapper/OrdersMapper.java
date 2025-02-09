package com.biyun.order.mapper;

import java.util.List;
import com.biyun.order.model.Orders;
import com.biyun.order.model.OrdersExample;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(OrdersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(OrdersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Orders row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Orders row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Orders> selectByExampleWithBLOBs(OrdersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Orders> selectByExample(OrdersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Orders selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") Orders row, @Param("example") OrdersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleWithBLOBs(@Param("row") Orders row, @Param("example") OrdersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") Orders row, @Param("example") OrdersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Orders row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeyWithBLOBs(Orders row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Orders row);
}
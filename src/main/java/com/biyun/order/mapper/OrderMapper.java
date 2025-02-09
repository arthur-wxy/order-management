package com.biyun.order.mapper;
import java.util.List;
import com.biyun.order.model.Order;
import com.biyun.order.model.OrderExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Mapper
public interface OrderMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(OrderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(OrderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Order row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Order row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Order> selectByExampleWithBLOBs(OrderExample example, RowBounds rowBounds);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Order> selectByExampleWithBLOBs(OrderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Order> selectByExample(OrderExample example, RowBounds rowBounds);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Order> selectByExampleWithLock(OrderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Order selectByPrimaryKeyWithLock(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Order selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") Order row, @Param("example") OrderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleWithBLOBs(@Param("row") Order row, @Param("example") OrderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") Order row, @Param("example") OrderExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Order row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeyWithBLOBs(Order row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Order row);
}
package com.biyun.order.model;

import java.util.Date;
import lombok.Data;

/**
 * Table: orders
 */
@Data
public class Orders {
    /**
     * Column: id
     * Type: INT
     * Remark: 主键，自动递增
     */
    private Integer id;

    /**
     * Column: gmt_create
     * Type: DATETIME
     * Remark: 创建时间
     */
    private Date gmtCreate;

    /**
     * Column: gmt_modified
     * Type: DATETIME
     * Remark: 修改时间
     */
    private Date gmtModified;

    /**
     * Column: creator
     * Type: VARCHAR(64)
     * Remark: 创建者
     */
    private String creator;

    /**
     * Column: modifier
     * Type: VARCHAR(64)
     * Remark: 修改者
     */
    private String modifier;

    /**
     * Column: is_deleted
     * Type: CHAR(1)
     * Default value: n
     * Remark: 逻辑删除
     */
    private String isDeleted;

    /**
     * Column: actual_customer
     * Type: VARCHAR(64)
     * Remark: 实际客户方
     */
    private String actualCustomer;

    /**
     * Column: customer_phone
     * Type: VARCHAR(64)
     * Remark: 客户联系方式
     */
    private String customerPhone;

    /**
     * Column: customer_email
     * Type: VARCHAR(255)
     * Remark: 客户邮箱
     */
    private String customerEmail;

    /**
     * Column: customer_zip
     * Type: VARCHAR(20)
     * Remark: 客户邮编
     */
    private String customerZip;

    /**
     * Column: customer_company
     * Type: VARCHAR(255)
     * Remark: 客户公司
     */
    private String customerCompany;

    /**
     * Column: customer_payee
     * Type: VARCHAR(255)
     * Remark: 客户收款方
     */
    private String customerPayee;

    /**
     * Column: customer_payee_account
     * Type: VARCHAR(255)
     * Remark: 客户收款账号
     */
    private String customerPayeeAccount;

    /**
     * Column: order_status
     * Type: VARCHAR(100)
     * Remark: 订单状态
     */
    private String orderStatus;

    /**
     * Column: ext
     * Type: TEXT
     * Remark: 冗余拓展字段
     */
    private String ext;
}
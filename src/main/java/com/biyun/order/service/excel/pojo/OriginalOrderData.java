package com.biyun.order.service.excel.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import org.apache.poi.hpsf.Decimal;

import java.util.Date;

public class OriginalOrderData extends BaseExcelPojo {
    @ExcelProperty("OrderID外部订单号")
    private String orderID;

    @ExcelProperty("SKU")
    private String sku;

    @ExcelProperty("Product Name")
    private String productName;

    @ExcelProperty("SKU_TIC")
    private String skuTic;

    @ExcelProperty("atrribute")
    private String attribute;

    @ExcelProperty("Quantity")
    private int quantity;

    @ExcelProperty("Price")
    private Decimal price;

    @ExcelProperty("Shipping Full Name")
    private String shippingFullName;

    @ExcelProperty("Address1")
    private String address1;

    @ExcelProperty("Address2")
    private String address2;

    @ExcelProperty("City")
    private String city;

    @ExcelProperty("State")
    private String state;

    @ExcelProperty("Zip")
    private String zip;

    @ExcelProperty("Country")
    private String country;

    @ExcelProperty("Phone")
    private String phone;

    @ExcelProperty("Email")
    private String email;

    @ExcelProperty("Shipping Method")
    private String shippingMethod;

    @ExcelProperty("url")
    private String orderPreviewUrl;

    @ExcelProperty("designUrl")
    private String designUrl;

    @ExcelProperty("Customization")
    private String customization;

    @ExcelProperty("customUniqID")
    private String customUniqID;

    @ExcelProperty("uniqueField")
    private String uniqField;

    @ExcelProperty("Order Date")
    private Date orderDate;

    @ExcelProperty("itemID")
    private String itemID;

    @ExcelProperty("fulfillmentFields")
    private String fulfillmentFields;

    @ExcelProperty("isShopify")
    private boolean shopify;

    @ExcelProperty("shopify_product_type")
    private String shopifyProductType;

    @ExcelProperty("Number Of Names")
    private int numberOfNames;

    @Override
    public String name() {
        return "";
    }

    @Override
    public Object convert() {
        return null;
    }

    // Getters and setters for all fields


}

package com.biyun.order.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Table: order_item
 */
public class OrderItem {
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
     * Column: order_id
     * Type: INT
     * Remark: 订单id
     */
    private Integer orderId;

    /**
     * Column: sku
     * Type: VARCHAR(255)
     * Remark: sku
     */
    private String sku;

    /**
     * Column: product_name
     * Type: VARCHAR(255)
     * Remark: 产品名称
     */
    private String productName;

    /**
     * Column: sku_tic
     * Type: VARCHAR(255)
     * Remark: SKU相关的TIC信息
     */
    private String skuTic;

    /**
     * Column: quantity
     * Type: INT
     * Remark: 购买的产品数量
     */
    private Integer quantity;

    /**
     * Column: price
     * Type: DECIMAL
     * Remark: 单价，最多10位数字，其中4位小数
     */
    private BigDecimal price;

    /**
     * Column: shipping _full_name
     * Type: VARCHAR(255)
     * Remark: 收货人的全名
     */
    private String shippingFullName;

    /**
     * Column: address1
     * Type: VARCHAR(255)
     * Remark: 收货地址的第一行
     */
    private String address1;

    /**
     * Column: address2
     * Type: VARCHAR(255)
     * Remark: 收货地址的第二行（可选）
     */
    private String address2;

    /**
     * Column: city
     * Type: VARCHAR(255)
     * Remark: 收货城市的名称
     */
    private String city;

    /**
     * Column: state
     * Type: VARCHAR(255)
     * Remark: 收货州/省的名称
     */
    private String state;

    /**
     * Column: country
     * Type: VARCHAR(255)
     * Remark: 收货国家的名称
     */
    private String country;

    /**
     * Column: zip
     * Type: VARCHAR(20)
     * Remark: 邮政编码
     */
    private String zip;

    /**
     * Column: phone
     * Type: VARCHAR(20)
     * Remark: 联系电话
     */
    private String phone;

    /**
     * Column: email
     * Type: VARCHAR(255)
     * Remark: 联系电子邮件地址
     */
    private String email;

    /**
     * Column: shipping_method
     * Type: VARCHAR(255)
     * Remark: 选择的运输方式
     */
    private String shippingMethod;

    /**
     * Column: color
     * Type: VARCHAR(255)
     * Remark: 产品的颜色
     */
    private String color;

    /**
     * Column: size
     * Type: VARCHAR(50)
     * Remark: 产品的尺寸
     */
    private String size;

    /**
     * Column: customily_uniq_id
     * Type: VARCHAR(255)
     * Remark: 自定义唯一标识符
     */
    private String customilyUniqId;

    /**
     * Column: uniq_field
     * Type: VARCHAR(255)
     * Remark: 用于标识记录的唯一字段
     */
    private String uniqField;

    /**
     * Column: item_id
     * Type: VARCHAR(255)
     * Remark: 项目id
     */
    private String itemId;

    /**
     * Column: is_shopify
     * Type: BIT
     * Default value: 0
     * Remark: 是否为Shopify订单，默认值为FALSE
     */
    private Boolean isShopify;

    /**
     * Column: shopify_product_type
     * Type: VARCHAR(255)
     * Remark: Shopify产品类型
     */
    private String shopifyProductType;

    /**
     * Column: number_of_names
     * Type: INT
     * Remark: 名字的数量
     */
    private Integer numberOfNames;

    /**
     * Column: order_item_status
     * Type: VARCHAR(100)
     * Remark: 订单明细行状态
     */
    private String orderItemStatus;

    /**
     * Column: external_order_id
     * Type: VARCHAR(255)
     * Remark: å¤–éƒ¨è®¢å•å·
     */
    private String externalOrderId;

    /**
     * Column: attribute
     * Type: TEXT
     * Remark: 产品属性，存储为文本
     */
    private String attribute;

    /**
     * Column: order_preview_url
     * Type: TEXT
     * Remark: 订单预览页面的URL
     */
    private String orderPreviewUrl;

    /**
     * Column: design_url
     * Type: TEXT
     * Remark: 产品设计页面的URL
     */
    private String designUrl;

    /**
     * Column: customization_url
     * Type: TEXT
     * Remark: 定制页面的URL
     */
    private String customizationUrl;

    /**
     * Column: fulfillment_fields
     * Type: TEXT
     * Remark: 履约相关字段，存储为文本
     */
    private String fulfillmentFields;

    /**
     * Column: ext
     * Type: TEXT
     * Remark: 扩展字段，用于存储额外的信息
     */
    private String ext;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getSkuTic() {
        return skuTic;
    }

    public void setSkuTic(String skuTic) {
        this.skuTic = skuTic == null ? null : skuTic.trim();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getShippingFullName() {
        return shippingFullName;
    }

    public void setShippingFullName(String shippingFullName) {
        this.shippingFullName = shippingFullName == null ? null : shippingFullName.trim();
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1 == null ? null : address1.trim();
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2 == null ? null : address2.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod == null ? null : shippingMethod.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getCustomilyUniqId() {
        return customilyUniqId;
    }

    public void setCustomilyUniqId(String customilyUniqId) {
        this.customilyUniqId = customilyUniqId == null ? null : customilyUniqId.trim();
    }

    public String getUniqField() {
        return uniqField;
    }

    public void setUniqField(String uniqField) {
        this.uniqField = uniqField == null ? null : uniqField.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public Boolean getIsShopify() {
        return isShopify;
    }

    public void setIsShopify(Boolean isShopify) {
        this.isShopify = isShopify;
    }

    public String getShopifyProductType() {
        return shopifyProductType;
    }

    public void setShopifyProductType(String shopifyProductType) {
        this.shopifyProductType = shopifyProductType == null ? null : shopifyProductType.trim();
    }

    public Integer getNumberOfNames() {
        return numberOfNames;
    }

    public void setNumberOfNames(Integer numberOfNames) {
        this.numberOfNames = numberOfNames;
    }

    public String getOrderItemStatus() {
        return orderItemStatus;
    }

    public void setOrderItemStatus(String orderItemStatus) {
        this.orderItemStatus = orderItemStatus == null ? null : orderItemStatus.trim();
    }

    public String getExternalOrderId() {
        return externalOrderId;
    }

    public void setExternalOrderId(String externalOrderId) {
        this.externalOrderId = externalOrderId == null ? null : externalOrderId.trim();
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    public String getOrderPreviewUrl() {
        return orderPreviewUrl;
    }

    public void setOrderPreviewUrl(String orderPreviewUrl) {
        this.orderPreviewUrl = orderPreviewUrl == null ? null : orderPreviewUrl.trim();
    }

    public String getDesignUrl() {
        return designUrl;
    }

    public void setDesignUrl(String designUrl) {
        this.designUrl = designUrl == null ? null : designUrl.trim();
    }

    public String getCustomizationUrl() {
        return customizationUrl;
    }

    public void setCustomizationUrl(String customizationUrl) {
        this.customizationUrl = customizationUrl == null ? null : customizationUrl.trim();
    }

    public String getFulfillmentFields() {
        return fulfillmentFields;
    }

    public void setFulfillmentFields(String fulfillmentFields) {
        this.fulfillmentFields = fulfillmentFields == null ? null : fulfillmentFields.trim();
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }
}
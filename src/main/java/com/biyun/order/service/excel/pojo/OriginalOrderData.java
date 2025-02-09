package com.biyun.order.service.excel.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import org.apache.poi.hpsf.Decimal;

import java.util.Date;

public class OriginalOrderData extends BaseExcelPojo {
    @ExcelProperty("Order ID")
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
    private String quantity;

    @ExcelProperty("Price")
    private String price;

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
    private String orderDate;

    @ExcelProperty("itemID")
    private String itemID;

    @ExcelProperty("fulfillmentFields")
    private String fulfillmentFields;

    @ExcelProperty("isShopify")
    private String shopify;

    @ExcelProperty("shopify_product_type")
    private String shopifyProductType;

    @ExcelProperty("Number Of Names")
    private String numberOfNames;

    @Override
    public String name() {
        return "";
    }

    @Override
    public Object convert() {
        return null;
    }

    // Getters and setters for all fields
    public String getOrderID() {
        return orderID;
    }
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getSkuTic() {
        return skuTic;
    }
    public void setSkuTic(String skuTic) {
        this.skuTic = skuTic;
    }
    public String getAttribute() {
        return attribute;
    }
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getShippingFullName() {
        return shippingFullName;
    }
    public void setShippingFullName(String shippingFullName) {
        this.shippingFullName = shippingFullName;
    }
    public String getAddress1() {
        return address1;
    }
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    public String getAddress2() {
        return address2;
    }
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getShippingMethod() {
        return shippingMethod;
    }
    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
    public String getOrderPreviewUrl() {
        return orderPreviewUrl;
    }
    public void setOrderPreviewUrl(String orderPreviewUrl) {
        this.orderPreviewUrl = orderPreviewUrl;
    }
    public String getDesignUrl() {
        return designUrl;
    }
    public void setDesignUrl(String designUrl) {
        this.designUrl = designUrl;
    }
    public String getCustomization() {
        return customization;
    }
    public void setCustomization(String customization) {
        this.customization = customization;
    }
    public String getCustomUniqID() {
        return customUniqID;
    }
    public void setCustomUniqID(String customUniqID) {
        this.customUniqID = customUniqID;
    }
    public String getUniqField() {
        return uniqField;
    }
    public void setUniqField(String uniqField) {
        this.uniqField = uniqField;
    }
    public String getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    public String getItemID() {
        return itemID;
    }
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }
    public String getFulfillmentFields() {
        return fulfillmentFields;
    }
    public void setFulfillmentFields(String fulfillmentFields) {
        this.fulfillmentFields = fulfillmentFields;
    }
    public String isShopify() {
        return shopify;
    }
    public void setShopify(String shopify) {
        this.shopify = shopify;
    }
    public String getShopifyProductType() {
        return shopifyProductType;
    }
    public void setShopifyProductType(String shopifyProductType) {
        this.shopifyProductType = shopifyProductType;
    }
    public String getNumberOfNames() {
        return numberOfNames;
    }
    public void setNumberOfNames(String numberOfNames) {
        this.numberOfNames = numberOfNames;
    }
    @Override
    public String toString() {
        return "OriginalOrderData{" +
                "orderID='" + orderID + '\'' +
                ", sku='" + sku + '\'' +
                ", productName='" + productName + '\'' +
                ", skuTic='" + skuTic + '\'' +
                ", attribute='" + attribute + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", shippingFullName='" + shippingFullName + '\'' +
                ",address1='" + address1 + '\'' +
                ",address2='" + address2 + '\'' +
                ",city='" + city + '\'' +
                ",state='" + state + '\'' +
                ",zip='" + zip + '\'' +
                ",country='" + country + '\'' +
                ",phone='" + phone + '\'' +
                ",email='" + email + '\'' +
                ",shippingMethod='" + shippingMethod + '\'' +
                ",orderPreviewUrl='" + orderPreviewUrl + '\'' +
                ",designUrl='" + designUrl + '\'' +
                ",customization='" + customization + '\'' +
                ",customUniqID='" + customUniqID + '\'' +
                ",uniqField='" + uniqField + '\'' +
                ",orderDate=" + orderDate +
                ",itemID='" + itemID + '\'' +
                ",fulfillmentFields='" + fulfillmentFields + '\'' +
                ",shopify=" + shopify +
                ",shopifyProductType='" + shopifyProductType + '\'' +
                ",numberOfNames=" + numberOfNames +
                '}';
    }

}

package com.biyun.order.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected String orderByClause;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected boolean distinct;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public OrdersExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andActualCustomerIsNull() {
            addCriterion("actual_customer is null");
            return (Criteria) this;
        }

        public Criteria andActualCustomerIsNotNull() {
            addCriterion("actual_customer is not null");
            return (Criteria) this;
        }

        public Criteria andActualCustomerEqualTo(String value) {
            addCriterion("actual_customer =", value, "actualCustomer");
            return (Criteria) this;
        }

        public Criteria andActualCustomerNotEqualTo(String value) {
            addCriterion("actual_customer <>", value, "actualCustomer");
            return (Criteria) this;
        }

        public Criteria andActualCustomerGreaterThan(String value) {
            addCriterion("actual_customer >", value, "actualCustomer");
            return (Criteria) this;
        }

        public Criteria andActualCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("actual_customer >=", value, "actualCustomer");
            return (Criteria) this;
        }

        public Criteria andActualCustomerLessThan(String value) {
            addCriterion("actual_customer <", value, "actualCustomer");
            return (Criteria) this;
        }

        public Criteria andActualCustomerLessThanOrEqualTo(String value) {
            addCriterion("actual_customer <=", value, "actualCustomer");
            return (Criteria) this;
        }

        public Criteria andActualCustomerLike(String value) {
            addCriterion("actual_customer like", value, "actualCustomer");
            return (Criteria) this;
        }

        public Criteria andActualCustomerNotLike(String value) {
            addCriterion("actual_customer not like", value, "actualCustomer");
            return (Criteria) this;
        }

        public Criteria andActualCustomerIn(List<String> values) {
            addCriterion("actual_customer in", values, "actualCustomer");
            return (Criteria) this;
        }

        public Criteria andActualCustomerNotIn(List<String> values) {
            addCriterion("actual_customer not in", values, "actualCustomer");
            return (Criteria) this;
        }

        public Criteria andActualCustomerBetween(String value1, String value2) {
            addCriterion("actual_customer between", value1, value2, "actualCustomer");
            return (Criteria) this;
        }

        public Criteria andActualCustomerNotBetween(String value1, String value2) {
            addCriterion("actual_customer not between", value1, value2, "actualCustomer");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNull() {
            addCriterion("customer_email is null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNotNull() {
            addCriterion("customer_email is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailEqualTo(String value) {
            addCriterion("customer_email =", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotEqualTo(String value) {
            addCriterion("customer_email <>", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThan(String value) {
            addCriterion("customer_email >", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("customer_email >=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThan(String value) {
            addCriterion("customer_email <", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThanOrEqualTo(String value) {
            addCriterion("customer_email <=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLike(String value) {
            addCriterion("customer_email like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotLike(String value) {
            addCriterion("customer_email not like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIn(List<String> values) {
            addCriterion("customer_email in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotIn(List<String> values) {
            addCriterion("customer_email not in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailBetween(String value1, String value2) {
            addCriterion("customer_email between", value1, value2, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotBetween(String value1, String value2) {
            addCriterion("customer_email not between", value1, value2, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerZipIsNull() {
            addCriterion("customer_zip is null");
            return (Criteria) this;
        }

        public Criteria andCustomerZipIsNotNull() {
            addCriterion("customer_zip is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerZipEqualTo(String value) {
            addCriterion("customer_zip =", value, "customerZip");
            return (Criteria) this;
        }

        public Criteria andCustomerZipNotEqualTo(String value) {
            addCriterion("customer_zip <>", value, "customerZip");
            return (Criteria) this;
        }

        public Criteria andCustomerZipGreaterThan(String value) {
            addCriterion("customer_zip >", value, "customerZip");
            return (Criteria) this;
        }

        public Criteria andCustomerZipGreaterThanOrEqualTo(String value) {
            addCriterion("customer_zip >=", value, "customerZip");
            return (Criteria) this;
        }

        public Criteria andCustomerZipLessThan(String value) {
            addCriterion("customer_zip <", value, "customerZip");
            return (Criteria) this;
        }

        public Criteria andCustomerZipLessThanOrEqualTo(String value) {
            addCriterion("customer_zip <=", value, "customerZip");
            return (Criteria) this;
        }

        public Criteria andCustomerZipLike(String value) {
            addCriterion("customer_zip like", value, "customerZip");
            return (Criteria) this;
        }

        public Criteria andCustomerZipNotLike(String value) {
            addCriterion("customer_zip not like", value, "customerZip");
            return (Criteria) this;
        }

        public Criteria andCustomerZipIn(List<String> values) {
            addCriterion("customer_zip in", values, "customerZip");
            return (Criteria) this;
        }

        public Criteria andCustomerZipNotIn(List<String> values) {
            addCriterion("customer_zip not in", values, "customerZip");
            return (Criteria) this;
        }

        public Criteria andCustomerZipBetween(String value1, String value2) {
            addCriterion("customer_zip between", value1, value2, "customerZip");
            return (Criteria) this;
        }

        public Criteria andCustomerZipNotBetween(String value1, String value2) {
            addCriterion("customer_zip not between", value1, value2, "customerZip");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIsNull() {
            addCriterion("customer_company is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIsNotNull() {
            addCriterion("customer_company is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyEqualTo(String value) {
            addCriterion("customer_company =", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyNotEqualTo(String value) {
            addCriterion("customer_company <>", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyGreaterThan(String value) {
            addCriterion("customer_company >", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("customer_company >=", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyLessThan(String value) {
            addCriterion("customer_company <", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyLessThanOrEqualTo(String value) {
            addCriterion("customer_company <=", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyLike(String value) {
            addCriterion("customer_company like", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyNotLike(String value) {
            addCriterion("customer_company not like", value, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyIn(List<String> values) {
            addCriterion("customer_company in", values, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyNotIn(List<String> values) {
            addCriterion("customer_company not in", values, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyBetween(String value1, String value2) {
            addCriterion("customer_company between", value1, value2, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerCompanyNotBetween(String value1, String value2) {
            addCriterion("customer_company not between", value1, value2, "customerCompany");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeIsNull() {
            addCriterion("customer_payee is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeIsNotNull() {
            addCriterion("customer_payee is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeEqualTo(String value) {
            addCriterion("customer_payee =", value, "customerPayee");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeNotEqualTo(String value) {
            addCriterion("customer_payee <>", value, "customerPayee");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeGreaterThan(String value) {
            addCriterion("customer_payee >", value, "customerPayee");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_payee >=", value, "customerPayee");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeLessThan(String value) {
            addCriterion("customer_payee <", value, "customerPayee");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeLessThanOrEqualTo(String value) {
            addCriterion("customer_payee <=", value, "customerPayee");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeLike(String value) {
            addCriterion("customer_payee like", value, "customerPayee");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeNotLike(String value) {
            addCriterion("customer_payee not like", value, "customerPayee");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeIn(List<String> values) {
            addCriterion("customer_payee in", values, "customerPayee");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeNotIn(List<String> values) {
            addCriterion("customer_payee not in", values, "customerPayee");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeBetween(String value1, String value2) {
            addCriterion("customer_payee between", value1, value2, "customerPayee");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeNotBetween(String value1, String value2) {
            addCriterion("customer_payee not between", value1, value2, "customerPayee");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeAccountIsNull() {
            addCriterion("customer_payee_account is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeAccountIsNotNull() {
            addCriterion("customer_payee_account is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeAccountEqualTo(String value) {
            addCriterion("customer_payee_account =", value, "customerPayeeAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeAccountNotEqualTo(String value) {
            addCriterion("customer_payee_account <>", value, "customerPayeeAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeAccountGreaterThan(String value) {
            addCriterion("customer_payee_account >", value, "customerPayeeAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeAccountGreaterThanOrEqualTo(String value) {
            addCriterion("customer_payee_account >=", value, "customerPayeeAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeAccountLessThan(String value) {
            addCriterion("customer_payee_account <", value, "customerPayeeAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeAccountLessThanOrEqualTo(String value) {
            addCriterion("customer_payee_account <=", value, "customerPayeeAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeAccountLike(String value) {
            addCriterion("customer_payee_account like", value, "customerPayeeAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeAccountNotLike(String value) {
            addCriterion("customer_payee_account not like", value, "customerPayeeAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeAccountIn(List<String> values) {
            addCriterion("customer_payee_account in", values, "customerPayeeAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeAccountNotIn(List<String> values) {
            addCriterion("customer_payee_account not in", values, "customerPayeeAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeAccountBetween(String value1, String value2) {
            addCriterion("customer_payee_account between", value1, value2, "customerPayeeAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerPayeeAccountNotBetween(String value1, String value2) {
            addCriterion("customer_payee_account not between", value1, value2, "customerPayeeAccount");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andExternalOrderIdIsNull() {
            addCriterion("external_order_id is null");
            return (Criteria) this;
        }

        public Criteria andExternalOrderIdIsNotNull() {
            addCriterion("external_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andExternalOrderIdEqualTo(String value) {
            addCriterion("external_order_id =", value, "externalOrderId");
            return (Criteria) this;
        }

        public Criteria andExternalOrderIdNotEqualTo(String value) {
            addCriterion("external_order_id <>", value, "externalOrderId");
            return (Criteria) this;
        }

        public Criteria andExternalOrderIdGreaterThan(String value) {
            addCriterion("external_order_id >", value, "externalOrderId");
            return (Criteria) this;
        }

        public Criteria andExternalOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("external_order_id >=", value, "externalOrderId");
            return (Criteria) this;
        }

        public Criteria andExternalOrderIdLessThan(String value) {
            addCriterion("external_order_id <", value, "externalOrderId");
            return (Criteria) this;
        }

        public Criteria andExternalOrderIdLessThanOrEqualTo(String value) {
            addCriterion("external_order_id <=", value, "externalOrderId");
            return (Criteria) this;
        }

        public Criteria andExternalOrderIdLike(String value) {
            addCriterion("external_order_id like", value, "externalOrderId");
            return (Criteria) this;
        }

        public Criteria andExternalOrderIdNotLike(String value) {
            addCriterion("external_order_id not like", value, "externalOrderId");
            return (Criteria) this;
        }

        public Criteria andExternalOrderIdIn(List<String> values) {
            addCriterion("external_order_id in", values, "externalOrderId");
            return (Criteria) this;
        }

        public Criteria andExternalOrderIdNotIn(List<String> values) {
            addCriterion("external_order_id not in", values, "externalOrderId");
            return (Criteria) this;
        }

        public Criteria andExternalOrderIdBetween(String value1, String value2) {
            addCriterion("external_order_id between", value1, value2, "externalOrderId");
            return (Criteria) this;
        }

        public Criteria andExternalOrderIdNotBetween(String value1, String value2) {
            addCriterion("external_order_id not between", value1, value2, "externalOrderId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
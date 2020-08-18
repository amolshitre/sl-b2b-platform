package com.newco.marketplace.dto.vo.ledger;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sears.os.vo.SerializableBaseVO;

public class AccountExample extends SerializableBaseVO{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4879742999137181322L;

	/**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table account_hdr
     *
     * @abatorgenerated Fri Aug 17 14:37:34 CDT 2007
     */
    private String orderByClause;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table account_hdr
     *
     * @abatorgenerated Fri Aug 17 14:37:34 CDT 2007
     */
    private List oredCriteria = new ArrayList();

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table account_hdr
     *
     * @abatorgenerated Fri Aug 17 14:37:34 CDT 2007
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table account_hdr
     *
     * @abatorgenerated Fri Aug 17 14:37:34 CDT 2007
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table account_hdr
     *
     * @abatorgenerated Fri Aug 17 14:37:34 CDT 2007
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table account_hdr
     *
     * @abatorgenerated Fri Aug 17 14:37:34 CDT 2007
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table account_hdr
     *
     * @abatorgenerated Fri Aug 17 14:37:34 CDT 2007
     */
    public Criteria createCriteria() {
        Criteria criteria = new Criteria();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table account_hdr
     *
     * @abatorgenerated Fri Aug 17 14:37:34 CDT 2007
     */
    public static class Criteria {
        private List criteriaWithoutValue;

        private List criteriaWithSingleValue;

        private List criteriaWithListValue;

        private List criteriaWithBetweenValue;

        private Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        private void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        private void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        private void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andAccount_idIsNull() {
            criteriaWithoutValue.add("account_id is null");
            return this;
        }

        public Criteria andAccount_idIsNotNull() {
            criteriaWithoutValue.add("account_id is not null");
            return this;
        }

        public Criteria andAccount_idEqualTo(Integer value) {
            addCriterion("account_id =", value, "account_id");
            return this;
        }

        public Criteria andAccount_idNotEqualTo(Integer value) {
            addCriterion("account_id <>", value, "account_id");
            return this;
        }

        public Criteria andAccount_idGreaterThan(Integer value) {
            addCriterion("account_id >", value, "account_id");
            return this;
        }

        public Criteria andAccount_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_id >=", value, "account_id");
            return this;
        }

        public Criteria andAccount_idLessThan(Integer value) {
            addCriterion("account_id <", value, "account_id");
            return this;
        }

        public Criteria andAccount_idLessThanOrEqualTo(Integer value) {
            addCriterion("account_id <=", value, "account_id");
            return this;
        }

        public Criteria andAccount_idIn(List values) {
            addCriterion("account_id in", values, "account_id");
            return this;
        }

        public Criteria andAccount_idNotIn(List values) {
            addCriterion("account_id not in", values, "account_id");
            return this;
        }

        public Criteria andAccount_idBetween(Integer value1, Integer value2) {
            addCriterion("account_id between", value1, value2, "account_id");
            return this;
        }

        public Criteria andAccount_idNotBetween(Integer value1, Integer value2) {
            addCriterion("account_id not between", value1, value2, "account_id");
            return this;
        }

        public Criteria andOwner_entity_type_idIsNull() {
            criteriaWithoutValue.add("owner_entity_type_id is null");
            return this;
        }

        public Criteria andOwner_entity_type_idIsNotNull() {
            criteriaWithoutValue.add("owner_entity_type_id is not null");
            return this;
        }

        public Criteria andOwner_entity_type_idEqualTo(Integer value) {
            addCriterion("owner_entity_type_id =", value, "owner_entity_type_id");
            return this;
        }

        public Criteria andOwner_entity_type_idNotEqualTo(Integer value) {
            addCriterion("owner_entity_type_id <>", value, "owner_entity_type_id");
            return this;
        }

        public Criteria andOwner_entity_type_idGreaterThan(Integer value) {
            addCriterion("owner_entity_type_id >", value, "owner_entity_type_id");
            return this;
        }

        public Criteria andOwner_entity_type_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("owner_entity_type_id >=", value, "owner_entity_type_id");
            return this;
        }

        public Criteria andOwner_entity_type_idLessThan(Integer value) {
            addCriterion("owner_entity_type_id <", value, "owner_entity_type_id");
            return this;
        }

        public Criteria andOwner_entity_type_idLessThanOrEqualTo(Integer value) {
            addCriterion("owner_entity_type_id <=", value, "owner_entity_type_id");
            return this;
        }

        public Criteria andOwner_entity_type_idIn(List values) {
            addCriterion("owner_entity_type_id in", values, "owner_entity_type_id");
            return this;
        }

        public Criteria andOwner_entity_type_idNotIn(List values) {
            addCriterion("owner_entity_type_id not in", values, "owner_entity_type_id");
            return this;
        }

        public Criteria andOwner_entity_type_idBetween(Integer value1, Integer value2) {
            addCriterion("owner_entity_type_id between", value1, value2, "owner_entity_type_id");
            return this;
        }

        public Criteria andOwner_entity_type_idNotBetween(Integer value1, Integer value2) {
            addCriterion("owner_entity_type_id not between", value1, value2, "owner_entity_type_id");
            return this;
        }

        public Criteria andOwner_entity_idIsNull() {
            criteriaWithoutValue.add("owner_entity_id is null");
            return this;
        }

        public Criteria andOwner_entity_idIsNotNull() {
            criteriaWithoutValue.add("owner_entity_id is not null");
            return this;
        }

        public Criteria andOwner_entity_idEqualTo(Integer value) {
            addCriterion("owner_entity_id =", value, "owner_entity_id");
            return this;
        }

        public Criteria andOwner_entity_idNotEqualTo(Integer value) {
            addCriterion("owner_entity_id <>", value, "owner_entity_id");
            return this;
        }

        public Criteria andOwner_entity_idGreaterThan(Integer value) {
            addCriterion("owner_entity_id >", value, "owner_entity_id");
            return this;
        }

        public Criteria andOwner_entity_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("owner_entity_id >=", value, "owner_entity_id");
            return this;
        }

        public Criteria andOwner_entity_idLessThan(Integer value) {
            addCriterion("owner_entity_id <", value, "owner_entity_id");
            return this;
        }

        public Criteria andOwner_entity_idLessThanOrEqualTo(Integer value) {
            addCriterion("owner_entity_id <=", value, "owner_entity_id");
            return this;
        }

        public Criteria andOwner_entity_idIn(List values) {
            addCriterion("owner_entity_id in", values, "owner_entity_id");
            return this;
        }

        public Criteria andOwner_entity_idNotIn(List values) {
            addCriterion("owner_entity_id not in", values, "owner_entity_id");
            return this;
        }

        public Criteria andOwner_entity_idBetween(Integer value1, Integer value2) {
            addCriterion("owner_entity_id between", value1, value2, "owner_entity_id");
            return this;
        }

        public Criteria andOwner_entity_idNotBetween(Integer value1, Integer value2) {
            addCriterion("owner_entity_id not between", value1, value2, "owner_entity_id");
            return this;
        }

        public Criteria andBank_nameIsNull() {
            criteriaWithoutValue.add("bank_name is null");
            return this;
        }

        public Criteria andBank_nameIsNotNull() {
            criteriaWithoutValue.add("bank_name is not null");
            return this;
        }

        public Criteria andBank_nameEqualTo(String value) {
            addCriterion("bank_name =", value, "bank_name");
            return this;
        }

        public Criteria andBank_nameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bank_name");
            return this;
        }

        public Criteria andBank_nameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bank_name");
            return this;
        }

        public Criteria andBank_nameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bank_name");
            return this;
        }

        public Criteria andBank_nameLessThan(String value) {
            addCriterion("bank_name <", value, "bank_name");
            return this;
        }

        public Criteria andBank_nameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bank_name");
            return this;
        }

        public Criteria andBank_nameLike(String value) {
            addCriterion("bank_name like", value, "bank_name");
            return this;
        }

        public Criteria andBank_nameNotLike(String value) {
            addCriterion("bank_name not like", value, "bank_name");
            return this;
        }

        public Criteria andBank_nameIn(List values) {
            addCriterion("bank_name in", values, "bank_name");
            return this;
        }

        public Criteria andBank_nameNotIn(List values) {
            addCriterion("bank_name not in", values, "bank_name");
            return this;
        }

        public Criteria andBank_nameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bank_name");
            return this;
        }

        public Criteria andBank_nameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bank_name");
            return this;
        }

        public Criteria andCountry_idIsNull() {
            criteriaWithoutValue.add("country_id is null");
            return this;
        }

        public Criteria andCountry_idIsNotNull() {
            criteriaWithoutValue.add("country_id is not null");
            return this;
        }

        public Criteria andCountry_idEqualTo(Integer value) {
            addCriterion("country_id =", value, "country_id");
            return this;
        }

        public Criteria andCountry_idNotEqualTo(Integer value) {
            addCriterion("country_id <>", value, "country_id");
            return this;
        }

        public Criteria andCountry_idGreaterThan(Integer value) {
            addCriterion("country_id >", value, "country_id");
            return this;
        }

        public Criteria andCountry_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("country_id >=", value, "country_id");
            return this;
        }

        public Criteria andCountry_idLessThan(Integer value) {
            addCriterion("country_id <", value, "country_id");
            return this;
        }

        public Criteria andCountry_idLessThanOrEqualTo(Integer value) {
            addCriterion("country_id <=", value, "country_id");
            return this;
        }

        public Criteria andCountry_idIn(List values) {
            addCriterion("country_id in", values, "country_id");
            return this;
        }

        public Criteria andCountry_idNotIn(List values) {
            addCriterion("country_id not in", values, "country_id");
            return this;
        }

        public Criteria andCountry_idBetween(Integer value1, Integer value2) {
            addCriterion("country_id between", value1, value2, "country_id");
            return this;
        }

        public Criteria andCountry_idNotBetween(Integer value1, Integer value2) {
            addCriterion("country_id not between", value1, value2, "country_id");
            return this;
        }

        public Criteria andAccount_type_idIsNull() {
            criteriaWithoutValue.add("account_type_id is null");
            return this;
        }

        public Criteria andAccount_type_idIsNotNull() {
            criteriaWithoutValue.add("account_type_id is not null");
            return this;
        }

        public Criteria andAccount_type_idEqualTo(Integer value) {
            addCriterion("account_type_id =", value, "account_type_id");
            return this;
        }

        public Criteria andAccount_type_idNotEqualTo(Integer value) {
            addCriterion("account_type_id <>", value, "account_type_id");
            return this;
        }

        public Criteria andAccount_type_idGreaterThan(Integer value) {
            addCriterion("account_type_id >", value, "account_type_id");
            return this;
        }

        public Criteria andAccount_type_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_type_id >=", value, "account_type_id");
            return this;
        }

        public Criteria andAccount_type_idLessThan(Integer value) {
            addCriterion("account_type_id <", value, "account_type_id");
            return this;
        }

        public Criteria andAccount_type_idLessThanOrEqualTo(Integer value) {
            addCriterion("account_type_id <=", value, "account_type_id");
            return this;
        }

        public Criteria andAccount_type_idIn(List values) {
            addCriterion("account_type_id in", values, "account_type_id");
            return this;
        }

        public Criteria andAccount_type_idNotIn(List values) {
            addCriterion("account_type_id not in", values, "account_type_id");
            return this;
        }

        public Criteria andAccount_type_idBetween(Integer value1, Integer value2) {
            addCriterion("account_type_id between", value1, value2, "account_type_id");
            return this;
        }

        public Criteria andAccount_type_idNotBetween(Integer value1, Integer value2) {
            addCriterion("account_type_id not between", value1, value2, "account_type_id");
            return this;
        }

        public Criteria andAccount_status_idIsNull() {
            criteriaWithoutValue.add("account_status_id is null");
            return this;
        }

        public Criteria andAccount_status_idIsNotNull() {
            criteriaWithoutValue.add("account_status_id is not null");
            return this;
        }

        public Criteria andAccount_status_idEqualTo(Integer value) {
            addCriterion("account_status_id =", value, "account_status_id");
            return this;
        }

        public Criteria andAccount_status_idNotEqualTo(Integer value) {
            addCriterion("account_status_id <>", value, "account_status_id");
            return this;
        }

        public Criteria andAccount_status_idGreaterThan(Integer value) {
            addCriterion("account_status_id >", value, "account_status_id");
            return this;
        }

        public Criteria andAccount_status_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_status_id >=", value, "account_status_id");
            return this;
        }

        public Criteria andAccount_status_idLessThan(Integer value) {
            addCriterion("account_status_id <", value, "account_status_id");
            return this;
        }

        public Criteria andAccount_status_idLessThanOrEqualTo(Integer value) {
            addCriterion("account_status_id <=", value, "account_status_id");
            return this;
        }

        public Criteria andAccount_status_idIn(List values) {
            addCriterion("account_status_id in", values, "account_status_id");
            return this;
        }

        public Criteria andAccount_status_idNotIn(List values) {
            addCriterion("account_status_id not in", values, "account_status_id");
            return this;
        }

        public Criteria andAccount_status_idBetween(Integer value1, Integer value2) {
            addCriterion("account_status_id between", value1, value2, "account_status_id");
            return this;
        }

        public Criteria andAccount_status_idNotBetween(Integer value1, Integer value2) {
            addCriterion("account_status_id not between", value1, value2, "account_status_id");
            return this;
        }

        public Criteria andRouting_noIsNull() {
            criteriaWithoutValue.add("routing_no is null");
            return this;
        }

        public Criteria andRouting_noIsNotNull() {
            criteriaWithoutValue.add("routing_no is not null");
            return this;
        }

        public Criteria andRouting_noEqualTo(String value) {
            addCriterion("routing_no =", value, "routing_no");
            return this;
        }

        public Criteria andRouting_noNotEqualTo(String value) {
            addCriterion("routing_no <>", value, "routing_no");
            return this;
        }

        public Criteria andRouting_noGreaterThan(String value) {
            addCriterion("routing_no >", value, "routing_no");
            return this;
        }

        public Criteria andRouting_noGreaterThanOrEqualTo(String value) {
            addCriterion("routing_no >=", value, "routing_no");
            return this;
        }

        public Criteria andRouting_noLessThan(String value) {
            addCriterion("routing_no <", value, "routing_no");
            return this;
        }

        public Criteria andRouting_noLessThanOrEqualTo(String value) {
            addCriterion("routing_no <=", value, "routing_no");
            return this;
        }

        public Criteria andRouting_noLike(String value) {
            addCriterion("routing_no like", value, "routing_no");
            return this;
        }

        public Criteria andRouting_noNotLike(String value) {
            addCriterion("routing_no not like", value, "routing_no");
            return this;
        }

        public Criteria andRouting_noIn(List values) {
            addCriterion("routing_no in", values, "routing_no");
            return this;
        }

        public Criteria andRouting_noNotIn(List values) {
            addCriterion("routing_no not in", values, "routing_no");
            return this;
        }

        public Criteria andRouting_noBetween(String value1, String value2) {
            addCriterion("routing_no between", value1, value2, "routing_no");
            return this;
        }

        public Criteria andRouting_noNotBetween(String value1, String value2) {
            addCriterion("routing_no not between", value1, value2, "routing_no");
            return this;
        }

        public Criteria andAccount_noIsNull() {
            criteriaWithoutValue.add("account_no is null");
            return this;
        }

        public Criteria andAccount_noIsNotNull() {
            criteriaWithoutValue.add("account_no is not null");
            return this;
        }

        public Criteria andAccount_noEqualTo(String value) {
            addCriterion("account_no =", value, "account_no");
            return this;
        }

        public Criteria andAccount_noNotEqualTo(String value) {
            addCriterion("account_no <>", value, "account_no");
            return this;
        }

        public Criteria andAccount_noGreaterThan(String value) {
            addCriterion("account_no >", value, "account_no");
            return this;
        }

        public Criteria andAccount_noGreaterThanOrEqualTo(String value) {
            addCriterion("account_no >=", value, "account_no");
            return this;
        }

        public Criteria andAccount_noLessThan(String value) {
            addCriterion("account_no <", value, "account_no");
            return this;
        }

        public Criteria andAccount_noLessThanOrEqualTo(String value) {
            addCriterion("account_no <=", value, "account_no");
            return this;
        }

        public Criteria andAccount_noLike(String value) {
            addCriterion("account_no like", value, "account_no");
            return this;
        }

        public Criteria andAccount_noNotLike(String value) {
            addCriterion("account_no not like", value, "account_no");
            return this;
        }

        public Criteria andAccount_noIn(List values) {
            addCriterion("account_no in", values, "account_no");
            return this;
        }

        public Criteria andAccount_noNotIn(List values) {
            addCriterion("account_no not in", values, "account_no");
            return this;
        }

        public Criteria andAccount_noBetween(String value1, String value2) {
            addCriterion("account_no between", value1, value2, "account_no");
            return this;
        }

        public Criteria andAccount_noNotBetween(String value1, String value2) {
            addCriterion("account_no not between", value1, value2, "account_no");
            return this;
        }

        public Criteria andCreated_dateIsNull() {
            criteriaWithoutValue.add("created_date is null");
            return this;
        }

        public Criteria andCreated_dateIsNotNull() {
            criteriaWithoutValue.add("created_date is not null");
            return this;
        }

        public Criteria andCreated_dateEqualTo(Date value) {
            addCriterion("created_date =", value, "created_date");
            return this;
        }

        public Criteria andCreated_dateNotEqualTo(Date value) {
            addCriterion("created_date <>", value, "created_date");
            return this;
        }

        public Criteria andCreated_dateGreaterThan(Date value) {
            addCriterion("created_date >", value, "created_date");
            return this;
        }

        public Criteria andCreated_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("created_date >=", value, "created_date");
            return this;
        }

        public Criteria andCreated_dateLessThan(Date value) {
            addCriterion("created_date <", value, "created_date");
            return this;
        }

        public Criteria andCreated_dateLessThanOrEqualTo(Date value) {
            addCriterion("created_date <=", value, "created_date");
            return this;
        }

        public Criteria andCreated_dateIn(List values) {
            addCriterion("created_date in", values, "created_date");
            return this;
        }

        public Criteria andCreated_dateNotIn(List values) {
            addCriterion("created_date not in", values, "created_date");
            return this;
        }

        public Criteria andCreated_dateBetween(Date value1, Date value2) {
            addCriterion("created_date between", value1, value2, "created_date");
            return this;
        }

        public Criteria andCreated_dateNotBetween(Date value1, Date value2) {
            addCriterion("created_date not between", value1, value2, "created_date");
            return this;
        }

        public Criteria andModified_dateIsNull() {
            criteriaWithoutValue.add("modified_date is null");
            return this;
        }

        public Criteria andModified_dateIsNotNull() {
            criteriaWithoutValue.add("modified_date is not null");
            return this;
        }

        public Criteria andModified_dateEqualTo(Date value) {
            addCriterion("modified_date =", value, "modified_date");
            return this;
        }

        public Criteria andModified_dateNotEqualTo(Date value) {
            addCriterion("modified_date <>", value, "modified_date");
            return this;
        }

        public Criteria andModified_dateGreaterThan(Date value) {
            addCriterion("modified_date >", value, "modified_date");
            return this;
        }

        public Criteria andModified_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_date >=", value, "modified_date");
            return this;
        }

        public Criteria andModified_dateLessThan(Date value) {
            addCriterion("modified_date <", value, "modified_date");
            return this;
        }

        public Criteria andModified_dateLessThanOrEqualTo(Date value) {
            addCriterion("modified_date <=", value, "modified_date");
            return this;
        }

        public Criteria andModified_dateIn(List values) {
            addCriterion("modified_date in", values, "modified_date");
            return this;
        }

        public Criteria andModified_dateNotIn(List values) {
            addCriterion("modified_date not in", values, "modified_date");
            return this;
        }

        public Criteria andModified_dateBetween(Date value1, Date value2) {
            addCriterion("modified_date between", value1, value2, "modified_date");
            return this;
        }

        public Criteria andModified_dateNotBetween(Date value1, Date value2) {
            addCriterion("modified_date not between", value1, value2, "modified_date");
            return this;
        }

        public Criteria andModified_byIsNull() {
            criteriaWithoutValue.add("modified_by is null");
            return this;
        }

        public Criteria andModified_byIsNotNull() {
            criteriaWithoutValue.add("modified_by is not null");
            return this;
        }

        public Criteria andModified_byEqualTo(String value) {
            addCriterion("modified_by =", value, "modified_by");
            return this;
        }

        public Criteria andModified_byNotEqualTo(String value) {
            addCriterion("modified_by <>", value, "modified_by");
            return this;
        }

        public Criteria andModified_byGreaterThan(String value) {
            addCriterion("modified_by >", value, "modified_by");
            return this;
        }

        public Criteria andModified_byGreaterThanOrEqualTo(String value) {
            addCriterion("modified_by >=", value, "modified_by");
            return this;
        }

        public Criteria andModified_byLessThan(String value) {
            addCriterion("modified_by <", value, "modified_by");
            return this;
        }

        public Criteria andModified_byLessThanOrEqualTo(String value) {
            addCriterion("modified_by <=", value, "modified_by");
            return this;
        }

        public Criteria andModified_byLike(String value) {
            addCriterion("modified_by like", value, "modified_by");
            return this;
        }

        public Criteria andModified_byNotLike(String value) {
            addCriterion("modified_by not like", value, "modified_by");
            return this;
        }

        public Criteria andModified_byIn(List values) {
            addCriterion("modified_by in", values, "modified_by");
            return this;
        }

        public Criteria andModified_byNotIn(List values) {
            addCriterion("modified_by not in", values, "modified_by");
            return this;
        }

        public Criteria andModified_byBetween(String value1, String value2) {
            addCriterion("modified_by between", value1, value2, "modified_by");
            return this;
        }

        public Criteria andModified_byNotBetween(String value1, String value2) {
            addCriterion("modified_by not between", value1, value2, "modified_by");
            return this;
        }
    }
}
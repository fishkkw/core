package core.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountMapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountMapExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("Id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("Id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFlowidIsNull() {
            addCriterion("FlowId is null");
            return (Criteria) this;
        }

        public Criteria andFlowidIsNotNull() {
            addCriterion("FlowId is not null");
            return (Criteria) this;
        }

        public Criteria andFlowidEqualTo(Integer value) {
            addCriterion("FlowId =", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidNotEqualTo(Integer value) {
            addCriterion("FlowId <>", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidGreaterThan(Integer value) {
            addCriterion("FlowId >", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FlowId >=", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidLessThan(Integer value) {
            addCriterion("FlowId <", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidLessThanOrEqualTo(Integer value) {
            addCriterion("FlowId <=", value, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidIn(List<Integer> values) {
            addCriterion("FlowId in", values, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidNotIn(List<Integer> values) {
            addCriterion("FlowId not in", values, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidBetween(Integer value1, Integer value2) {
            addCriterion("FlowId between", value1, value2, "flowid");
            return (Criteria) this;
        }

        public Criteria andFlowidNotBetween(Integer value1, Integer value2) {
            addCriterion("FlowId not between", value1, value2, "flowid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("CompanyId is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("CompanyId is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Long value) {
            addCriterion("CompanyId =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Long value) {
            addCriterion("CompanyId <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Long value) {
            addCriterion("CompanyId >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Long value) {
            addCriterion("CompanyId >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Long value) {
            addCriterion("CompanyId <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Long value) {
            addCriterion("CompanyId <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Long> values) {
            addCriterion("CompanyId in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Long> values) {
            addCriterion("CompanyId not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Long value1, Long value2) {
            addCriterion("CompanyId between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Long value1, Long value2) {
            addCriterion("CompanyId not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("Amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("Amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("Amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("Amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("Amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("Amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("Amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("Amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("Amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("Amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("Amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("Amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSysCtimeIsNull() {
            addCriterion("SYS_CTIME is null");
            return (Criteria) this;
        }

        public Criteria andSysCtimeIsNotNull() {
            addCriterion("SYS_CTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSysCtimeEqualTo(Date value) {
            addCriterion("SYS_CTIME =", value, "sysCtime");
            return (Criteria) this;
        }

        public Criteria andSysCtimeNotEqualTo(Date value) {
            addCriterion("SYS_CTIME <>", value, "sysCtime");
            return (Criteria) this;
        }

        public Criteria andSysCtimeGreaterThan(Date value) {
            addCriterion("SYS_CTIME >", value, "sysCtime");
            return (Criteria) this;
        }

        public Criteria andSysCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SYS_CTIME >=", value, "sysCtime");
            return (Criteria) this;
        }

        public Criteria andSysCtimeLessThan(Date value) {
            addCriterion("SYS_CTIME <", value, "sysCtime");
            return (Criteria) this;
        }

        public Criteria andSysCtimeLessThanOrEqualTo(Date value) {
            addCriterion("SYS_CTIME <=", value, "sysCtime");
            return (Criteria) this;
        }

        public Criteria andSysCtimeIn(List<Date> values) {
            addCriterion("SYS_CTIME in", values, "sysCtime");
            return (Criteria) this;
        }

        public Criteria andSysCtimeNotIn(List<Date> values) {
            addCriterion("SYS_CTIME not in", values, "sysCtime");
            return (Criteria) this;
        }

        public Criteria andSysCtimeBetween(Date value1, Date value2) {
            addCriterion("SYS_CTIME between", value1, value2, "sysCtime");
            return (Criteria) this;
        }

        public Criteria andSysCtimeNotBetween(Date value1, Date value2) {
            addCriterion("SYS_CTIME not between", value1, value2, "sysCtime");
            return (Criteria) this;
        }

        public Criteria andSysUtimeIsNull() {
            addCriterion("SYS_UTIME is null");
            return (Criteria) this;
        }

        public Criteria andSysUtimeIsNotNull() {
            addCriterion("SYS_UTIME is not null");
            return (Criteria) this;
        }

        public Criteria andSysUtimeEqualTo(Date value) {
            addCriterion("SYS_UTIME =", value, "sysUtime");
            return (Criteria) this;
        }

        public Criteria andSysUtimeNotEqualTo(Date value) {
            addCriterion("SYS_UTIME <>", value, "sysUtime");
            return (Criteria) this;
        }

        public Criteria andSysUtimeGreaterThan(Date value) {
            addCriterion("SYS_UTIME >", value, "sysUtime");
            return (Criteria) this;
        }

        public Criteria andSysUtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SYS_UTIME >=", value, "sysUtime");
            return (Criteria) this;
        }

        public Criteria andSysUtimeLessThan(Date value) {
            addCriterion("SYS_UTIME <", value, "sysUtime");
            return (Criteria) this;
        }

        public Criteria andSysUtimeLessThanOrEqualTo(Date value) {
            addCriterion("SYS_UTIME <=", value, "sysUtime");
            return (Criteria) this;
        }

        public Criteria andSysUtimeIn(List<Date> values) {
            addCriterion("SYS_UTIME in", values, "sysUtime");
            return (Criteria) this;
        }

        public Criteria andSysUtimeNotIn(List<Date> values) {
            addCriterion("SYS_UTIME not in", values, "sysUtime");
            return (Criteria) this;
        }

        public Criteria andSysUtimeBetween(Date value1, Date value2) {
            addCriterion("SYS_UTIME between", value1, value2, "sysUtime");
            return (Criteria) this;
        }

        public Criteria andSysUtimeNotBetween(Date value1, Date value2) {
            addCriterion("SYS_UTIME not between", value1, value2, "sysUtime");
            return (Criteria) this;
        }

        public Criteria andSysValidIsNull() {
            addCriterion("SYS_VALID is null");
            return (Criteria) this;
        }

        public Criteria andSysValidIsNotNull() {
            addCriterion("SYS_VALID is not null");
            return (Criteria) this;
        }

        public Criteria andSysValidEqualTo(Byte value) {
            addCriterion("SYS_VALID =", value, "sysValid");
            return (Criteria) this;
        }

        public Criteria andSysValidNotEqualTo(Byte value) {
            addCriterion("SYS_VALID <>", value, "sysValid");
            return (Criteria) this;
        }

        public Criteria andSysValidGreaterThan(Byte value) {
            addCriterion("SYS_VALID >", value, "sysValid");
            return (Criteria) this;
        }

        public Criteria andSysValidGreaterThanOrEqualTo(Byte value) {
            addCriterion("SYS_VALID >=", value, "sysValid");
            return (Criteria) this;
        }

        public Criteria andSysValidLessThan(Byte value) {
            addCriterion("SYS_VALID <", value, "sysValid");
            return (Criteria) this;
        }

        public Criteria andSysValidLessThanOrEqualTo(Byte value) {
            addCriterion("SYS_VALID <=", value, "sysValid");
            return (Criteria) this;
        }

        public Criteria andSysValidIn(List<Byte> values) {
            addCriterion("SYS_VALID in", values, "sysValid");
            return (Criteria) this;
        }

        public Criteria andSysValidNotIn(List<Byte> values) {
            addCriterion("SYS_VALID not in", values, "sysValid");
            return (Criteria) this;
        }

        public Criteria andSysValidBetween(Byte value1, Byte value2) {
            addCriterion("SYS_VALID between", value1, value2, "sysValid");
            return (Criteria) this;
        }

        public Criteria andSysValidNotBetween(Byte value1, Byte value2) {
            addCriterion("SYS_VALID not between", value1, value2, "sysValid");
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
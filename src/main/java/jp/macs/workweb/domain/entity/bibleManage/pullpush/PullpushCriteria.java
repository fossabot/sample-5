package jp.macs.workweb.domain.entity.bibleManage.pullpush;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PullpushCriteria {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table pullpush
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table pullpush
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table pullpush
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pullpush
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public PullpushCriteria() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pullpush
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pullpush
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pullpush
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pullpush
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pullpush
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pullpush
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pullpush
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pullpush
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pullpush
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table pullpush
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table pullpush
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
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

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andPullpushIdIsNull() {
			addCriterion("pullpush_id is null");
			return (Criteria) this;
		}

		public Criteria andPullpushIdIsNotNull() {
			addCriterion("pullpush_id is not null");
			return (Criteria) this;
		}

		public Criteria andPullpushIdEqualTo(Integer value) {
			addCriterion("pullpush_id =", value, "pullpushId");
			return (Criteria) this;
		}

		public Criteria andPullpushIdNotEqualTo(Integer value) {
			addCriterion("pullpush_id <>", value, "pullpushId");
			return (Criteria) this;
		}

		public Criteria andPullpushIdGreaterThan(Integer value) {
			addCriterion("pullpush_id >", value, "pullpushId");
			return (Criteria) this;
		}

		public Criteria andPullpushIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("pullpush_id >=", value, "pullpushId");
			return (Criteria) this;
		}

		public Criteria andPullpushIdLessThan(Integer value) {
			addCriterion("pullpush_id <", value, "pullpushId");
			return (Criteria) this;
		}

		public Criteria andPullpushIdLessThanOrEqualTo(Integer value) {
			addCriterion("pullpush_id <=", value, "pullpushId");
			return (Criteria) this;
		}

		public Criteria andPullpushIdIn(List<Integer> values) {
			addCriterion("pullpush_id in", values, "pullpushId");
			return (Criteria) this;
		}

		public Criteria andPullpushIdNotIn(List<Integer> values) {
			addCriterion("pullpush_id not in", values, "pullpushId");
			return (Criteria) this;
		}

		public Criteria andPullpushIdBetween(Integer value1, Integer value2) {
			addCriterion("pullpush_id between", value1, value2, "pullpushId");
			return (Criteria) this;
		}

		public Criteria andPullpushIdNotBetween(Integer value1, Integer value2) {
			addCriterion("pullpush_id not between", value1, value2, "pullpushId");
			return (Criteria) this;
		}

		public Criteria andEachDocIdIsNull() {
			addCriterion("each_doc_id is null");
			return (Criteria) this;
		}

		public Criteria andEachDocIdIsNotNull() {
			addCriterion("each_doc_id is not null");
			return (Criteria) this;
		}

		public Criteria andEachDocIdEqualTo(Integer value) {
			addCriterion("each_doc_id =", value, "eachDocId");
			return (Criteria) this;
		}

		public Criteria andEachDocIdNotEqualTo(Integer value) {
			addCriterion("each_doc_id <>", value, "eachDocId");
			return (Criteria) this;
		}

		public Criteria andEachDocIdGreaterThan(Integer value) {
			addCriterion("each_doc_id >", value, "eachDocId");
			return (Criteria) this;
		}

		public Criteria andEachDocIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("each_doc_id >=", value, "eachDocId");
			return (Criteria) this;
		}

		public Criteria andEachDocIdLessThan(Integer value) {
			addCriterion("each_doc_id <", value, "eachDocId");
			return (Criteria) this;
		}

		public Criteria andEachDocIdLessThanOrEqualTo(Integer value) {
			addCriterion("each_doc_id <=", value, "eachDocId");
			return (Criteria) this;
		}

		public Criteria andEachDocIdIn(List<Integer> values) {
			addCriterion("each_doc_id in", values, "eachDocId");
			return (Criteria) this;
		}

		public Criteria andEachDocIdNotIn(List<Integer> values) {
			addCriterion("each_doc_id not in", values, "eachDocId");
			return (Criteria) this;
		}

		public Criteria andEachDocIdBetween(Integer value1, Integer value2) {
			addCriterion("each_doc_id between", value1, value2, "eachDocId");
			return (Criteria) this;
		}

		public Criteria andEachDocIdNotBetween(Integer value1, Integer value2) {
			addCriterion("each_doc_id not between", value1, value2, "eachDocId");
			return (Criteria) this;
		}

		public Criteria andFileIdIsNull() {
			addCriterion("file_id is null");
			return (Criteria) this;
		}

		public Criteria andFileIdIsNotNull() {
			addCriterion("file_id is not null");
			return (Criteria) this;
		}

		public Criteria andFileIdEqualTo(Integer value) {
			addCriterion("file_id =", value, "fileId");
			return (Criteria) this;
		}

		public Criteria andFileIdNotEqualTo(Integer value) {
			addCriterion("file_id <>", value, "fileId");
			return (Criteria) this;
		}

		public Criteria andFileIdGreaterThan(Integer value) {
			addCriterion("file_id >", value, "fileId");
			return (Criteria) this;
		}

		public Criteria andFileIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("file_id >=", value, "fileId");
			return (Criteria) this;
		}

		public Criteria andFileIdLessThan(Integer value) {
			addCriterion("file_id <", value, "fileId");
			return (Criteria) this;
		}

		public Criteria andFileIdLessThanOrEqualTo(Integer value) {
			addCriterion("file_id <=", value, "fileId");
			return (Criteria) this;
		}

		public Criteria andFileIdIn(List<Integer> values) {
			addCriterion("file_id in", values, "fileId");
			return (Criteria) this;
		}

		public Criteria andFileIdNotIn(List<Integer> values) {
			addCriterion("file_id not in", values, "fileId");
			return (Criteria) this;
		}

		public Criteria andFileIdBetween(Integer value1, Integer value2) {
			addCriterion("file_id between", value1, value2, "fileId");
			return (Criteria) this;
		}

		public Criteria andFileIdNotBetween(Integer value1, Integer value2) {
			addCriterion("file_id not between", value1, value2, "fileId");
			return (Criteria) this;
		}

		public Criteria andFolderIdIsNull() {
			addCriterion("folder_id is null");
			return (Criteria) this;
		}

		public Criteria andFolderIdIsNotNull() {
			addCriterion("folder_id is not null");
			return (Criteria) this;
		}

		public Criteria andFolderIdEqualTo(Integer value) {
			addCriterion("folder_id =", value, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdNotEqualTo(Integer value) {
			addCriterion("folder_id <>", value, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdGreaterThan(Integer value) {
			addCriterion("folder_id >", value, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("folder_id >=", value, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdLessThan(Integer value) {
			addCriterion("folder_id <", value, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdLessThanOrEqualTo(Integer value) {
			addCriterion("folder_id <=", value, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdIn(List<Integer> values) {
			addCriterion("folder_id in", values, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdNotIn(List<Integer> values) {
			addCriterion("folder_id not in", values, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdBetween(Integer value1, Integer value2) {
			addCriterion("folder_id between", value1, value2, "folderId");
			return (Criteria) this;
		}

		public Criteria andFolderIdNotBetween(Integer value1, Integer value2) {
			addCriterion("folder_id not between", value1, value2, "folderId");
			return (Criteria) this;
		}

		public Criteria andProjectIdIsNull() {
			addCriterion("project_id is null");
			return (Criteria) this;
		}

		public Criteria andProjectIdIsNotNull() {
			addCriterion("project_id is not null");
			return (Criteria) this;
		}

		public Criteria andProjectIdEqualTo(Integer value) {
			addCriterion("project_id =", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdNotEqualTo(Integer value) {
			addCriterion("project_id <>", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdGreaterThan(Integer value) {
			addCriterion("project_id >", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("project_id >=", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdLessThan(Integer value) {
			addCriterion("project_id <", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
			addCriterion("project_id <=", value, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdIn(List<Integer> values) {
			addCriterion("project_id in", values, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdNotIn(List<Integer> values) {
			addCriterion("project_id not in", values, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdBetween(Integer value1, Integer value2) {
			addCriterion("project_id between", value1, value2, "projectId");
			return (Criteria) this;
		}

		public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
			addCriterion("project_id not between", value1, value2, "projectId");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Integer value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Integer value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Integer value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Integer value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Integer value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Integer> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Integer> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Integer value1, Integer value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andPulledDateIsNull() {
			addCriterion("pulled_date is null");
			return (Criteria) this;
		}

		public Criteria andPulledDateIsNotNull() {
			addCriterion("pulled_date is not null");
			return (Criteria) this;
		}

		public Criteria andPulledDateEqualTo(Date value) {
			addCriterionForJDBCDate("pulled_date =", value, "pulledDate");
			return (Criteria) this;
		}

		public Criteria andPulledDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("pulled_date <>", value, "pulledDate");
			return (Criteria) this;
		}

		public Criteria andPulledDateGreaterThan(Date value) {
			addCriterionForJDBCDate("pulled_date >", value, "pulledDate");
			return (Criteria) this;
		}

		public Criteria andPulledDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("pulled_date >=", value, "pulledDate");
			return (Criteria) this;
		}

		public Criteria andPulledDateLessThan(Date value) {
			addCriterionForJDBCDate("pulled_date <", value, "pulledDate");
			return (Criteria) this;
		}

		public Criteria andPulledDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("pulled_date <=", value, "pulledDate");
			return (Criteria) this;
		}

		public Criteria andPulledDateIn(List<Date> values) {
			addCriterionForJDBCDate("pulled_date in", values, "pulledDate");
			return (Criteria) this;
		}

		public Criteria andPulledDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("pulled_date not in", values, "pulledDate");
			return (Criteria) this;
		}

		public Criteria andPulledDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("pulled_date between", value1, value2, "pulledDate");
			return (Criteria) this;
		}

		public Criteria andPulledDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("pulled_date not between", value1, value2, "pulledDate");
			return (Criteria) this;
		}

		public Criteria andPushedDateIsNull() {
			addCriterion("pushed_date is null");
			return (Criteria) this;
		}

		public Criteria andPushedDateIsNotNull() {
			addCriterion("pushed_date is not null");
			return (Criteria) this;
		}

		public Criteria andPushedDateEqualTo(Date value) {
			addCriterionForJDBCDate("pushed_date =", value, "pushedDate");
			return (Criteria) this;
		}

		public Criteria andPushedDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("pushed_date <>", value, "pushedDate");
			return (Criteria) this;
		}

		public Criteria andPushedDateGreaterThan(Date value) {
			addCriterionForJDBCDate("pushed_date >", value, "pushedDate");
			return (Criteria) this;
		}

		public Criteria andPushedDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("pushed_date >=", value, "pushedDate");
			return (Criteria) this;
		}

		public Criteria andPushedDateLessThan(Date value) {
			addCriterionForJDBCDate("pushed_date <", value, "pushedDate");
			return (Criteria) this;
		}

		public Criteria andPushedDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("pushed_date <=", value, "pushedDate");
			return (Criteria) this;
		}

		public Criteria andPushedDateIn(List<Date> values) {
			addCriterionForJDBCDate("pushed_date in", values, "pushedDate");
			return (Criteria) this;
		}

		public Criteria andPushedDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("pushed_date not in", values, "pushedDate");
			return (Criteria) this;
		}

		public Criteria andPushedDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("pushed_date between", value1, value2, "pushedDate");
			return (Criteria) this;
		}

		public Criteria andPushedDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("pushed_date not between", value1, value2, "pushedDate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table pullpush
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pullpush
     *
     * @mbg.generated do_not_delete_during_merge Sun Jan 22 15:04:47 JST 2023
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}
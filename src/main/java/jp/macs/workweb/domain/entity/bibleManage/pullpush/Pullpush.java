package jp.macs.workweb.domain.entity.bibleManage.pullpush;

import java.io.Serializable;
import java.util.Date;

public class Pullpush implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pullpush.pullpush_id
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	private Integer pullpushId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pullpush.each_doc_id
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	private Integer eachDocId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pullpush.file_id
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	private Integer fileId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pullpush.folder_id
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	private Integer folderId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pullpush.project_id
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	private Integer projectId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pullpush.status
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	private Integer status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pullpush.pulled_date
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	private Date pulledDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column pullpush.pushed_date
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	private Date pushedDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table pullpush
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pullpush.pullpush_id
	 * @return  the value of pullpush.pullpush_id
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public Integer getPullpushId() {
		return pullpushId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pullpush.pullpush_id
	 * @param pullpushId  the value for pullpush.pullpush_id
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public void setPullpushId(Integer pullpushId) {
		this.pullpushId = pullpushId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pullpush.each_doc_id
	 * @return  the value of pullpush.each_doc_id
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public Integer getEachDocId() {
		return eachDocId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pullpush.each_doc_id
	 * @param eachDocId  the value for pullpush.each_doc_id
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public void setEachDocId(Integer eachDocId) {
		this.eachDocId = eachDocId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pullpush.file_id
	 * @return  the value of pullpush.file_id
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public Integer getFileId() {
		return fileId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pullpush.file_id
	 * @param fileId  the value for pullpush.file_id
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pullpush.folder_id
	 * @return  the value of pullpush.folder_id
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public Integer getFolderId() {
		return folderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pullpush.folder_id
	 * @param folderId  the value for pullpush.folder_id
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public void setFolderId(Integer folderId) {
		this.folderId = folderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pullpush.project_id
	 * @return  the value of pullpush.project_id
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public Integer getProjectId() {
		return projectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pullpush.project_id
	 * @param projectId  the value for pullpush.project_id
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pullpush.status
	 * @return  the value of pullpush.status
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pullpush.status
	 * @param status  the value for pullpush.status
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pullpush.pulled_date
	 * @return  the value of pullpush.pulled_date
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public Date getPulledDate() {
		return pulledDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pullpush.pulled_date
	 * @param pulledDate  the value for pullpush.pulled_date
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public void setPulledDate(Date pulledDate) {
		this.pulledDate = pulledDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column pullpush.pushed_date
	 * @return  the value of pullpush.pushed_date
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public Date getPushedDate() {
		return pushedDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column pullpush.pushed_date
	 * @param pushedDate  the value for pullpush.pushed_date
	 * @mbg.generated  Tue Jan 24 22:24:03 JST 2023
	 */
	public void setPushedDate(Date pushedDate) {
		this.pushedDate = pushedDate;
	}
}
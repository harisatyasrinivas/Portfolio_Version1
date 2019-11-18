package com.satya.career.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="PROJECT")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PROJECT_ID")
	private long id;
	@Column(name = "PROJECT_NAME")
	private String projectName;
	@Temporal(TemporalType.DATE)
	@Column(name = "FROM_DATE")
	private Date fromDate;
	@Temporal(TemporalType.DATE)
	@Column(name = "TO_DATE")
	private Date ToDate;
	@Lob
	@Column(name = "PROJECT_DESC")
	private String desc;
	@Lob
	@Column(name = "PROJECT_TASKS")
	private String tasks;
	@ManyToOne
	@JoinColumn(name = "WORKEXP_ID")
	private WorkExp workExp;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return ToDate;
	}
	public void setToDate(Date toDate) {
		ToDate = toDate;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getTasks() {
		return tasks;
	}
	public void setTasks(String tasks) {
		this.tasks = tasks;
	}
	public WorkExp getWorkExp() {
		return workExp;
	}
	public void setWorkExp(WorkExp workExp) {
		this.workExp = workExp;
	}
		
}

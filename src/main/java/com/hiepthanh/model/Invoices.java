package com.hiepthanh.model;
// Generated Dec 10, 2017 11:02:05 PM by Hibernate Tools 5.2.6.Final

import java.util.Date;

/**
 * Invoices generated by hbm2java
 */
public class Invoices implements java.io.Serializable {

	private Integer id;
	private Integer status;
	private int customerId;
	private Integer total;
	private Date created;
	private Date lastUpdated;

	public Invoices() {
	}

	public Invoices(int customerId, Date created, Date lastUpdated) {
		this.customerId = customerId;
		this.created = created;
		this.lastUpdated = lastUpdated;
	}

	public Invoices(Integer status, int customerId, Integer total, Date created, Date lastUpdated) {
		this.status = status;
		this.customerId = customerId;
		this.total = total;
		this.created = created;
		this.lastUpdated = lastUpdated;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

}

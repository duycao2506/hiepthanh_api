package com.hiepthanh.model;
// Generated Dec 10, 2017 11:02:05 PM by Hibernate Tools 5.2.6.Final

import java.util.Date;

/**
 * Articles generated by hbm2java
 */
public class Articles implements java.io.Serializable {

	private Integer id;
	private String name;
	private String descript;
	private String content;
	private String tags;
	private Date created;
	private Date lastUpdated;
	private int composerId;

	public Articles() {
	}

	public Articles(String name, Date created, Date lastUpdated, int composerId) {
		this.name = name;
		this.created = created;
		this.lastUpdated = lastUpdated;
		this.composerId = composerId;
	}

	public Articles(String name, String descript, String content, String tags, Date created, Date lastUpdated,
			int composerId) {
		this.name = name;
		this.descript = descript;
		this.content = content;
		this.tags = tags;
		this.created = created;
		this.lastUpdated = lastUpdated;
		this.composerId = composerId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescript() {
		return this.descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
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

	public int getComposerId() {
		return this.composerId;
	}

	public void setComposerId(int composerId) {
		this.composerId = composerId;
	}

}

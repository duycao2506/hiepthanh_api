package com.hiepthanh.model;
// Generated Dec 10, 2017 11:02:05 PM by Hibernate Tools 5.2.6.Final

/**
 * OrderedList generated by hbm2java
 */
public class OrderedList implements java.io.Serializable {

	private int id;
	private int invoiceId;
	private int amount;
	private int unitPrice;
	private String unit;
	private String name;
	private String currency;

	public OrderedList() {
	}

	public OrderedList(int id, int invoiceId, int amount, int unitPrice, String unit, String name, String currency) {
		this.id = id;
		this.invoiceId = invoiceId;
		this.amount = amount;
		this.unitPrice = unitPrice;
		this.unit = unit;
		this.name = name;
		this.currency = currency;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}

 package com.model;

public class AddAssets {
	
	private String rfid;
	private String assetTag;
	private int serialNumber;
	private String description;
	private String friendlyName;
	private String model;
	private String manufacturer;
	private String date;
	private double cost;
	private String room;
	private String pContact;
	private String secContact;
	public AddAssets() {
		// TODO Auto-generated constructor stub
	}
	public AddAssets(String rfid, String assetTag, int serialNumber, String description, String friendlyName,
			String model, String manufacturer, String date, double cost, String room, String pContact,
			String secContact) {
		super();
		this.rfid = rfid;
		this.assetTag = assetTag;
		this.serialNumber = serialNumber;
		this.description = description;
		this.friendlyName = friendlyName;
		this.model = model;
		this.manufacturer = manufacturer;
		this.date = date;
		this.cost = cost;
		this.room = room;
		this.pContact = pContact;
		this.secContact = secContact;
	}
	public String getRfid() {
		return rfid;
	}
	public void setRfid(String rfid) {
		this.rfid = rfid;
	}
	public String getAssetTag() {
		return assetTag;
	}
	public void setAssetTag(String assetTag) {
		this.assetTag = assetTag;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFirendlyName() {
		return friendlyName;
	}
	public void setFirendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manfacturer) {
		this.manufacturer = manfacturer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getpContact() {
		return pContact;
	}
	public void setpContact(String pContact) {
		this.pContact = pContact;
	}
	public String getSecContact() {
		return secContact;
	}
	public void setSecContact(String secContact) {
		this.secContact = secContact;
	}
	@Override
	public String toString() {
		return "AddAssets [rfid=" + rfid + ", assetTag=" + assetTag + ", SerialNumber=" + serialNumber
				+ ", description=" + description + ", firendlyName=" + friendlyName + ", model=" + model
				+ ", manfacturer=" + manufacturer + ", date=" + date + ", cost=" + cost + ", room=" + room
				+ ", pContact=" + pContact + ", secContact=" + secContact + "]";
	}
	


}

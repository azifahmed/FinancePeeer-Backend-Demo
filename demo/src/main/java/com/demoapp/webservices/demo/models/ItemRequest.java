package com.demoapp.webservices.demo.models;

public class ItemRequest {

	public ItemRequest() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	
	public ItemRequest(int iD, int userId) {
		super();
		id = iD;
		this.userId = userId;
	}
	private int  userId;
	
	public int getId() {
		return id;
	}
	public void setId(int iD) {
		id = iD;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserID(int userId) {
		this.userId = userId;
	}

}

package com.demoapp.webservices.demo.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Items")
public class ItemVO {

	public ItemVO() {
		// TODO Auto-generated constructor stub
	}
	@Id
	private String _id;
	
	private int id;
	
	private int userId;
	
	private String title;
	
	@Field(name="body")
	private String description;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ItemVO(int id, int userId, String title, String description) {
		super();
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.description = description;
	}
	

}

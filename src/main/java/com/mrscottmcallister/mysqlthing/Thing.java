package com.mrscottmcallister.mysqlthing;

public class Thing {
	private String name;
	private String description;
	public Thing(String pName, String pDescription){
		name = pName;
		description = pDescription;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}

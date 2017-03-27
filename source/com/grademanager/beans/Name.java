package com.grademanager.beans;

public class Name {
	private String id ;
	private String name ;
	private int version;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Name(String id, String name,int version) {
		super();
		this.id = id;
		this.name = name;
		this.setVersion(version);
	}
	public Name() {
		super();
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	

}

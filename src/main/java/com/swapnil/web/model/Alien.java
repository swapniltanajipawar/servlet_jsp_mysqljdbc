package com.swapnil.web.model;

public class Alien {

	//java is oop programming lang so we have to pass data in the form of object
	//class whose object represent the data is the model object
	
	private int aid;
	private String aname;
	private String tech;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}

	//NO constructor used here...keep in mind...
	//to print the object -> to avoid the print the hashcode as we want to print the data.
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}
	
}

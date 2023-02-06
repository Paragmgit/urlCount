package com.example.Urlcount.model;

public class Visit {
    private int count;
	private String username;
	public Visit(int count, String usename) {
		super();
		this.count = count;
		username = usename;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		username = userName;
	}
	@Override
	public String toString() {
		return "UrlService [count=" + count + ", UserName=" + username + "]";
	}
}

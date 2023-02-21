package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FeedBack {
	@Id
	private int fid;
	private String feed;
	private int cid;
	public FeedBack() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FeedBack(int fid, String feed, int cid) {
		super();
		this.fid = fid;
		this.feed = feed;
		this.cid = cid;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFeed() {
		return feed;
	}
	public void setFeed(String feed) {
		this.feed = feed;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "FeedBack [fid=" + fid + ", feed=" + feed + ", cid=" + cid + "]";
	}
	
	
	
	

}

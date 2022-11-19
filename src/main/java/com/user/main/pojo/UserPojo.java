package com.user.main.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="userpojo")
public class UserPojo {
    @Id
    @GeneratedValue
	private int uid;
	private String uname;
	public int getUid() {
		
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	@Override
	public String toString() {
		return "UserPojo [uid=" + uid + ", uname=" + uname + "]";
	}
	
}

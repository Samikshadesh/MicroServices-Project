package com.Hcc.Menu.vo;

import jakarta.persistence.Id;

public class MenuItem {
	@Id
	Long id;
	
	String mname;

	public Long getMid() {
		return id;
	}

	public void setMid(Long mid) {
		this.id = id;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

}

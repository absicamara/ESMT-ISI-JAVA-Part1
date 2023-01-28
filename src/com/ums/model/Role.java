package com.ums.model;


public enum Role {
	
	SIMPLE_USER, ADMINISTRATOR;
	
    public String getValue() {
        return this.name();
    }
}

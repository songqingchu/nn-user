package com.example.demo.dto;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class Point {

	public Point() {
		
	}
	
	private String group;
	private String key;
	private Map<String, Object> tags=new HashMap<String,Object>();
	private Map<String, Object> fields=new HashMap<String,Object>();
	private long time;
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Map<String, Object> getTags() {
		return tags;
	}
	public void setTags(Map<String, Object> tags) {
		this.tags = tags;
	}
	public Map<String, Object> getFields() {
		return fields;
	}
	public void setFields(Map<String, Object> fields) {
		this.fields = fields;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	
	public Point key(String key) {
		this.setKey(key);
		return this;
	}
	
    public Point group(String group) {
		this.setGroup(group);
		return this;
	}
    
    public Point addField(String key,Object value) {
		this.getFields().put(key, value);
		return this;
	}
    
    public Point addTag(String key,String value) {
		this.getTags().put(key, value);
		return this;
	}

    public void build() {
		this.time=System.currentTimeMillis();
	}
    
    public String toString() {
    	String s="";
    	s=s+this.group+";";
    	s=s+this.key+";";
    	s=s+this.time+";";
    	s=s+JSON.toJSONString(this.tags)+";";
    	s=s+JSON.toJSONString(this.fields);
    	return s;
    }
}

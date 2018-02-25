package com.example.demo.dto;

public class Data {

	public Data() {
		
	}
	
	private String group;
	private String key;
	private long time;
	private String tag;
	private String tagVal;
	private String field;
	private String fieldVal;
	
	public String getTagVal() {
		return tagVal;
	}
	public void setTagVal(String tagVal) {
		this.tagVal = tagVal;
	}
	public String getFieldVal() {
		return fieldVal;
	}
	public void setFieldVal(String fieldVal) {
		this.fieldVal = fieldVal;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
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

	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	
	public Data key(String key) {
		this.setKey(key);
		return this;
	}
	
    public Data group(String group) {
		this.setGroup(group);
		return this;
	}
    
    public Data field(String field) {
		this.setField(field);
		return this;
	}
    public Data fieldVal(String fieldVal) {
		this.setFieldVal(fieldVal);
		return this;
	}
    public Data tag(String tag) {
		this.setTag(tag);
		return this;
	}
    public Data tagVal(String tagVal) {
		this.setTagVal(tagVal);
		return this;
	}
    public void build() {
		this.time=System.currentTimeMillis();
	}
    
    public String toString() {
    	String s="";
    	s=s+this.group+" ";
    	s=s+this.key+" ";
    	s=s+this.time+" ";
    	s=s+this.tag+" ";
    	s=s+this.tagVal+" ";
    	s=s+this.field+" ";
    	s=s+this.fieldVal;
    	return s;
    }
}

package com.example.demo.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User implements Serializable {

    private static final long serialVersionUID = -1L;

    private String name;
    /*private Integer age;
    private Integer cityId;
*/
/*    public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}*/

	public User() {
    	
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }*/

}


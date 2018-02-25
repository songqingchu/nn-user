package com.example.demo.config;

import java.util.ArrayList;
import java.util.List;

public class A {

	private static List<List<Long>> split(List<Long> orderIds){
    	List<List<Long>> splitList=new ArrayList<List<Long>>();
    	int unit=10;
    	int splitNum=orderIds.size()/unit;
		if(splitNum>0) {
			for(int i=0;i<splitNum;i++) {
				List<Long> split=new ArrayList<Long>();
				for(int j=0;j<unit;j++) {
					split.add(orderIds.get(unit*i+j));
				}
				splitList.add(split);
			}
            if(orderIds.size()%unit!=0) {
            	List<Long> split=new ArrayList<Long>();
    			for(int i=splitNum*unit;i<orderIds.size();i++){
    				split.add(orderIds.get(i));
    			}
    			splitList.add(split);
			}
			
		}else {
			splitList.add(orderIds);
		}
    	return splitList;
    }
	
    public static void main(String[] args ) {
    	List<Long> ids=new ArrayList<Long>();
    	for(long i=0;i<21;i++) {
    		ids.add(i);
    	}
    	List<List<Long>> splitList=split(ids);
    	System.out.println(splitList);
    	
    }
}

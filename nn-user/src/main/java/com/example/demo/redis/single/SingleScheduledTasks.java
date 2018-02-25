package com.example.demo.redis.single;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.jaxrs.FastJsonAutoDiscoverable;
import com.example.demo.dto.Data;
import com.example.demo.dto.Point;

@Component
public class SingleScheduledTasks {


	
	private static Logger log = LoggerFactory.getLogger("test");


    
	Random r=new Random();
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@Resource
    RedisTemplate redisTemplate ;
    
    @Scheduled(fixedRate = 10000)
    public void reportCurrentTime() {
        Data p=new Data();
        p.group("dispatch").key("trade").tag("ip").tagVal("127.0.0.1").field("getById.cost").fieldVal(""+r.nextInt(30)).build();
        log.info(JSON.toJSONString(p));
        System.out.println(JSON.toJSONString(p));
    }

    public void a() {
    	System.out.println("当前时间：" + dateFormat.format(new Date()));
        Object r=redisTemplate.opsForValue().get("liu");
        log.info("----"+dateFormat.format(new Date()));
        //System.out.println("redis：" + dateFormat.format(new Date()));
    }
    
    
    public void setRedisTemplate(RedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
    
}

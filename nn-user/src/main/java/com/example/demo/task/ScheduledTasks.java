package com.example.demo.task;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.Resource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.alibaba.fastjson.JSON;

@Component
public class ScheduledTasks {



	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Resource
    RedisTemplate redisTemplate ;
    
    @Scheduled(fixedRate = 2000)
    public void reportCurrentTime() {
        System.out.println("当前时间：" + dateFormat.format(new Date()));
        Object r=redisTemplate.opsForValue().get("liuq");
        System.out.println("redis：" + JSON.toJSONString(r));
    }

    
    
    public void setRedisTemplate(RedisTemplate redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
}

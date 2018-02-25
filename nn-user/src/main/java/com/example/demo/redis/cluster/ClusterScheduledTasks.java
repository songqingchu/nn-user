package com.example.demo.redis.cluster;



import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.example.demo.config.redis.RedisClusterTemplate;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

@Component
public class ClusterScheduledTasks {


/*
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Resource
	RedisClusterTemplate redisClusterTemplate ;
    
    @Scheduled(fixedRate = 2000)
    public void reportCurrentTime() {
    	Random r=new Random();
    	int rand=r.nextInt(10);
        redisClusterTemplate.set(""+rand,""+rand);
    	System.out.print("get：" + rand);
        Object result=redisClusterTemplate.get(""+rand);
        System.out.println(",  redis：" + JSON.toJSONString(result));
    }

	public void setRedisClusterTemplate(RedisClusterTemplate redisClusterTemplate) {
		this.redisClusterTemplate = redisClusterTemplate;
	}
	
	public static void main(String args[]) {
		JedisPoolConfig config = new JedisPoolConfig();
		config =new JedisPoolConfig();
		       config.setMaxTotal(60000);//设置最大连接数  
		       config.setMaxIdle(20); //设置最大空闲数 
		       config.setMaxWaitMillis(5000);//设置超时时间  
		       config.setTestOnBorrow(true);


		// 集群结点
		Set<HostAndPort> jedisClusterNode = new HashSet<HostAndPort>();
		jedisClusterNode.add(new HostAndPort("39.104.62.112", Integer.parseInt("7001")));
		jedisClusterNode.add(new HostAndPort("39.104.62.112", Integer.parseInt("7002")));
		jedisClusterNode.add(new HostAndPort("39.104.62.112", Integer.parseInt("7003")));
		jedisClusterNode.add(new HostAndPort("39.104.62.112", Integer.parseInt("7004")));
		jedisClusterNode.add(new HostAndPort("39.104.62.112", Integer.parseInt("7005")));
		jedisClusterNode.add(new HostAndPort("39.104.62.112", Integer.parseInt("7006")));

		JedisCluster jc =null;
		try {
		jc=new JedisCluster(jedisClusterNode, config);
		jc.set("wang", "wang");
		String value = jc.get("wang");
		System.out.println(value);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				jc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}*/
}

package com.example.demo.config.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import redis.clients.jedis.JedisCluster;
@Component
public class RedisClusterTemplate {
	     private static final Logger LOGGER    = LoggerFactory.getLogger(RedisClusterTemplate.class);
	 
	     @Autowired
	     private JedisCluster        jedisCluster;
	 
	     @Autowired
	     private RedisClusterProperties     redisClusterProperties;
	 
	 
	     /**
	      * 设置缓存 
	      * @param prefix 缓存前缀（用于区分缓存，防止缓存键值重复）
	      * @param key    缓存key
	      * @param value  缓存value
	      */
	     public void set( String key, String value) {
	         jedisCluster.set(key, value);
	         LOGGER.debug("RedisUtil:set cache key={},value={}",  key, value);
	     }
	 
	     /**
	      * 设置缓存，并且自己指定过期时间
	      * @param prefix
	      * @param key
	      * @param value
	      * @param expireTime 过期时间
	      */
	     public void setWithExpireTime(String key, String value, int expireTime) {
	         jedisCluster.setex( key, expireTime, value);
	         LOGGER.debug("RedisUtil:setWithExpireTime cache key={},value={},expireTime={}",  key, value,
	             expireTime);
	     }
	 
	     /**
	      * 设置缓存，并且由配置文件指定过期时间
	      * @param prefix
	      * @param key
	      * @param value
	      */
	     public void setWithExpireTime( String key, String value) {
	         int EXPIRE_SECONDS = redisClusterProperties.getExpireSeconds();
	         jedisCluster.setex(key, EXPIRE_SECONDS, value);
	         LOGGER.debug("RedisUtil:setWithExpireTime cache key={},value={},expireTime={}",  key, value,
	             EXPIRE_SECONDS);
	     }
	 
	     /**
	      * 获取指定key的缓存
	      * @param prefix
	      * @param key
	      */
	     public String get(String key) {
	         String value = jedisCluster.get(key);
	         LOGGER.debug("RedisUtil:get cache key={},value={}",key, value);
	         return value;
	     }
	 
	     /**
	      * 删除指定key的缓存
	      * @param prefix
	      * @param key
	      */
	     public void deleteWithPrefix(String key) {
	         jedisCluster.del(key);
	         LOGGER.debug("RedisUtil:delete cache key={}", key);
	     }
	     
	     public void delete(String key) {
	         jedisCluster.del(key);
	         LOGGER.debug("RedisUtil:delete cache key={}", key);
	     }
}

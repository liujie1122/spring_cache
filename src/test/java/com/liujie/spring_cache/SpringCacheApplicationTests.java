package com.liujie.spring_cache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCacheApplicationTests {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	public void testRedisTemplate() {
		ValueOperations valueOperations = redisTemplate.opsForValue();//操作字符串String
		valueOperations.set("string","Hello");
//		Object string = valueOperations.get("string");
//		System.out.println(string);
		redisTemplate.opsForList();//操作列表List
		redisTemplate.opsForSet();//操作集合Set
		redisTemplate.opsForHash();//操作散列Hash
		redisTemplate.opsForZSet();//操作有序ZSet()
	}

	@Test
	public void contextLoads() {
	}

}

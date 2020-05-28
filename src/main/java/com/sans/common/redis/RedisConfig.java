package com.sans.common.redis;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {

    public static final long DEFAULT_EXPIRE = 86400L;

    /**
     * 初始化Jackson的redisTemplate模板
     * @param jedisConnectionFactory
     * @return
     */
    @Bean(name = "jacksonRedisTemplate")
    public RedisTemplate<String, Object> jacksonRedisTemplate(JedisConnectionFactory jedisConnectionFactory) {

        RedisTemplate template = new RedisTemplate<String, Object>();
        template.setConnectionFactory(jedisConnectionFactory);
        // Jackson序列化更节省空间
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        GenericJackson2JsonRedisSerializer genericJackson2JsonRedisSerializer = new GenericJackson2JsonRedisSerializer();
        template.setKeySerializer(stringRedisSerializer);
        template.setValueSerializer(genericJackson2JsonRedisSerializer);
        template.setHashKeySerializer(stringRedisSerializer);
        template.setHashValueSerializer(genericJackson2JsonRedisSerializer);

        return template;
    }

    /**
     * 初始化Long类型的RedisTemplate模板
     * @param jedisConnectionFactory
     * @return
     */
    @Bean(name = "longRedisTemplate")
    public RedisTemplate<String, Long> longRedisTemplate(JedisConnectionFactory jedisConnectionFactory) {

        RedisTemplate<String, Long> template = new RedisTemplate<String, Long>();
        template.setConnectionFactory(jedisConnectionFactory);
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        template.setKeySerializer(stringRedisSerializer);
        template.setValueSerializer(LongSerializer.INSTANCE);
        template.setHashKeySerializer(stringRedisSerializer);
        template.setHashValueSerializer(LongSerializer.INSTANCE);

        return template;
    }

    /**
     * 初始化Integer类型的RedisTemplate模板
     * @param jedisConnectionFactory
     * @return
     */
    @Bean(name = "integerRedisTemplate")
    public RedisTemplate<String, Integer> integerRedisTemplate(JedisConnectionFactory jedisConnectionFactory) {

        RedisTemplate<String, Integer> template = new RedisTemplate<String, Integer>();
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        template.setConnectionFactory(jedisConnectionFactory);
        template.setKeySerializer(stringRedisSerializer);
        template.setValueSerializer(IntSerializer.INSTANCE);
        template.setHashKeySerializer(stringRedisSerializer);
        template.setHashValueSerializer(IntSerializer.INSTANCE);

        return template;
    }

    public static enum StringSerializer implements RedisSerializer<String> {
        INSTANCE;

        @Override
        public byte[] serialize(String s) throws SerializationException {
            return (null != s ? s.getBytes() : new byte[0]);
        }

        @Override
        public String deserialize(byte[] bytes) throws SerializationException {
            if (bytes != null && bytes.length > 0) {
                return new String(bytes);
            } else {
                return null;
            }
        }
    }

    public static enum LongSerializer implements RedisSerializer<Long> {
        INSTANCE;

        @Override
        public byte[] serialize(Long aLong) throws SerializationException {
            if (null != aLong) {
                return aLong.toString().getBytes();
            } else {
                return new byte[0];
            }
        }

        @Override
        public Long deserialize(byte[] bytes) throws SerializationException {
            if (bytes != null && bytes.length > 0) {
                return Long.parseLong(new String(bytes));
            } else {
                return null;
            }
        }
    }

    public static enum IntSerializer implements RedisSerializer<Integer> {
        INSTANCE;

        @Override
        public byte[] serialize(Integer i) throws SerializationException {
            if (null != i) {
                return i.toString().getBytes();
            } else {
                return new byte[0];
            }
        }

        @Override
        public Integer deserialize(byte[] bytes) throws SerializationException {
            if (bytes != null && bytes.length > 0) {
                return Integer.parseInt(new String(bytes));
            } else {
                return null;
            }
        }
    }

//    @Bean
//    public CacheManagerCustomizer<RedisCacheManager> cacheManagerCustomizer() {
//
//        return new CacheManagerCustomizer<RedisCacheManager>() {
//            @Override
//            public void customize(RedisCacheManager cacheManager) {
//                //事实上这是Spring Boot的默认设置，为了避免key冲突
//                cacheManager.setUsePrefix(true);
//                // 默认过期时间：24 hours
//                cacheManager.setDefaultExpiration(DEFAULT_EXPIRE);
//            }
//        };
//    }



}

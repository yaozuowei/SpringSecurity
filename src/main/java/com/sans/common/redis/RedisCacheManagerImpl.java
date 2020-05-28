package com.sans.common.redis;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * <br>单缓存操作</br>
 *
 */
@Service
public class RedisCacheManagerImpl implements CacheManager {

    public static final Logger LOGGER = LoggerFactory.getLogger(RedisCacheManagerImpl.class);

    /**
     * jackson序列化
     */
    @Resource(name = "jacksonRedisTemplate")
    private RedisTemplate<String, Object> jacksonRedisTemplate;

    /**
     * long类型序列化
     */
    @Resource(name = "longRedisTemplate")
    private RedisTemplate<String, Long> longRedisTemplate;

    /**
     * integer型序列化
     */
    @Resource(name = "integerRedisTemplate")
    private RedisTemplate<String, Integer> integerRedisTemplate;

    @Override
    public void set(String key, Object value) {
        jacksonRedisTemplate.boundValueOps(key).set(value);
    }

    @Override
    public void set(String key, Object value, long timeout) {

        jacksonRedisTemplate.boundValueOps(key).set(value, timeout, TimeUnit.SECONDS);
    }

    @Override
    public void set(String key, Object value, long timeout, TimeUnit unit) {
        jacksonRedisTemplate.boundValueOps(key).set(value, timeout, unit);
    }

    @Override
    public Boolean setNX(String key, Object value) {

        return jacksonRedisTemplate.execute(new SessionCallback<Boolean>() {
            @Override
            public Boolean execute(RedisOperations redisOperations) throws DataAccessException {
                return redisOperations.boundValueOps(key).setIfAbsent(value);
            }
        });
    }

    @Override
    public void mSet(Map<String, Object> keyValues) {
        jacksonRedisTemplate.opsForValue().multiSet(keyValues);
    }

    @Override
    public Long incr(String key) {

        return jacksonRedisTemplate.execute(new RedisCallback<Long>() {
            @Override
            public Long doInRedis(RedisConnection connection) throws DataAccessException {
                RedisSerializer keySerializer = jacksonRedisTemplate.getKeySerializer();
                return connection.incr(keySerializer.serialize(key));
            }
        });
    }

    @Override
    public Double incrBy(String key, double by) {

        return jacksonRedisTemplate.opsForValue().increment(key, by);
    }

    @Override
    public Long decr(String key) {

        return jacksonRedisTemplate.execute(new RedisCallback<Long>() {
            @Override
            public Long doInRedis(RedisConnection connection) throws DataAccessException {
                RedisSerializer keySerializer = jacksonRedisTemplate.getKeySerializer();
                return connection.decr(keySerializer.serialize(key));
            }
        });
    }

    @Override
    public Double decrBy(String key, double by) {

        return jacksonRedisTemplate.opsForValue().increment(key, -by);
    }


    @Override
    public String getAndSetStr(String key, String value) {
        Object oldValue = jacksonRedisTemplate.boundValueOps(key).getAndSet(value);
        return oldValue != null ? oldValue.toString() : null;
    }

    @Override
    public Object getAndSet(String key, Object value) {
        return jacksonRedisTemplate.boundValueOps(key).getAndSet(value);
    }


    @Override
    public Integer getInt(String key) {

        return integerRedisTemplate.boundValueOps(key).get();
    }


    @Override
    public Long getLon(String key) {

        return longRedisTemplate.boundValueOps(key).get();
    }

    @Override
    public String getStr(String key) {

        Object value = jacksonRedisTemplate.boundValueOps(key).get();
        return value != null ? value.toString() : null;
    }

    @Override
    public Object get(String key) {

        return jacksonRedisTemplate.boundValueOps(key).get();
    }

    @Override
    public List<Object> mGet(Collection<String> keys) {
        // TODO boundValueOps与opsForValue区别 ? 待确定
        return jacksonRedisTemplate.opsForValue().multiGet(keys);
    }

    @Override
    public Long lLPush(String key, Object value) {

        return jacksonRedisTemplate.boundListOps(key).leftPush(value);
    }

    @Override
    public Long lLMPush(String key, Object... values) {

        return jacksonRedisTemplate.boundListOps(key).leftPushAll(values);
    }

    @Override
    public Object lRPop(String key) {
        return jacksonRedisTemplate.boundListOps(key).rightPop();
    }

    @Override
    public Object lLIndex(String key, Integer index) {
        return jacksonRedisTemplate.boundListOps(key).index(index);
    }

    @Override
    public Long sAdd(String key, Object... values) {

        return jacksonRedisTemplate.boundSetOps(key).add(values);
    }

    @Override
    public Long sRemove(String key, Object... values) {

        return jacksonRedisTemplate.boundSetOps(key).remove(values);
    }

    @Override
    public Boolean sIsMember(String key, Object value) {

        return jacksonRedisTemplate.boundSetOps(key).isMember(value);
    }

    @Override
    public Boolean zAdd(String key, Object value, double score) {

        return jacksonRedisTemplate.boundZSetOps(key).add(value, score);
    }

    @Override
    public Set<Object> zRange(String key, long start, long end) {

        return jacksonRedisTemplate.boundZSetOps(key).range(start, end);
    }

    @Override
    public Set<Object> zRevRange(String key, long start, long end) {

        return jacksonRedisTemplate.boundZSetOps(key).reverseRange(start, end);
    }

    @Override
    public Set<Object> zRangeByScore(String key, double min, double max) {

        return jacksonRedisTemplate.boundZSetOps(key).rangeByScore(min, max);
    }

    @Override
    public Set<Object> zRevRangeByScore(String key, double min, double max) {

        return jacksonRedisTemplate.boundZSetOps(key).reverseRangeByScore(min, max);
    }

    @Override
    public Long zCard(String key) {

        return jacksonRedisTemplate.boundZSetOps(key).zCard();
    }

    @Override
    public void zDel(String key, Object... values) {

        jacksonRedisTemplate.boundZSetOps(key).remove(values);
    }

    @Override
    public void hAdd(String key, Object field, Object value) {

        jacksonRedisTemplate.boundHashOps(key).put(field, value);
    }

    @Override
    public void hMAdd(String key, Map<Object, Object> keyValues) {

        jacksonRedisTemplate.boundHashOps(key).putAll(keyValues);
    }

    @Override
    public Object hGet(String key, Object field) {

        return jacksonRedisTemplate.boundHashOps(key).get(field);
    }

    @Override
    public List<Object> hMGet(String key, Collection<Object> fields) {

        return jacksonRedisTemplate.boundHashOps(key).multiGet(fields);
    }

    @Override
    public Map<Object, Object> hMGet(String key) {

        return jacksonRedisTemplate.execute(new SessionCallback<Map<Object, Object>>() {
            @Override
            public Map<String, Object> execute(RedisOperations redisOperations) throws DataAccessException {
                return redisOperations.boundHashOps(key).entries();
            }
        });
    }

    @Override
    public void hDel(String key, Object... fields) {

        jacksonRedisTemplate.boundHashOps(key).delete(fields);
    }

    @Override
    public Set<String> keys(String pattern) {
        return jacksonRedisTemplate.keys(pattern);
    }

    @Override
    public void expire(String key, long timeout) {

        jacksonRedisTemplate.expire(key, timeout, TimeUnit.SECONDS);
    }

    @Override
    public void expire(String key, long timeout, TimeUnit unit) {

        jacksonRedisTemplate.expire(key, timeout, unit);
    }

    @Override
    public void del(String key) {

        jacksonRedisTemplate.delete(key);
    }

    @Override
    public void del(Collection<String> keys) {

        jacksonRedisTemplate.delete(keys);
    }

    @Override
    public void delByPattern(String pattern) {

        Set<String> keys = jacksonRedisTemplate.keys(pattern);
        if (!CollectionUtils.isEmpty(keys)) {
            jacksonRedisTemplate.delete(keys);
        }
    }
}
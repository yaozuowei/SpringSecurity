package com.sans.common.redis;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * <br>缓存抽象接口</br>
 */
public interface CacheManager {

    /**
     * <br>String存储结构</br>
     * @param     key 键
     * @param     value 值
     */
    void set(String key, Object value);

    /**
     * <br>String存储结构且过期时间</br>
     * @param     key 键
     * @param     value 值
     * @param     timeout 过期时间
     */
    void set(String key, Object value, long timeout);

    /**
     * <br>String存储结构且过期时间和单位</br>
     * @param     key 键
     * @param     value 值
     * @param     timeout 过期时间
     * @param     unit 时间单位
     */
    void set(String key, Object value, long timeout, TimeUnit unit);

    /**
     * <br>不存在则设置新值</br>
     * @param     key 键
     * @param     value 值
     * @return    Boolean 返回类型
     */
    Boolean setNX(String key, Object value);

    /**
     * <br>以新值替换出旧值并且返回</br>
     * @param     key 键
     * @param     value 值
     * @return    String
     */
    String getAndSetStr(String key, String value);

    /**
     * <br>以新值替换出旧值并且返回</br>
     * @param     key 键
     * @param     value 值
     * @return    String
     */
    Object getAndSet(String key, Object value);

    /**
     * <br>批量设置String存储结构值</br>
     * @param     keyValues
     */
    void mSet(Map<String, Object> keyValues);

    /**
     * <br>增长+1</br>
     * @param     key 键
     * @return    Long 返回增长后的值
     */
    Long incr(String key);

    /**
     * <br>增长+by</br>
     * @param     key 键
     * @param     by 步长
     * @return    Long 返回增长后的值
     */
    Double incrBy(String key, double by);

    /**
     * <br>减-1</br>
     * @param     key 键
     * @return    Long 返回减后的值
     */
    Long decr(String key);

    /**
     * <br>减-by</br>
     * @param     key 键
     * @param     by 步长
     * @return    Long 返回减后的值
     */
    Double decrBy(String key, double by);

    /**
     * <br>获取Integer型值</br>
     * @param     key
     * @return    Int
     */
    Integer getInt(String key);

    /**
     * <br>获取Long型值</br>
     * @param     key
     * @return    Long
     */
    Long getLon(String key);

    /**
     * <br>获取String型值</br>
     * @param     key
     * @return    String
     */
    String getStr(String key);

    /**
     * <br>获取key对应的值</br>
     * @param     key
     * @return    Object
     */
    Object get(String key);

    /**
     * <br>批量获取key对应的值</br>
     * @param     keys
     * @return    List<Object>
     */
    List<Object> mGet(Collection<String> keys);

    /**
     * <br>从队列的左端进行入队</br>
     * @param     key 键
     * @param     value 值
     * @return    Long 放入的列表的index
     */
    Long lLPush(String key, Object value);

    /**
     * <br>从队列的左端进行多值入队</br>
     * @param     key 键
     * @param     values 值
     * @return    Long 放入的列表的index
     */
    Long lLMPush(String key, Object... values);

    /**
     * <br>从队列的右端进行出队</br>
     * @param     key 键
     * @return    Object
     */
    Object lRPop(String key);

    /**
     * <br>从队列的index下标进行队列取值</br>
     * @since     1.0
     * @param     key 键
     * @param     index 下标
     * @return    Object
     */
    Object lLIndex(String key, Integer index);

    /**
     * <br>往Set集合中添加多个元素</br>
     * @param     key 键
     * @param     values 值
     * @return    Long
     */
    Long sAdd(String key, Object... values);

    /**
     * <br>从Set集合中移除多个元素</br>
     * @param     key 键
     * @param     values 值
     * @return    Long
     */
    Long sRemove(String key, Object... values);

    /**
     * <br>判断当前元素是否已经存在</br>
     * @param     key 键
     * @param     value 值
     * @return    Boolean
     */
    Boolean sIsMember(String key, Object value);

    /**
     * <br>往ZSet集合添加元素和分数</br>
     * @param     key 键
     * @param     value 值
     * @param     score 分
     * @return    Boolean
     */
    Boolean zAdd(String key, Object value, double score);

    /**
     * <br>从ZSet集合升序取指定index下标范围的元素</br>
     * @param     key 键
     * @param     start 开始
     * @param     end 结束
     * @return    Set<Object>
     */
    Set<Object> zRange(String key, long start, long end);

    /**
     * <br>从ZSet集合降序取指定index下标范围的元素</br>
     * @param     key 键
     * @param     start 开始
     * @param     end 结束
     * @return    Set<Object>
     */
    Set<Object> zRevRange(String key, long start, long end);

    /**
     * <br>从ZSet集合升序取指定分数范围内元素</br>
     * @param     key 键
     * @param     min 上限
     * @param     max 下限
     * @return    Set<Object>
     */
    Set<Object> zRangeByScore(String key, double min, double max);

    /**
     * <br>从ZSet集合降序取指定分数范围内元素</br>
     * @param     min 上限
     * @param     max 下限
     * @return    Set<Object>
     */
    Set<Object> zRevRangeByScore(String key, double min, double max);

    /**
     * <br>统计ZSet集合元素总数</br>
     * @param     key
     * @return    Long
     */
    Long zCard(String key);

    /**
     * <br>从ZSet集合中移除指定的值</br>
     * @param     key
     * @param     values
     */
    void zDel(String key, Object... values);


    /**
     * <br>往Map集合添加元素</br>
     * @param     key
     * @param     field
     * @param     value
     */
    void hAdd(String key, Object field, Object value);

    /**
     * <br>批量往Map集合添加元素</br>
     * @param     key
     * @param     keyValues
     */
    void hMAdd(String key, Map<Object, Object> keyValues);

    /**
     * <br>从Map中取指定key值</br>
     * @param     key 键
     * @param     field map-key
     * @return    Object
     */
    Object hGet(String key, Object field);

    /**
     * <br>批量从Map中取指定key值</br>
     * @param     key 键
     * @param     fields map-keys
     * @return    Object
     */
    List<Object> hMGet(String key, Collection<Object> fields);

    /**
     * <br>批量从Map中取全部值</br>
     * @param     key 键
     * @return    Object
     */
    Map<Object, Object> hMGet(String key);

    /**
     * <br>从Hash中移除指定的field</br>
     * @param     key
     * @param     fields
     */
    void hDel(String key,Object... fields);

    /**
     * <br>获取所有redis中所有的key</br>
     * @param     pattern
     * @return    Set<String>
     */
    Set<String> keys(String pattern);

    /**
     * <br>设置指定的key过期时间</br>
     * @param     key 键
     * @param     timeout 过期时间
     */
    void expire(String key, long timeout);

    /**
     * <br>设置指定的key过期时间</br>
     * @param     key 键
     * @param     timeout 过期时间
     * @param     unit 时间单位
     */
    void expire(String key, long timeout, TimeUnit unit);

    /**
     * <br>删除指定的key</br>
     * @param     key 键
     */
    void del(String key);

    /**
     * <br>批量删除指定的keys</br>
     * @param     keys 键
     */
    void del(Collection<String> keys);

    /**
     * <br>批量删除指定命名空间的key</br>
     *
     */
    void delByPattern(String pattern);

}

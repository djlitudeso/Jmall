package pers.jl.jmall.service;

/**
 * @ClassName: RedisService.java
 * @Description: redis操作Service, 对象和数组都以json形式进行存储
 * @author: JL Du
 * @date: 2022/2/26 20:20
 * @version: 1.0.0
 */
public interface RedisService {
    /**
     * 存储数据
     */
    void set(String key, String value);

    /**
     * 获取数据
     */
    String get(String key);

    /**
     * 设置超期时间
     * @param expire 过期时间
     * @return 有效期
     */
    boolean expire(String key, long expire);

    /**
     * 删除数据
     */
    void remove(String key);

    /**
     * 自增操作
     * @param delta 自增步长
     */
    Long increment(String key, long delta);

}
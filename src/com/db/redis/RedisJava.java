package com.db.redis;

import redis.clients.jedis.Jedis;

import java.util.List;

public class RedisJava {
    public static void main(String[] args) {
//        ping();
//        strPing();
        list();
    }
    public static void ping() {
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        System.out.println("服务正在运行：" + jedis.ping());
    }
    public static void strPing() {
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        jedis.set("runoobkey","www.runoob.com");
        System.out.println("redis 存储的字符串为： "+jedis.get("runoobkey"));
    }
    public static void list() {
        Jedis j = new Jedis("localhost");
        System.out.println("连接成功");
        j.lpush("site-list", "Runoob");
        j.lpush("site-list","Google");
        j.lpush("site-list","Taobao");
        List<String> list=j.lrange("site-list",0,2);
        for (int i=0;i<list.size();i++){
            System.out.println("列表项为： "+list.get(i));
        }
    }
}

package dubbo;

import redis.clients.jedis.Jedis;

public class TestRedis {

    public static void main(String[] args){

        Jedis jedis = new Jedis("localhost");
        jedis.set("mykey","abs");

        System.out.println(jedis.get("mykey"));
    }
}

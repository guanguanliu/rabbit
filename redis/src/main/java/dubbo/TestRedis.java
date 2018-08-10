package dubbo;

import redis.clients.jedis.Client;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author guan
 * @ClassName TestRedis
 * @Description TODO(redis各种类型的基本存储)
 * @Date 2018-08-03 14:45
 */
public class TestRedis {


    final static JedisPool jedisPool = new JedisPool("localhost", 6379);

    final static Jedis jedis = jedisPool.getResource();

    public static void main(String[] args) {

        //jedis.del("list");
        //new TestRedis().testList();

        //jedis.close();
//        jedis.configSet("timeout", "30");
       // new TestRedis().testSortSet();
        new TestRedis().testSet();
    }

    /**
     * 测试hash表的存储
     */
    public void testHash() {
        Map<String, String> map = new HashMap<>();
        map.put("runoob", "java");
        map.put("菜鸟", "newBird");
        jedis.hmset("sansan", map);
        Map re = jedis.hgetAll("sansan");
        Set<String> set = re.keySet();
        for (String string : set) {
            System.out.println(re.get(string));
        }

    }

    /**
     * 测试List的存取
     */
    public void testList() {
        String[] strings = new String[3];
        strings[0] = "string0";
        strings[1] = "string1";
        strings[2] = "string2";
        jedis.lpush("list", strings);
        List<String> stringList = jedis.lrange("list", 0, 11);
        for (String string : stringList) {
            System.out.println(string);
        }
    }

    public void testSet() {

        jedis.sadd("set", "jump");
        jedis.sadd("set", "you");
        jedis.sadd("set", "I");
        jedis.sadd("set", "jump");

        Set<String> set = jedis.smembers("set");
        for (String string : set) {
            System.out.println(string);
        }

    }

    public void testSortSet() {

        jedis.zadd("sortSet",20,"javaBook");
        jedis.zadd("sortSet",45,"phpBook");
        jedis.zadd("sortSet",33,"心相印");
        jedis.zadd("sortSet",43,"javaBook");
        Set<String> set = jedis.zrange("sortSet",0,4);
        for (String string : set){
            System.out.println(string);
        }
    }

    public void testConfiguration() {
        Client client = jedis.getClient();

        int rs = client.getSoTimeout();
        System.out.println(rs);
    }
}

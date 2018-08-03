package dubbo;

import redis.clients.jedis.Client;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author gaun
 * @ClassName TestRedis
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-08-03 14:45
 */
public class TestRedis {


    static JedisPool jedisPool = new JedisPool("localhost",6379);

    static Jedis jedis = jedisPool.getResource();
    public static void main(String[] args){

        //jedis.del("list");
        //new TestRedis().testList();

        new TestRedis().testSet();
    }

    /**
    * 测试hash表的存储
    */
    public void testHash(){
        Map<String,String> map = new HashMap<>();
        map.put("runoob","java");
        map.put("菜鸟","newBird");
        jedis.hmset("sansan",map);
        Map re = jedis.hgetAll("sansan");
        Set<String> set = re.keySet();
        for (String string:set) {
            System.out.println(re.get(string));
        }

    }

    /**
    * 测试List的存取
    */
    public void testList(){
        String[] strings = new String[3];
        strings[0] = "string0";
        strings[1] = "string1";
        strings[2] = "string2";
        jedis.lpush("list",strings);
        List<String> stringList = jedis.lrange("list",0,11);
       for (String string : stringList){
           System.out.println(string);
       }
    }

    public void testSet(){

        jedis.sadd("set","jump");
        jedis.sadd("set","you");
        jedis.sadd("set","I");
        jedis.sadd("set","jump");

        Set<String> set = jedis.hkeys("set");
        for (String string:set) {
            System.out.println(string);
        }

    }

    public void testSortSet(){

    }

    public void testConfiguration(){
        Client client = jedis.getClient();

        int rs = client.getSoTimeout();
        System.out.println(rs);
    }
}

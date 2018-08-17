package dubbo;

/**
 * @author guan
 * @ClassName Singleton
 * @Description TODO(懒汉模式)
 * @Date 2018-08-10 11:13
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){}
    public static synchronized Singleton getInstance(){
        return singleton;
    }
}

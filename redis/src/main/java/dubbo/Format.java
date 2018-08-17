package dubbo;

/**
 * @author guanguan
 * @ClassName Format
 * @Description TODO(测试)
 * @Date 2018-08-08 14:58
 */
public class Format {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
//        Singleton singleton3 = Singleton.getInstance();
//        Singleton singleton4 = Singleton.getInstance();

        if (singleton1 == singleton2 ){
            System.out.println("全部都是一个实例");
        }else{
            System.out.println("不是一个实例");
        }

    }

}

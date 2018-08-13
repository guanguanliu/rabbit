package dubbo;

import java.text.SimpleDateFormat;

/**
 * @author guan
 * @ClassName Singalton
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-08-10 11:13
 */
public class Singleton {
    private static SimpleDateFormat simpleDateFormat = null;

    private Singleton(){}
    public static synchronized SimpleDateFormat getInstance(){

        if(simpleDateFormat == null){
            simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        }
        return simpleDateFormat;
    }
}

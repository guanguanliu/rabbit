package dubbo;

import service.impl.DisCountContext;
import service.impl.FullSubtraction;

/**
 * @author guanshaojuan
 * @ClassName TestStrategy
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-08-13 14:13
 */
public class TestStrategy {

    public static void main(String [] args) {
        //打折测试
//        DisCountContext disCountContext = new DisCountContext(new Rebate(0.8));
//        double needPay = disCountContext.doDisCount(90);
//        System.out.println(needPay);

        //满减测试
        DisCountContext disCountContext = new DisCountContext(new FullSubtraction(300,30));
        double needPay = disCountContext.doDisCount(700);
        System.out.println(needPay);
    }

}

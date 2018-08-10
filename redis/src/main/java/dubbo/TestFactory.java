package dubbo;

import service.Operate;
import service.OperateFactory;

/**
 * @author
 * @ClassName
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-08-10 9:28
 */
public class TestFactory {

    public static void main(String[] args){
        Operate operate = OperateFactory.getOperate("+");
        double result = operate.operate(89,76);
        System.out.println(result);
    }
}

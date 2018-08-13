package service;

import service.impl.OperateAdd;
import service.impl.OperateMinus;

/**
 * @author
 * @ClassName
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-08-10 9:24
 */
public class OperateFactory {
    public static Operate getOperate(String operate) {
        Operate operate1 = null;
        switch (operate) {
            case "+":
                operate1 = new OperateAdd();
                break;
            case "-":
                operate1 = new OperateMinus();
                break;
            default:
                System.out.println("没有这种运算符");
                break;
        }
        return operate1;
    }
}

package service.impl;

import service.Operate;

/**
 * @author guan
 * @ClassName OperateAdd
 * @Description TODO(实现加法运算)
 * @Date 2018-08-10 9:21
 */
public class OperateAdd implements Operate {

    @Override
    public double operate(double numberA,double numberB) {
        return numberA + numberB;
    }
}

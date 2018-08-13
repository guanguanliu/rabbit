package service.impl;

import service.Operate;

/**
 * @author guan
 * @ClassName OperateMinus
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-08-10 11:09
 */
public class OperateMinus implements Operate {
    @Override
    public double operate(double numberA, double numberB) {

        return numberA - numberB;
    }
}

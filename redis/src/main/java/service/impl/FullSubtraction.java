package service.impl;

import service.DisCount;

/**
 * @author
 * @ClassName
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-08-13 11:42
 */
public class FullSubtraction implements DisCount {
    private double fullMoney;
    private double subMoney;

    public FullSubtraction(double fullMoney,double subMoney) {
        this.fullMoney = fullMoney;
        this.subMoney = subMoney;
    }

    @Override
    public double discount(double money) {
        int count = (int) (money/fullMoney);

        return money - count*subMoney;
    }
}

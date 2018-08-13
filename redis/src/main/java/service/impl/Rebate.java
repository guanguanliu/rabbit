package service.impl;

import service.DisCount;

/**
 * @author guan
 * @ClassName Rebate
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-08-13 11:36
 */
public class Rebate implements DisCount {

    private double rebateMoney = 1;

    public double getRebateMoney() {
        return rebateMoney;
    }

    public void setRebateMoney(double rebateMoney) {
        this.rebateMoney = rebateMoney;
    }

    public Rebate(double rebateMoney) {
        this.rebateMoney = rebateMoney;
    }

    @Override
    public double discount(double money) {
        return money * rebateMoney;
    }
}

package service.impl;

import service.DisCount;

/**
 * @author guan
 * @ClassName Rebate
 * @Description TODO(打折)
 * @Date 2018-08-13 11:36
 */
public class Rebate implements DisCount {

    //折扣。默认不打折
    private double rebateMoney = 1;

    public Rebate() {
    }

    public Rebate(double rebateMoney) {
        this.rebateMoney = rebateMoney;
    }

    @Override
    public double discount(double money) {
        return money * rebateMoney;
    }
}

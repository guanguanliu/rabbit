package service.impl;

import service.DisCount;

/**
 * @author guanshaojuan
 * @ClassName FullSubtraction
 * @Description TODO(满减)
 * @Date 2018-08-13 11:42
 */
public class FullSubtraction implements DisCount {
    //满fullMoney减subMoney
    private double fullMoney;
    private double subMoney;

    public FullSubtraction(double fullMoney, double subMoney) {
        this.fullMoney = fullMoney;
        this.subMoney = subMoney;
    }

    @Override
    public double discount(double money) {
        int count = (int) (money / fullMoney);

        return money - count * subMoney;
    }
}

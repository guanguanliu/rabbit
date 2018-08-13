package service.impl;

import service.DisCount;

/**
 * @author guanshaojuan
 * @ClassName DisCountContext
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-08-13 14:11
 */
public class DisCountContext {
    private DisCount disCount;

    public DisCountContext(DisCount disCount) {
        this.disCount = disCount;
    }

    public double doDisCount(double money){
        return disCount.discount(money);
    }
}

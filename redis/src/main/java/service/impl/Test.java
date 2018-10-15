package service.impl;

import service.ThreadTest;

/**
 * @author guan
 * @ClassName Test
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-09-21 9:40
 */
public class Test {
    public static void main(String[] args) {

        new ThreadTest("线程1").start();
        new ThreadTest("线程2").start();

    }
}

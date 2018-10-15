package service;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author guan
 * @ClassName ThreadTest
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-09-20 10:09
 */
public class ThreadTest extends Thread{

    private String name;
    public static int count = 0;
    Lock lock = new ReentrantLock();

    public ThreadTest(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        lock.lock();
            try {
                while(true) {
                    if (count < 10) {
                        System.out.println(this.name + "-----------" + count);
                        count++;
                    } else {
                        break;
                    }
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
    }
}

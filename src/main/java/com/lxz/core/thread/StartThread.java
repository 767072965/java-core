package com.lxz.core.thread;

/**
 * 创建线程方式一
 * 1. 继承Thread 重写run方法
 * 2. 创建对象，调用start()方法
 */
public class StartThread extends Thread {
    /**
     * start()方法：
     * 1.执行线程必须调用start()方法，加入到调度器中
     * 2.不一定立即执行，系统安排调度分配执行
     * 3.直接调用run方法不是开启多线程，只是普通方法调用
     */
    public static void main(String[] args) {
        //启动线程：
        //创建线程对象
        StartThread startThread=new StartThread();
        //启动 start()方法 不保证立即运行 由CPU调用
        startThread.start();


        for (int i = 0; i < 20; i++) {
            System.out.println("主线程1");
        }
    }

    //线程的入口点
    @Override
    public void run() {
       //线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("子线程2");
        }
    }
}

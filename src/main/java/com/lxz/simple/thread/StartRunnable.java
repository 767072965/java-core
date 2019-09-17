package com.lxz.simple.thread;

/**
 * 创建线程方式二
 * 1. 实现runnable接口 重写run方法
 * 2. 启动：重建实现类对象+Thread+start
 *
 * 推荐:避免单继承的局限性，优先使用接口
 * 方便共享资源
 */
public class StartRunnable implements Runnable {

    public static void main(String[] args) {
        //启动线程：

        //创建线程对象
        StartRunnable startThread=new StartRunnable();
        //创建代理对象
        Thread thread= new Thread(startThread);
        //执行start()
        thread.start();


        for (int i = 0; i < 20; i++) {
            System.out.println("主线程1");
        }
    }


    //线程的入口点
    public void run() {
        //线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("子线程2");
        }
    }
}

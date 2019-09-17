package com.lxz.core.thread;

public class TDownloader extends Thread {

    public TDownloader(String url,String name) {
        this.url = url;
        this.name = name;
    }

    private String url;
    private String name;


    @Override
    public void run() {
        WebDownloader webDownloader=new WebDownloader();
        webDownloader.download(url,name);
        System.out.println(name);
    }

    public static void main(String[] args) {
        TDownloader td1=new TDownloader("https://f12.baidu.com/it/u=1152921167,133027488&fm=76","td1.jpg");
        TDownloader td2=new TDownloader("https://f12.baidu.com/it/u=1152921167,133027488&fm=76","td2.jpg");
        TDownloader td3=new TDownloader("https://f12.baidu.com/it/u=1152921167,133027488&fm=76","td3.jpg");

        td1.start();    //不一定先执行
        td2.start();
        td3.start();
    }
}

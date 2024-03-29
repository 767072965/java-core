package com.lxz.core.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 下载工具
 */
public class WebDownloader {

    public void download(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        }catch (MalformedURLException e){
            e.printStackTrace();
            System.out.println("不合法的URL");
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("下载图片失败");
        }

    }
}

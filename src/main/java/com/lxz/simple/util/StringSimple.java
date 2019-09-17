package com.lxz.simple.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2019/9/16.
 * User: lizhen 767072965@qq.com
 * Date: 2019/9/16
 * Time: 10:57
 * Version: java-core 1.0.0.0
 * [功能描述].
 */
public class StringSimple {

    public static void main(String[] args) {
        try {
            Simple();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void Simple() throws ParseException {
        //beginIndex -- 起始索引（包括）, 索引从 0 开始。
        //endIndex -- 结束索引（不包括）。

        String str="S30 01022900    00049992    062125 0815020512 621626*********0018 000000050000 5812 07 081908150205120621258 00 54835900462399488                01 239000 0812185544 C000000002500 D000000052500 0001                 04 00 000201                                            081908121855442390008 777290058169054                                                     000000000000  000000000000 01080209                                  D000000050000 C000000050000  00000000000      54622689695891456                                                                                                                   ";
        String st2="";

        System.out.println("第三方流水："+str.substring(87,109).replaceAll(" ", ""));
        System.out.println("订单号:"+str.substring(112,143).replaceAll(" ", ""));
        System.out.println("交易主题:-");
        System.out.println("交易时间:"+str.substring(35,45).replaceAll(" ", ""));


        String year=new SimpleDateFormat("yyyy").format(new Date());


        Long date= Long.valueOf(str.substring(35,45).replaceAll(" ", ""));
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMDDhhmmss");
        Date parse = simpleDateFormat.parse(year+date.toString());



        System.out.println("交易时间:"+new SimpleDateFormat("yyyy-MM-DD hh:mm:ss").format(parse));


        System.out.println("支付账号:"+str.substring(46,65).replaceAll(" ", ""));
        System.out.println("交易金额:"+str.substring(66,78).replaceAll(" ", ""));


        String k2= String.valueOf((Integer.parseInt(str.substring(66,78))));
        String k3=k2.substring(k2.length()-2);
        Double k4=Double.valueOf(k2.substring(0,k2.length()-2)+"."+k3);
        System.out.println("交易金额:"+k4);


        System.out.println("服务费:"+str.substring(167,179).replaceAll(" ", ""));
        System.out.println("结算金额:"+str.substring(181,193).replaceAll(" ", ""));


    }
}

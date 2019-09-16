package com.lxz.simple;

import java.util.Calendar;

/**
 * Created by Administrator on 2019/9/16.
 * User: lizhen 767072965@qq.com
 * Date: 2019/9/16
 * Time: 9:53
 * Version: java-core 1.0.0.0
 * [功能描述]. 时间操作
 */
public class DateSimple {


    /**
     * 获取今天开始时间
     * @return
     */
    private Long getStartTime() {
        Calendar todayStart = Calendar.getInstance();
        todayStart.set(Calendar.HOUR, 0);
        todayStart.set(Calendar.MINUTE, 0);
        todayStart.set(Calendar.SECOND, 0);
        todayStart.set(Calendar.MILLISECOND, 0);
        return todayStart.getTime().getTime();
    }

    /**
     * 获取今天结束时间
     * @return
     */
    private Long getEndTime() {
        Calendar todayEnd = Calendar.getInstance();
        todayEnd.set(Calendar.HOUR, 23);
        todayEnd.set(Calendar.MINUTE, 59);
        todayEnd.set(Calendar.SECOND, 59);
        todayEnd.set(Calendar.MILLISECOND, 999);
        return todayEnd.getTime().getTime();
    }


}

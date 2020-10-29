package com.wlsite.util;

public class LogUtil {
    public static void info(String content, Object aa) {
        System.out.println("################ " + content + " FROM " + aa.getClass().getSimpleName() + "################");
    }
    public static void info(String content) {
        System.out.println("################ " + content  + "################");
    }
}

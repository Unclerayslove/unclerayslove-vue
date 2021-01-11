package com.uncle.vue.util;

/**
 * @author leipei
 * @since 2021-01-08 10:45:56
 **/
public class TestUtils {
    public static void main(String[] args) {
        String s = "1212搜索";
        Integer integer = new Integer(0);
        try {
            integer = Integer.valueOf(s);
//            System.out.println(integer);
        } catch (Exception e) {
        }
        System.out.println(integer);
    }
}

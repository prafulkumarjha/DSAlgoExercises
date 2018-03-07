package com.practice.tests;

/**
 * created by Praful Jha on 23/02/2018
 */
public class Testt {

    public void fun(Integer a) {
        //int a = 20;
         a = 20;
        System.out.println(a);
    }

    public static void main(String args[]) {
        Integer a = new Integer(10);
        System.out.println(a);
        Testt t = new Testt();
        t.fun(a);
        System.out.println(a);
    }
}

package com.shyikang.main;

import sun.rmi.runtime.Log;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        String test = "abc";
        System.out.print(test+"\n");
        test = "123";
        System.out.print(test+"\n");
        test = test + "abc";
        System.out.print(test+"\n");

    }
}

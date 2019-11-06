package com.example.lib;

public class MyClass {
    public static void main(String[] avg) {
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        System.out.println("請輸入秒數:");
        int S = scanner.nextInt();
        System.out.println((S/3600)+":"+((S/60)%60)+":"+(S%60));
    }
}

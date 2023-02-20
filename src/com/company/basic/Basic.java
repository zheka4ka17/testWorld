package com.company.basic;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        ex7(3);
    }
    public static int[] ex7(int num1){
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input a number: ");
//        int num1 = in.nextInt();

        int[] arr= new int[10];


        for (int i=0; i< 10; i++){
            System.out.println(num1 + " x " + (i+1) + " = " +
                    (num1 * (i+1)));
            arr[i]= num1 * (i+1);
        }
        return arr;

}
public  static void ex8(){

    System.out.println("   J    a   v     v  a ");
    System.out.println("   J   a a   v   v  a a");
    System.out.println("J  J  aaaaa   V V  aaaaa");
    System.out.println(" JJ  a     a   V  a     a");
}
}




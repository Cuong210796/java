package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("So tien vay = " );
        double P = sc.nextDouble();
        System.out.println("Nhap so thang vay = ");
        double n = sc.nextDouble();
        System.out.println("Lai suat nam = ");
        double r = sc.nextDouble();

        double lai = (P*n)*r/12/100;
        double M = P + lai;
        System.out.println(lai);
        System.out.println("M = " + M);


    }
}

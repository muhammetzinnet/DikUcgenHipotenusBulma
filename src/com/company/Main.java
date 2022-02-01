package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int a,b;
        double h;
        double alan;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen birinci kenarı girin= ");
        a=scanner.nextInt();
        System.out.print("Lütfen ikinci kenarı girin= ");
        b=scanner.nextInt();

        h=Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs = "+h);

        //Alan hesabı

        alan= a*b/2;
        System.out.println("Dik üçgenin alanı = "+alan);
    }
}

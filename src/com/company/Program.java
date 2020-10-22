package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        //int a = 10;
        /*
        Комментарий
         */

	    Scanner scanner = new Scanner(System.in);
	    scanner.useLocale(Locale.US);  // US
	    double ww = scanner.nextDouble(); // 5.6
	    String str2 = "Hello";
	    char ch = '1';





	    int a = scanner.nextInt();
	    int b = scanner.nextInt();
	    double c = Math.sqrt(a*a + b*b);
	    //System.out.println(c);
		System.out.printf("%.2f",c);

		int x = 900;
		double y = 56.0;

	    x = (int)y; // 56

		y = x; // 900.0

		// / - целочисленное деление
		// % - остаток от деления

		double h = 89.9;
		float z = 7.8f;
		int m;
		if(h>0 && z == 1 || a==2) {
			// логика
			m = 10;
		} else if(z>0) {

		} else {

		}

		m = 9;

		int q = 2;
		switch(q) {
			case 1:
				System.out.println(q);
			case 2:
				System.out.println(q);
			default:
				System.out.println("default");
		}


		int[][] v = new int[4][];

		System.out.println(a + " " + b);
		System.out.printf("%.2f,%.2f", y,y);


    }




}

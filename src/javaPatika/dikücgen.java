package javaPatika;

import java.util.Scanner;

public class dikücgen {

	public static void main(String[] args) {
		int a,b,c;
		double cevre,alan,u;
		
		Scanner inp=new Scanner(System.in);
		
		System.out.print("1.kenar uzunluğu giriniz: ");
		a=inp.nextInt();
		System.out.print("2.kenar uzunluğu giriniz: ");
		b=inp.nextInt();
		System.out.print("3.kenar uzunluğu giriniz: ");
		c=inp.nextInt();
		
		cevre=(a+b+c);
		u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
		
		
		System.out.println("üçgenin çevresi: " +cevre);
		System.out.println("üçgenin alanının karesi: " +alan);
	}

}

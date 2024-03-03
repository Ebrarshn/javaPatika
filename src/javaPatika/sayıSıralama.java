package javaPatika;

import java.util.Scanner;

public class sayıSıralama {

	public static void main(String[] args) {
		int a,b,c;
		
	Scanner inp =new Scanner(System.in);
	
	System.out.print("1.sayıyı giriniz: ");
	a=inp.nextInt();
	System.out.print("2.sayıyı giriniz: ");
	b=inp.nextInt();
	System.out.print("3.sayıyı giriniz: ");
	c=inp.nextInt();
	
	if(a>b && a>c) {
		if(b>c) {
			System.out.print("a>b>c");
		}
		else {
			System.out.print("a>c>b");
		}
	}
	else if(b>c && b>a) {
		if(c>a) {
			System.out.print("b>c>a");
		}
		else {
			System.out.print("b>a>c");
		}
	}
	else {
		if(a>b) {
			System.out.print("c>a>b");
		}
		else {
			System.out.print("c>b>a");
		}
	}
	}

}

package javaPatika;

import java.util.Scanner;

public class hesapmakinası2 {

	public static void main(String[] args) {
	int n1,n2;
	
	Scanner inp= new Scanner(System.in);
	System.out.print("1. sayıyı giriniz: ");
	n1=inp.nextInt();
	System.out.print("2.sayıyı giriniz: ");
	n2=inp.nextInt();
	
	int select= inp.nextInt();
	
	switch (select) {
	case 1:
		System.out.println("toplam: " + (n1+n2));
		break;
	case 2:
		System.out.println("çıkartma: " + (n1-n2));
		break;
	case 3:
		System.out.println("çarpma: " + (n1*n2));
		break;
	case 4:
		System.out.println("bölme: " + (n1/n2));
		break;
	default:
		System.out.println("hatalı giriş yaptınız.");
		break;
	}

	}

}

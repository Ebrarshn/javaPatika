package javaPatika;

import java.util.Scanner;

public class sınıfortalaması {

	public static void main(String[] args) {
		int mat,fizik,kimya,biyo,turkce;
		
		Scanner inp= new Scanner(System.in);
		
		System.out.print("Matematik notunuzu giriniz: ");
		mat=inp.nextInt();
		
		System.out.print("Fizik notunuzu giriniz: ");
		fizik=inp.nextInt();
		
		System.out.print("Kimya notunuzu giriniz: ");
		kimya=inp.nextInt();
		
		System.out.print("Biyoloji notunuzu giriniz: ");
		biyo=inp.nextInt();
		
		System.out.print("Türkçe notunuzu giriniz: ");
		turkce=inp.nextInt();
		
		double avarage=(mat+fizik+kimya+biyo+turkce)/5;
		
		
		
		if(avarage<0) {
			System.out.println("notunuz ortalamaya katılmaz");
		}else if(100<avarage) {
			System.out.println("notunuz ortalamaya katılmaz");
		}else if(avarage<55) {
			System.out.println("sınıfta kaldınız");
		}else if(avarage>=55) {
			System.out.println("sınıfı geçtiniz");
		}
		System.out.print("ortalamanız: " +avarage);
	}

}

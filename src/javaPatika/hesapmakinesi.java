package javaPatika;

import java.util.Scanner;

public class hesapmakinesi {

	public static void main(String[] args) {
		int n1, n2, select;
		
		Scanner inp=new Scanner(System.in);
		System.out.print("İlk sayıyı giriniz: ");
		n1=inp.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		n2=inp.nextInt();
		
		System.out.println("1-toplam\n2-çıkartma\n3-çarpma\n4-bölme");
		System.out.print("seçiminiz: ");
		select=inp.nextInt();
		
		if(select == 1) {
			System.out.print("toplam: "+ (n1+n2));
		}else if(select == 2) {
			System.out.print("çıkartma: "+ (n1-n2));
		}else if(select == 3) {
			System.out.print("çarpma: "+ (n1*n2));
		}else if(select == 4) {
			if (n2 != 0) {
				System.out.print("bölme: "+ (n1/n2));
			}else {
				System.out.print("bir sayı 0 ile bölünmez !");
			}
		}else {
			System.out.print("yanlış seçim yaptınız.Tekrar deneyiniz.");
		}
		}

}

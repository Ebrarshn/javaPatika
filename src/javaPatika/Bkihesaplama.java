package javaPatika;

import java.util.Scanner;

public class Bkihesaplama {

	public static void main(String[] args) {
		int kilo;
		double boy,bki;
		
		Scanner inp=new Scanner(System.in);
		
		System.out.print("kilonuz: ");
		kilo=inp.nextInt();
		System.out.print("boyunuz(metre cinsinden): ");
		boy=inp.nextDouble();
		
		bki=Math.sqrt(kilo/boy*boy);
		System.out.print("Vücut kütle indeksiniz: "+bki);
	}

}

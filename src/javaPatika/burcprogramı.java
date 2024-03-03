package javaPatika;

import java.util.Scanner;

public class burcprogramı{
	public static void main(String[] args) {
		int day;
		String month;
		
		Scanner inp=new Scanner(System.in);
		
		System.out.print("doğum ayınız: ");
		month=inp.nextLine();
		
		System.out.print("doğum günü: ");
		day=inp.nextInt();
		
		if(month.equals("ocak")) {
			if(day<=21 && day<=31) {
				System.out.print("oğlak burcu");
			}
			else if(day<=31) {
				System.out.print("kova burcu");
			}
			else {
				System.out.print("hatalı gün girdiniz");
			}
		}
		else if(month.equals("şubat")) {
			if(day<=19 && day<=28) {
				System.out.print("kova burcu");
			}
			else if (day<=28){
				System.out.print("balık burcu");
			}
			else {
				System.out.print("hatalı gün girdiniz");
			}
		}
		else if(month.equals("mart")) {
			if(day<=20 && day<=31) {
				System.out.print("balık burcu");
			}
			else if(day<=31){
				System.out.print("koç burcu");
			}
			else {
				System.out.print("hatalı gün girdiniz.");
			}
		}
		else {
			System.out.print("hatalı doğum ayı girdiniz,tekrar deneyiniz.");
		}
	}
}
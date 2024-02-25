package javaPatika;

import java.util.Scanner;

public class manavkasa {

	public static void main(String[] args) {
		double armut, elma, domates,muz,patlıcan,total;
		
		
		Scanner inp=new Scanner(System.in);
		
		System.out.print("armut kaç kilo? : ");
		armut=inp.nextDouble();
		System.out.print("elma kaç kilo? : ");
		elma=inp.nextDouble();
		System.out.print("domates kaç kilo? : ");
		domates=inp.nextDouble();
		System.out.print("muz kaç kilo? : ");
		muz=inp.nextDouble();
		System.out.print("patlıcan kaç kilo? : ");
		patlıcan=inp.nextDouble();
		
		total=((armut*2.14)+(elma*3.67)+(domates*1.11)+(patlıcan*5.0)+(muz*0.95));
		System.out.print("toplam ödeme: " +total);
		
	}

}

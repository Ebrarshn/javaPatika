package javaPatika;

import java.util.Scanner;

public class havaSıcaklığı{
	public static void main(String[] args) {
		int heat;
		 Scanner inp=new Scanner(System.in);
		 
		 System.out.print("sıcaklık: ");
		 heat=inp.nextInt();
		 
		 if(heat<5) {
			 System.out.print("kayak yapabilirsiniz.");
		 }
		 else if(heat>=5 && heat<=25) {
			 if(heat>=10) {
				 System.out.println("pikniğe yapabilirsiniz.");
				 if(heat<=15) {
					 System.out.print("sinemaya gidebilirsiniz.");
				 }
			 }
			 else {
				 System.out.print("sinemaya gidebilirsiniz.");
			 }
			
		 }
		 else {
			 System.out.print("yüzmeye gidebilirsiniz.");
		 }
	}
}
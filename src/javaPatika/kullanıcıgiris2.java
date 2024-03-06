package javaPatika;

import java.util.Scanner;

public class kullanıcıgiris2{
	public static void  main(String[] args) {
		String userName, password;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("kullanıcı adı: ");
		userName=inp.nextLine();
		System.out.print("şifre: ");
		password=inp.nextLine();
		
		if(userName.equals("patika") && password.equals("java123")) {
			System.out.print("Giriş yaptınız.");
		}
		else if(!userName.equals("patika") && !password.equals("java123")) {
			System.out.print("kullanıcı adı ve şifre yanlış, tekrar deneyiniz.");
		}
		else if(!userName.equals("patika") && password.equals("java123")) {
			System.out.print("kullanıcı adı yanlış, tekrar deneyiniz.");
		}
		else {
			System.out.print("şifre yanlış, sıfırlamak ister misiniz? ");
			String answer=inp.nextLine();
			if(answer.equals("evet")) {
				System.out.print("yeni şire giriniz: ");
				String npassword=inp.nextLine();
				if(npassword.equals("java123")) {
					System.out.print("eski şifre ile aynı şifreyi oluşturamazsınız.");
				}
				else {
					System.out.print("şifre yenileme işlemi başarılı.");
				}
			}
			else {
				System.out.print("şifre sıfırlama işlemi iptal edilmiştir.");
			}
		}
	}
}
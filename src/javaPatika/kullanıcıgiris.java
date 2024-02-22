package javaPatika;

import java.util.Scanner;

public class kullanıcıgiris {

	public static void main(String[] args) {
		String userName, password;
		
		Scanner inp=new Scanner(System.in);
		
		System.out.print("kullanıcı adınız: ");
		userName=inp.nextLine();
		
		System.out.print("şifre: ");
		password=inp.nextLine();
		
		if(userName.equals("patika") && password.equals("java123")) {
			System.out.print("giriş yaptınız ");
		}else {
			System.out.print("bilgileriniz yanlış ");
		}

	}

}

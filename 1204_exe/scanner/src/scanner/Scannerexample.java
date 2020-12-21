package scanner;

import java.util.Scanner;

public class Scannerexample {

	public static void main(String[] args) {
		// 두번째 스캐너 연습 자기소개> 이름> 나이
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("자기소개>");
		String intro = scan.nextLine();
		
		System.out.println("이름>");
		String name = scan.next();
		
		System.out.println("나이>");
		int age = scan.nextInt();
		
		
		System.out.println("자기소개 : " +intro);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
		

	}

}

package scanner;

import java.util.Scanner;

public class Homework_java2 {

	public static void main(String[] args) {
		// 숙제 조건3
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어>");
		int guk = scan.nextInt();
		
		System.out.println("영어>");
		int yeong =scan.nextInt();
		
		System.out.println("수학>");
		int su = scan.nextInt();
		
		System.out.println("과학>");
		int gua = scan.nextInt();
		
		System.out.println((guk + yeong + su + gua)/4);
		System.out.println(guk + yeong + su + gua);

		
		scan.close();
	}

}

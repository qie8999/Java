package scanner;

import java.util.Scanner;

public class Homework_java2 {

	public static void main(String[] args) {
		// ���� ����3
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����>");
		int guk = scan.nextInt();
		
		System.out.println("����>");
		int yeong =scan.nextInt();
		
		System.out.println("����>");
		int su = scan.nextInt();
		
		System.out.println("����>");
		int gua = scan.nextInt();
		
		System.out.println((guk + yeong + su + gua)/4);
		System.out.println(guk + yeong + su + gua);

		
		scan.close();
	}

}

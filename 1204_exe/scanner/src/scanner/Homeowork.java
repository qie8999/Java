package scanner;

import java.util.Scanner;

public class Homeowork {

	public static void main(String[] args) {
		// ���� ����2
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������> 3.14");
		float PI = 3.14f;
		
		System.out.println("������>");
		int banjirem = scan.nextInt();
		
		System.out.println("������ >" + PI);  
		System.out.println("������ >" + banjirem);
		System.out.println("=" + PI * banjirem * banjirem);
		
		

	}

}

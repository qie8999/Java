package scanner;

import java.util.Scanner;

public class Homeowork {

	public static void main(String[] args) {
		// 숙제 조건2
		
		Scanner scan = new Scanner(System.in);
		System.out.println("원주율> 3.14");
		float PI = 3.14f;
		
		System.out.println("반지름>");
		int banjirem = scan.nextInt();
		
		System.out.println("원주율 >" + PI);  
		System.out.println("반지름 >" + banjirem);
		System.out.println("=" + PI * banjirem * banjirem);
		
		

	}

}

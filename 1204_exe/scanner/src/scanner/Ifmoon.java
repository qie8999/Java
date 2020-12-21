package scanner;

import java.util.Scanner;

public class Ifmoon {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		int num1 = scan.nextInt();
		
		if (num1 < 0) //먼저 검사
			System.out.println(" 0 미만 ");
		else if (num1 < 100 )
			System.out.println("0이상 100미만");
		else 
			System.out.println("100이상");
		
		
		scan.close();
		
			}
	}

 
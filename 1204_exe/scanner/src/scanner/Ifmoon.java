package scanner;

import java.util.Scanner;

public class Ifmoon {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		int num1 = scan.nextInt();
		
		if (num1 < 0) //���� �˻�
			System.out.println(" 0 �̸� ");
		else if (num1 < 100 )
			System.out.println("0�̻� 100�̸�");
		else 
			System.out.println("100�̻�");
		
		
		scan.close();
		
			}
	}

 
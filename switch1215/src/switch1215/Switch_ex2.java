package switch1215;

import java.util.Scanner;

public class Switch_ex2 {

	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("������ ���� ���α׷� v1.0");
		System.out.println("----------------------");
		
		Scanner s = new Scanner(System.in);
		System.out.print("1. Num1 �Է� : " );
		int num1 =s.nextInt();
		System.out.print("2. Num2 �Է� : ");
		int num2 =s.nextInt();
		System.out.print("3. ������ �Է� => ");
		String buho = s.next();
		
		switch (buho) {
		case "+" :
			System.out.println( num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case "-" :
			System.out.println( num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case "*" :
			System.out.println( num1 + "*" + num2 + "=" + (num1 * num2));
			break;
		case "/" :
			if(num2 == 0) {
				System.out.println("�ڸ�0 ����!!");
			}
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
			s.close();
			System.exit(0);
			
		
		}
		
	}

}

package switch1215;

import java.util.Scanner;

public class Switch_ex2 {

	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("간단한 계산기 프로그램 v1.0");
		System.out.println("----------------------");
		
		Scanner s = new Scanner(System.in);
		System.out.print("1. Num1 입력 : " );
		int num1 =s.nextInt();
		System.out.print("2. Num2 입력 : ");
		int num2 =s.nextInt();
		System.out.print("3. 연산자 입력 => ");
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
				System.out.println("자모0 에러!!");
			}
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
			s.close();
			System.exit(0);
			
		
		}
		
	}

}

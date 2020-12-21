import java.util.Scanner;

public class IfEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("----------------------");
		System.out.println("간단한 계산기 프로그램 v1.0 ");
		System.out.println("----------------------");
		System.out.print("Num1 입력 => ");
		int num1 = s.nextInt();
		System.out.print("Num2 입력 => ");
		int num2 = s.nextInt();
		System.out.print("부호 입력 => ");
		String buho = s.next();
		
		
		
		if(buho.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );			
		}
		else if(buho.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) );			
		}
		else if(buho.equals("*")) {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2) );			
		}
		else if(buho.equals("/")) {
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) );			
		}
		else {
			System.out.println("----에러----");
		}

		
		
		
		s.close();
	}

}

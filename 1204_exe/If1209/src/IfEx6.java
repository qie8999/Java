import java.util.Scanner;

public class IfEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("----------------------");
		System.out.println("������ ���� ���α׷� v1.0 ");
		System.out.println("----------------------");
		System.out.print("Num1 �Է� => ");
		int num1 = s.nextInt();
		System.out.print("Num2 �Է� => ");
		int num2 = s.nextInt();
		System.out.print("��ȣ �Է� => ");
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
			System.out.println("----����----");
		}

		
		
		
		s.close();
	}

}

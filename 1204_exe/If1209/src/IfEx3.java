import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.println("----------------------");
		System.out.println(" ������ ���� ���α׷� v1.0 ");
		System.out.println("----------------------");
		System.out.print("1. Num1 �Է� => ");
		int num1 = s.nextInt();
		System.out.print("2. Num2 �Է� => ");
		int num2 = s.nextInt();
		System.out.print(" ��ȣ �Է� => ");
		String giho = s.next();

		if (giho.equals("+")) {

			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

		} else if (giho.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

		} else if (giho.equals("*")) {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		}

		else if (giho.equals("/")) {
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		}

		s.close();
	}

}

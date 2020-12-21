import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.println("----------------------");
		System.out.println(" 간단한 계산기 프로그램 v1.0 ");
		System.out.println("----------------------");
		System.out.print("1. Num1 입력 => ");
		int num1 = s.nextInt();
		System.out.print("2. Num2 입력 => ");
		int num2 = s.nextInt();
		System.out.print(" 부호 입력 => ");
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

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		System.out.println("-------------------");
		System.out.println(" Ȧ¦ �Ǵ� ���α׷� v1.0 ");
		System.out.println("-------------------");
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է� =>");
		int num1 = s.nextInt();
		
		if(num1 % 2 == 1) {
			System.out.println("�Է��� ���ڴ� Ȧ���Դϴ�.");
		}
		else {
			System.out.println("�Է��� ���ڴ� ¦���Դϴ�.");
		}
		
		
		
		
		
		s.close();

	}

}

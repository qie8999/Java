import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("-------------------");
		System.out.println(" ��� �� ���α׷� v1.0 ");
		System.out.println("-------------------");
		System.out.print("����1 �Է� => ");
		int num1 = s.nextInt();
		System.out.print("����2 �Է� => ");
		int num2 = s.nextInt();
		
		if (num1 > num2) {
			        System.out.println("num1�� num2���� ũ��.");
		}
		else if(num1 <num2) {
			        System.out.println("num2�� num1���� ũ��.");      
		}
		else if(num1 == num2) {
					System.out.println("num1�� num2�� ����.");	
		}
		s.close();

	}
	

}

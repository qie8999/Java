import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �Է�: ");
		int num = s.nextInt(); 
		//Ȧ¦ üũ�ϱ�
		
		//2�� �������? �ƴ����� �˾Ƴ��� ����� �ִ�
		// %�� ���� ���� Ȱ���
		if(num % 2 == 1 ) {
			System.out.println("Ȧ���Դϴ�.");
		}
		else {
			System.out.println("¦���Դϴ�.");
		}
			
		
		s.close();
	}

}

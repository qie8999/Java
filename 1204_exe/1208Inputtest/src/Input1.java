import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		// Scanner ��ü ����(s) system.in�� �Է��Ѵٴ� �� system.out�� ���
		
		Scanner s =new Scanner(System.in);
		//�Է��� ���� ��ĳ�� ��ü�� ����Ѵٴ� �ǹ�
		System.out.print("�̸� �Է� :");
		//Ű����� ���� �Է¹���
		String name = s.nextLine();
		//���� �Է¹���
		System.out.print("���� �Է� :");
		int age =s.nextInt();
		
		System.out.println("�̸� ���� : " + name);
		System.out.println("���� ���� : " + age);
		
		s.close();
		

	}

}

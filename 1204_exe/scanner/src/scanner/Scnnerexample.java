package scanner;

import java.util.Scanner;

public class Scnnerexample {
	
	public static void main (String[] args) {
		
		//1. ��ĳ�� ��� ����.
		Scanner scan = new Scanner(System.in);
		
		//2. ��ĳ�ʰ� ������ �ִ� ����� ���ؼ� �����͸� �Է� ����.
		
		System.out.println("�ڱ�Ұ�>");
		String intro = scan.nextLine();// ������ �����ϴ� ���ڿ� ����
		//<-- �Է¹޴� ����.�� ����� ������ �Է� ������ �ִ� ���°� �ȴ�
		//��¹��� ���ؼ� Ȯ�ΰ���
		
		System.out.println("�̸�>");
		String name = scan.next();//next�� ������ �������� �ʴ´�
		
		System.out.println("����>");
		int age =scan.nextInt();
		
		System.out.println("�ڱ�Ұ�: " + intro);
		System.out.println(" �̸�: " + name +"����: " +age );
		
		
		//��ĳ�� ��� ����
		scan.close();
		
		
		
		
	}

}

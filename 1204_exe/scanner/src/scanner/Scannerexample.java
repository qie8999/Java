package scanner;

import java.util.Scanner;

public class Scannerexample {

	public static void main(String[] args) {
		// �ι�° ��ĳ�� ���� �ڱ�Ұ�> �̸�> ����
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ڱ�Ұ�>");
		String intro = scan.nextLine();
		
		System.out.println("�̸�>");
		String name = scan.next();
		
		System.out.println("����>");
		int age = scan.nextInt();
		
		
		System.out.println("�ڱ�Ұ� : " +intro);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		
		

	}

}

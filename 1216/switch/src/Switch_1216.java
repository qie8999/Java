import java.io.IOException;
import java.util.Scanner;

public class Switch_1216 {

	public static void main(String[] args) throws IOException {
		System.out.println("----------------------------");
		System.out.println("  �Ĵ�޴� �ڵ��ֹ� ���α׷� v1.0");
		System.out.println("----------------------------");
		System.out.println("���ϴ� �Ļ縦 �����ϼ���. ");
		System.out.println("a. ��ġ� : 5000��");
		System.out.println("b. ����� : 5000��");
		System.out.println("c. Į����   : 4500��");
		System.out.println("d. ��ġ���� : 4000��");
		System.out.println("e. �����   : 5000��");
		System.out.println("----------------------------");
		System.out.print("�޴��� �����ϼ���: ");
		Scanner s = new Scanner(System.in);
		char ch = (char) System.in.read();
		System.out.print("�Է¹��� ����: " + ch);

		switch (ch) {
		case 'a':
			System.out.println("��ġ��� �ֹ��߽��ϴ�");
			break;
		case 'b':
			System.out.println("������� �ֹ��߽��ϴ�");
			break;
		case 'c':
			System.out.println("Į������ �ֹ��߽��ϴ�");
			break;
		case 'd':
			System.out.println("��ġ������ �ֹ��߽��ϴ�");
			break;
		case 'e':
			System.out.println("������� �ֹ��߽��ϴ�");
			break;
		default:
			System.out.println("�߸��� �޴��� �ֹ��߽��ϴ�");
		}

		
		
	}

}
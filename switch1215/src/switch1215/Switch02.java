package switch1215;

import java.io.IOException;
import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("-----------------------------");
		System.out.println(" �Ĵ� �޴� �ڵ� �ֹ� ���α׷� v1.0 ");
		System.out.println("-----------------------------");
		System.out.println("a. ��ġ� : 5,000��");
		System.out.println("b. ����� : 5,000��");
		System.out.println("c. Į���� : 4,500��");
		System.out.println("d. ��ġ���� : 4,000��");
		System.out.println("e. ����� : 5,000��");
		
		System.out.print("�޴��� �����ϼ��� : ");
		char str = (char)System.in.read();
		int money = 0;
		
		switch (str) {
		case 'a' : System.out.println("��ġ��� �ֹ��߽��ϴ�");
					System.out.print("�ݾ��� �Ա��ϼ��� =>");
					money =s.nextInt();
					System.out.println("��ġ��� �����߽��ϴ�. �Ž�����"+ (money-5000) + "���� ��������.");
					break;
		case 'b' : System.out.println("������� �ֹ��߽��ϴ�");
					System.out.print("�ݾ��� �Ա��ϼ��� =>");
					money =s.nextInt();
					System.out.println("������� �����߽��ϴ�. �Ž�����"+ (money-5000) + "���� ��������.");
					break;
		case 'c' : System.out.println("Į������ �ֹ��߽��ϴ�");
					System.out.print("�ݾ��� �Ա��ϼ��� =>");
					money =s.nextInt();
					System.out.println("Į������ �����߽��ϴ�. �Ž�����"+ (money-4500) + "���� ��������.");
					break;
		case 'd' : System.out.println("��ġ������ �ֹ��߽��ϴ�");
					System.out.print("�ݾ��� �Ա��ϼ��� =>");
					money =s.nextInt();
					System.out.println("��ġ������ �����߽��ϴ�. �Ž�����"+ (money-4000) + "���� ��������.");
					break;
		case 'e' : System.out.println("������� �ֹ��߽��ϴ�");
					System.out.print("�ݾ��� �Ա��ϼ��� =>");
					money =s.nextInt();
					System.out.println("������� �����߽��ϴ�. �Ž�����"+ (money-5000) + "���� ��������.");
					break;
		}
		

	}

}

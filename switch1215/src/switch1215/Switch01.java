package switch1215;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		int one = 6000, two = 5000, three = 4500, four = 4500, five = 4500;

		System.out.println("------------------------");
		System.out.println("   ��� ���Ǳ� ���α׷� v1.0");
		System.out.println("------------------------");
		System.out.println("���ϴ� ������� �޴����� �����ϼ���");
		System.out.println("1. ���� ��� ����" + one);
		System.out.println("2. ���� ����� ���" + two);
		System.out.println("3. ���� ���" + three);
		System.out.println("4. ���� ������" + four);
		System.out.println("5. ���� ȭ��Ʈ" + five);
		System.out.println("------------------------");

		Scanner s = new Scanner(System.in);
		System.out.print("��踦 �����ϼ��� =>");
		int sig = s.nextInt();
		int money = 0;

		switch (sig) {
		case 1:
			System.out.println("���� ��� ������ �����ϼ̽��ϴ�");
			System.out.print("��� �ݾ��� �Ա��ϼ��� =>");
			money = s.nextInt();
			System.out.println("���� ��� ������ �����߽��ϴ�. �Ž�����" + (money - one) + "���� ��������");
			break;
		case 2:
			System.out.println("���� ����� ��带 �����ϼ̽��ϴ�");
			System.out.print("��� �ݾ��� �Ա��ϼ��� =>");
			money = s.nextInt();
			System.out.println("���� ����� ��带 �����߽��ϴ�. �Ž�����" + (money - two) + "���� ��������");
			break;
		case 3:
			System.out.println("���� ��縦 �����ϼ̽��ϴ�");
			System.out.print("��� �ݾ��� �Ա��ϼ��� =>");
			money = s.nextInt();
			System.out.println("���� ��縦 �����߽��ϴ�. �Ž�����" + (money - three) + "���� ��������");
			break;
		case 4:
			System.out.println("���� �������� �����ϼ̽��ϴ�");
			System.out.print("��� �ݾ��� �Ա��ϼ��� =>");
			money = s.nextInt();
			System.out.println("���� �������� �����߽��ϴ�. �Ž�����" + (money - four) + "���� ��������");
			break;
		case 5:
			System.out.println("���� ȭ��Ʈ�� �����ϼ̽��ϴ�");
			System.out.print("��� �ݾ��� �Ա��ϼ��� =>");
			money = s.nextInt();
			System.out.println("���� ȭ��Ʈ�� �����߽��ϴ�. �Ž�����" + (money - five) + "���� ��������");
			break;

		}

	}

}

import java.util.Scanner;

public class Switch_7 {

	public static void main(String[] args) {
		System.out.println("----------------------------");
		System.out.println("  ��� ���Ǳ� ���α׷� v1.0");
		System.out.println("----------------------------");
		System.out.println("���ϴ� ��踦 �����ϼ���. ");
		System.out.println("1. ���� ��� ����	 : 6000��");
		System.out.println("2. ���� ����� ���	:5000��");
		System.out.println("3. ���� ��� 	 : 4500��");
		System.out.println("4. ���� ������ 	 : 4500��");
		System.out.println("5. ���� ȭ��Ʈ 	: 4500��");
		System.out.println("----------------------------");
		System.out.print("��踦 �����ϼ���: ");
		Scanner s = new Scanner(System.in);
		int menu = s.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("���� ��� ������ �����ϼ̽��ϴ�");
			break;
		case 2:
			System.out.println("���� ����� ��带 �����ϼ̽��ϴ�");
			break;
		case 3 :
			System.out.println("���� ��縦 �����ϼ̽��ϴ�");
			break;
		case 4:
			System.out.println("���� �������� �����ϼ̽��ϴ�");
			break;
		case 5:
			System.out.println("���� ȭ��Ʈ�� �����ϼ̽��ϴ�");
			break;
		}
		
		System.out.println("----------------------------");
		System.out.print("��� �ݾ��� �����ϼ��� => ");
		int input = s.nextInt();
		int namg = 0;
		//�Ž����� �޾ƾ� �Ǵ°��/ �Ž������� �� ���� ��� / �߰� ���� �ݾ��� �ʿ��� ���
		switch (menu) {
		case 1 : //6,000
			namg = input - 6000;
			if(namg > 0) {
			System.out.println("���� ��� ������ �����߽��ϴ�. �Ž�����" + namg + "�� ��������");
			}
			else if (namg == 0) {
				System.out.println("���� ��� ������ �����߽��ϴ�.");
			}
			else {
				System.out.println("�߰��ݾ� " + Math.abs(namg) + "�� �����ϼ���");
			}
				
			break;
		case 2 :
			namg = input - 5000;
			if(namg > 0) {
			System.out.println("���� ����� ��带 �����߽��ϴ�. �Ž�����" + namg + "�� ��������");
			}
			else if (namg == 0) {
				System.out.println("���� ����� ��带 �����߽��ϴ�.");
			}
			else {
				System.out.println("�߰��ݾ� " + Math.abs(namg) + "�� �����ϼ���");
			}
			break;
		case 3 :
			namg = input - 4500;
			if(namg > 0) {
			System.out.println("���� ��縦 �����߽��ϴ�. �Ž�����" + namg + "�� ��������");
			}
			else if (namg == 0) {
				System.out.println("���� ��縦 �����߽��ϴ�.");
			}
			else {
				System.out.println("�߰��ݾ� " + Math.abs(namg)+ "�� �����ϼ���");
			}
			break;
		case 4 :
			namg = input - 4500;
			if(namg > 0) {
			System.out.println("���� �������� �����߽��ϴ�. �Ž�����" + namg + "�� ��������");
			}
			else if (namg == 0) {
				System.out.println("���� �������� �����߽��ϴ�.");
			}
			else {
				System.out.println("�߰��ݾ� " + Math.abs(namg) + "�� �����ϼ���");
			}
			break;
		case 5 :
			namg = input - 4500;
			if(namg > 0) {
			System.out.println("���� ȭ��Ʈ�� �����߽��ϴ�. �Ž�����" + namg + "�� ��������");
			}
			else if (namg == 0) {
				System.out.println("���� ȭ��Ʈ�� �����߽��ϴ�.");
			}
			else {
				System.out.println("�߰��ݾ� " + Math.abs(namg) + "�� �����ϼ���");
			}
			break;
		}
		
		

	}

}

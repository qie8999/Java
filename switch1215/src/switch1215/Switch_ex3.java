package switch1215;

import java.util.Scanner;

public class Switch_ex3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);


		System.out.println("1. ���� ��� ����  6,000��");
		System.out.println("2. ���� ����� ���   5,000��");
		System.out.println("3. ���� ���    4,500��");
		System.out.println("4. ���� ������   4,500��");
		System.out.println("5. ���� ȭ��Ʈ    4,500��");
		System.out.println("----------------------");
		int one=6000, two=5000, three=4500, four=4500, five=4500;
			
		
		System.out.print("��踦 �����ϼ��� =>" );
		int sig = s.nextInt();
		switch(sig) {
		case 1 :System.out.println("���� ��� ������ �����ϼ̽��ϴ�");
		break;
		case 2 :System.out.println("���� ����� ��带 �����ϼ̽��ϴ�");
		break;
		case 3 :System.out.println("���� ��縦 �����ϼ̽��ϴ�");
		break;
		case 4 :System.out.println("���� �������� �����ϼ̽��ϴ�");
		break;
		case 5 :System.out.println("���� ȭ��Ʈ�� �����ϼ̽��ϴ�");
		break;
		default:
			break;}
		
		
			System.out.println("----------------------");
		System.out.print("��� �ݾ��� �Ա��ϼ��� =>");
		int money = s.nextInt();
		switch(sig) {
		case 1 :System.out.println("���� ��� ������ �����ϼ̽��ϴ�. �Ž�����" + (money-one) + "���� ��������");  
		break;
		case 2 :System.out.println("���� ����� ��带 �����ϼ̽��ϴ�. �Ž�����" +(money-two) + "���� �������� "); 
		break;
		case 3 :System.out.println("���� ��縦 �����ϼ̽��ϴ�. �Ž�����" +(money-three) + "���� �������� ");
		break;
		case 4 :System.out.println("���� �������� �����ϼ̽��ϴ�. �Ž�����" +(money-four) + "���� �������� ");
		break;
		case 5 :System.out.println("���� ȭ��Ʈ�� �����ϼ̽��ϴ�. �Ž�����" +(money-five) + "���� �������� ");
		break;
		
		}
		
		s.close();

	}

	}


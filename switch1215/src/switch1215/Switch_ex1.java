package switch1215;

import java.io.IOException;
import java.util.Scanner;

public class Switch_ex1 {

	public static void main(String[] args) throws IOException {
		System.out.println("---------------------------");
		System.out.println("�Ĵ� �޴� �ڵ� �ֹ� ���α׷�v1.0");
		System.out.println("---------------------------");
		System.out.println("a. ��ġ� : 5,000��");
		System.out.println("b. ����� : 5,000��");
		System.out.println("c. Į���� : 4,500��");
		System.out.println("d. ��ġ���� : 4,000��");
		System.out.println("e. ����� : 5,000��");
		
		System.out.print("�޴��� �����ϼ��� : " );
		char str =(char)System.in.read();
		
		
				 
		switch (str) {
		case 'a':
		System.out.println("��ġ��� �ֹ��߽��ϴ�");
		break;
		case 'b' :
		System.out.println("������� �ֹ��߽��ϴ�");
		break;
		case 'c' :
		System.out.println("Į������ �ֹ��߽��ϴ�");
		break;
		case 'd' :
		System.out.println("��ġ������ �ֹ��߽��ϴ�");
		break;
		case 'e' :
		System.out.println("������� �ֹ��߽��ϴ�");
		break;
		default:
			System.out.println("�߸��� ������ �Է�");
		
				
		}
		
		
		
	}

}

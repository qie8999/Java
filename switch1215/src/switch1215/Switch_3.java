package switch1215;

import java.util.Scanner;

public class Switch_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("ù��° ���� �Է�: ");
		double op1 = s.nextDouble();
		System.out.print("����� �Է�: ");
		String oper =s.next();
		System.out.print("�ι�° ���� �Է�: ");
		double op2= s.nextDouble();
		double result=0;
		
		switch (oper) {
		case "+" :
			result = op1 + op2;
			break;
		case "-" :
			result = op1 - op2;
			break;
		case "*" :
			result = op1 * op2;
			break;
		case "/" :
			if (op2==0) {
				System.out.print("�и�0 ����!");
				//���� ���α׷� ���� ����
				System.exit(0);
			}
			result =op1 / op2;
			break;
		default:
			System.out.println("�߸��� ������ �Է�");
			s.close();
			System.exit(0);
		}
		System.out.println("�����: " + result);
		
			
			
			
			
			
		}

	}



package switch1215;

import java.util.Scanner;

public class If_1215 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Num1 �Է� => ");
		double op1 = s.nextDouble();
		System.out.print("������ �Է� =>(+,-,*,/) ");
		String oper =s.next();
		System.out.print("Num2 �Է� => ");
		double op2= s.nextDouble();
		double result=0;
		
		if(oper.equals("+")) {
			result = op1 + op2;				
			}
		else if(oper.equals("-")) {
			result = op1 - op2;
		}
		else if(oper.equals("*")) {
			result = op1 * op2;
		}
		else if(oper.equals("/")) {
			if(op2==0) {
				System.out.println("�и�0 ����!");
			}
			result = op1 / op2;
			s.close();
			System.exit(0);
		} //%d �� ����(���ø�)  %s�� ���ڿ� %f�� �÷�  
		// %d\n������ = println�� ���� ȿ��  \t " ��Ű ����
		System.out.println((int)op1 +oper +(int)op2 +"=" +(int)result);
		System.out.printf("%d %s %d = %d\n",
				 (int)op1, oper, (int)op2 , (int)result);
		System.out.println(op1 +oper +op2 +"=" +result);
		
		
		

	}

}

package switch1215;

import java.util.Scanner;

public class If_1215 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Num1 입력 => ");
		double op1 = s.nextDouble();
		System.out.print("연산자 입력 =>(+,-,*,/) ");
		String oper =s.next();
		System.out.print("Num2 입력 => ");
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
				System.out.println("분모0 에러!");
			}
			result = op1 / op2;
			s.close();
			System.exit(0);
		} //%d 는 정수(데시말)  %s는 문자열 %f는 플롯  
		// %d\n뉴라인 = println과 같은 효과  \t " 탭키 삽입
		System.out.println((int)op1 +oper +(int)op2 +"=" +(int)result);
		System.out.printf("%d %s %d = %d\n",
				 (int)op1, oper, (int)op2 , (int)result);
		System.out.println(op1 +oper +op2 +"=" +result);
		
		
		

	}

}

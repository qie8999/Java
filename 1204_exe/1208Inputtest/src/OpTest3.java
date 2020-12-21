
public class OpTest3 {
	
	public static void main(String[] args) {
		//논리 연산자
		//제어문 if 에서 많이 활용하게 됨.  true =1 false =0
		int num1 =100, num2 =200;
		// == 같다 "둘이 같은가?"
		System.out.println("== 연산자 : " + (num1 ==num2));
		
		//!= 다르다?
		System.out.println("!= 연산자 : " + (num1 !=num2));
		
		//크기 비교
		System.out.println("> 연산자 : " + (num1 > num2));
		System.out.println("< 연산자 : " + (num1 < num2));
		
		//크거나 같다
		System.out.println(">= 연산자 : " + (num1 >= num2));
		//작거나 같다
		System.out.println("<= 연산자 : " + (num1 <= num2));
		
		
	}

}

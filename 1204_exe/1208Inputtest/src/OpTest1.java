
public class OpTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =2, num2 =3, num3 =4;
		//연산자 우선순위가 
		//*,/가 +,- 보다 높다. 같은 순위면 좌측에서 우측으로 계산
		int result = num1 + num2 - num3;
		System.out.println("result : " + result);
		
		//괄호 먼저 처리
		int result2 =  num1 + (num2 - num3);
		System.out.println("result2 : " + result2);
		
		//*,/가 +,-보다 우선순위 //공학용 계산기는 우선순위를 따져 계산해 준다
		result = num1 + num2 * num3;
		System.out.println("result : " + result);

		result = (num1 + num2) * num3;
		System.out.println("result : " + result);
		
		result =num1 * num2 / num3;
		System.out.println("result : " + result);
		
		//%나머지 연산자 4 % 3 (4를 3으로 나눈 나머지)
		// x % 2 --> 0, 1
		// x % 3 --> 0, 1, 2 
		// x % 4 --> 0, 1, 2, 3
		
		result =10 % 3;
		System.out.println("result : " + result);
		
		
		
		
		
		
	}

}

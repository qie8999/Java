
public class OpTest5 {

	public static void main(String[] args) {
		//3항 연산자(참고로 할것)
		//main()뒤에 들어간 것도 메소드
		//메소드 안에서 선언된 변수에 초기값이  
		//없으면 쓰레기 값이 들어감.
		
		int num1 = 10;//0을 넣으면 초기화
		int num2 = 15;
		String str = ""; //""안에 안쓰면 빈 공백
		str = (++num1 >=num2)? "num1이 크다": "num2가 크다";
		System.out.println(str);
	
		

	}

}

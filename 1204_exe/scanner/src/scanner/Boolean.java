package scanner;

public class Boolean {

	public static void main(String[] args) {
		
		byte a =127;//byte는 -128~127까지만 저장을 해 줄 수가 있다
		short b =32767;//32767까지만 저장이 가능
		int c =2147483647; //여기까지만 저장이 가능 외울 필요는 없음
		long d = 2147483648l;//long은 숫자 뒤에 l을 붙여줘야 한다.
		
		
		System.out.println(d);//d는 훨씬 더 큰 숫자까지 출력을 할 수가 있다
		
		//2진수, 8진수, 16진수를 통해서도 저장할 수가 있다
		//2진수로 저장할 때는 진수 앞에 0b를 붙여준다
		int bin =0b1010;//2진수 1010으로 저장한다
		System.out.println("2진수1010 : "+ bin);
		
		//8진수 저장할 때는 정수 앞에 0을 붙인다
		int octa =064;
		System.out.println("8진수064 : " + octa);
		
		//16진수는 0x를 붙인다
		int hexa =0x3a4c;   //a=10 b=11 c=12 d=13 e=14 f=15
		System.out.println("16진수0x3a4c :" + hexa);
		
		
		System.out.println("-----------------------------------");
		float f1 = 3.14f;
		double d1 =3.14;
		
		float f2 = 1.234567891234f;
		double d2 =1.234567891234;
		
		System.out.println(f2);//소숫점 7자리까지 유효성
		System.out.println(d2);//소숫점 13자리까지 유효성 
		
		
	
	
		

	}

}

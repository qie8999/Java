package scanner;

public class Textexample {

	public static void main(String[] args) {
		
		// 단일 저장하는 데이터 타입 char
		char c1 ='A';
		char c2 = 65; //아스키 코드
		System.out.println(c1);
		System.out.println(c2);

		//전세계 문자를 표현하는 유니코드 2바이트의 크기로 늘어남 65536개의 문자표현
		char c3 ='가';
		char c4= 44032;   //'가'의 유니코드 번호
		System.out.println(c3 + " " + c4);
		
		//문자열 String
		String s1 = "my name is ";
		String s2 = "park";
		System.out.println(s1 +s2);
		
		//문자와 데이터 타입의 +연산
	
	
	}

}

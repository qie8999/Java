
public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "홍길동";
		String STR = "홍길동";
		//첫글자가 대문자인 것은 클래스, 그래서 변수는 소문자로 하는 것이 좋다
		//코딩 스타일은 카멜표기
		
		String line ="--------------------";
		String title = "    개인 신상 정보    ";
		String name = "홍";
		int age =100; //더 큰 내용은 long사용
		char male = '남';
		float mom = 65.5f;//or double b = 65.5;
		double ki = 178.6;
		String adr = "조선 한양 홍대감댁";
		//tab 누르면 4번 space누른것과 같음
		
		
		System.out.println(line);
		System.out.println(title);
		System.out.println(line);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + male );
		System.out.println("체중 : " + mom + "kg");
		System.out.println("키  : " + ki +"cm");
		System.out.println("주소 : " + adr);
		System.out.println(line);
		
		//4가 자동으로 4.0으로 변환.
		//실제로는 이렇게 쓰지 않는게 좋다
		System.out.println(10.0/4);
		
		
		
		
		
	}

}

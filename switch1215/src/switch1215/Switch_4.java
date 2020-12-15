package switch1215;

public class Switch_4 {

	public static void main(String[] args) {
		//Math 수학 클래스
		//( 0 ~ 3 ) + 8 = 8,9,10,11
		int time = (int)(Math.random()*4)+8;
		System.out.println("현재시간: " + time );
		switch (time) {
		//Math 수학 클래스, random()메쏘드
		case 8 :
			System.out.println("출근");
		case 9 :
			System.out.println("회의");
		case 10:
			System.out.println("업무");
		default :
			System.out.println("출장");
		}
		

	}

}

import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("주행거리 입력 : ");
		double juhang = s.nextDouble();//();가 달려있는 것은 메소드
		System.out.print("사용한 휘발유 양 입력 : ");
		double fuels = s.nextDouble();
		
		double yeonbi =juhang / fuels;//  /는 나누기 연산자
		//정수와 정수를 나눠 소숫점이 나오는 경우 앞뒤가 같은 double이면 소수점이 나온다
		System.out.println("차량 연비 : " + yeonbi);
				
		s.close();

	}

}

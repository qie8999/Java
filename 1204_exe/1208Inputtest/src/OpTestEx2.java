import java.util.Scanner;

public class OpTestEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("----------------------");
		System.out.println("  동전 교환기 프로그램 1.0  ");
		System.out.println("----------------------");
		
		System.out.print("지폐 : ");
		int money = scan.nextInt();
		
		int oback =money / 500 ;
		System.out.println("오백원 짜리 : " + oback );
		
		int back = (money- (500*oback)) / 100;
		System.out.println("백원 짜리 : " + back );
		
		int osip = (money- (500*oback)-(100*back)) / 50;
		System.out.println("오십원 짜리 : " + osip );
		
		int sip = (money -(500*oback)-(100*back)-(50*osip))/ 10;
		System.out.println("십원 짜리 : " + sip);
		
		int one = money % 10 ;
		System.out.println("바꾸지 못한 잔돈 : " + one);
		
		System.out.println("----------------------");
		
		scan.close();
		
		

	}

}

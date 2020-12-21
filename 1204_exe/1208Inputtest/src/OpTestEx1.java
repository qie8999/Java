import java.util.Scanner;

public class OpTestEx1 {

	public static void main(String[] args) {
		// 동전 500/100/50/10
		Scanner scan =new Scanner(System.in);
		
		System.out.println("-------------------");
		System.out.println(" 동전 교환 프로그램 1.0  ");
		System.out.println("-------------------");;
		int money = scan.nextInt();
		
		int oback = money / 500;
		System.out.println("오백원 짜리 : " + oback +'개');
			
		int back= money % 500 ;		
		    back = (back > 0) ? back/100  : 0 ;
		System.out.println("백원 짜리 : " + back + '개'); 
		 
		int osip = money % 100 ;
		    osip = (osip > 0) ? osip/50  : 0 ; 
		 System.out.println("오십원 짜리 : " + osip +'개');
		 
		int sip = money % 50 ;
		    sip = (sip > 0 ) ? sip/10  : 0 ;
		System.out.println("십원 짜리 : " + sip + '개');   
		
		int one = money % 10 ;
		    one = (one > 0 ) ? one  : 0 ;
		System.out.println("바꾸지 못한 잔돈 : " + one +'개' );    
		
		
		System.out.println("------------------");
		scan.close();
		
		
		
		
		
		

	}

}

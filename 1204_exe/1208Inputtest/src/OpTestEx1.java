import java.util.Scanner;

public class OpTestEx1 {

	public static void main(String[] args) {
		// ���� 500/100/50/10
		Scanner scan =new Scanner(System.in);
		
		System.out.println("-------------------");
		System.out.println(" ���� ��ȯ ���α׷� 1.0  ");
		System.out.println("-------------------");;
		int money = scan.nextInt();
		
		int oback = money / 500;
		System.out.println("����� ¥�� : " + oback +'��');
			
		int back= money % 500 ;		
		    back = (back > 0) ? back/100  : 0 ;
		System.out.println("��� ¥�� : " + back + '��'); 
		 
		int osip = money % 100 ;
		    osip = (osip > 0) ? osip/50  : 0 ; 
		 System.out.println("���ʿ� ¥�� : " + osip +'��');
		 
		int sip = money % 50 ;
		    sip = (sip > 0 ) ? sip/10  : 0 ;
		System.out.println("�ʿ� ¥�� : " + sip + '��');   
		
		int one = money % 10 ;
		    one = (one > 0 ) ? one  : 0 ;
		System.out.println("�ٲ��� ���� �ܵ� : " + one +'��' );    
		
		
		System.out.println("------------------");
		scan.close();
		
		
		
		
		
		

	}

}

package loopTest1216;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hap = 0;
		System.out.print("���� �Է� : ");
		int num = s.nextInt();
		
		for (int i=0; i<num; i++) {
			
			
			hap += (i+1);
		}
		System.out.println("1~"+ num +"������ ��: " + hap );
		System.out.printf("1~%d������ ��: %d\n",num, hap );
		

		
		
	}
}
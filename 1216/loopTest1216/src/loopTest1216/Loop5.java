package loopTest1216;

import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���ϴ� ������ �Է�: ");
		int gugu = s.nextInt();
		
		
		
		for(int i=0; i<9; i++) {
			System.out.printf("%dx%d=%d\n",gugu,(i+1),gugu*(i+1));
			System.out.println(gugu + "x" + (i+1) + "=" + gugu*(i+1));
		}
		
		


	}

}
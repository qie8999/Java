import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է�: ");
		int num = s.nextInt(); 
		
		if (num <= 100 && num >= 90) {
			System.out.println("A����");
		}
		else if(num <=89 && num >= 80 ) {
			System.out.println("B����");
		}
		else {
			System.out.println("A,B���� ����");
		}
		
s.close();		

	}

}

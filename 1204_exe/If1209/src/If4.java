import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력: ");
		int num = s.nextInt(); 
		
		if (num <= 100 && num >= 90) {
			System.out.println("A학점");
		}
		else if(num <=89 && num >= 80 ) {
			System.out.println("B학점");
		}
		else {
			System.out.println("A,B제외 학점");
		}
		
s.close();		

	}

}

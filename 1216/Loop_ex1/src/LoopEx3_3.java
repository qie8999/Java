import java.util.Random;

public class LoopEx3_3 {

	public static void main(String[] args) {
		System.out.println("-----------------------");
		System.out.println(" ������ �ζ� ���α׷� v1.0  ");
		System.out.println("-----------------------");
		
		int i =0;
		do {
			Random rand = new Random();
			int num =rand.nextInt(45) + 1;
			System.out.print(num +" ");
			i++;
		}while(i<5);

	}

}
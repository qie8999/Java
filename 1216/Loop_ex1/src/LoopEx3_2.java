import java.util.Random;

public class LoopEx3_2 {

	public static void main(String[] args) {
		System.out.println("-----------------------");
		System.out.println(" 간단한 로또 프로그램 v1.0  ");
		System.out.println("-----------------------");
		
		for(int i=0; i<5; i++) {
			Random rand =new Random();
			int num = rand.nextInt(45) + 1;
			System.out.print(num+ " ");
		}

	}

}

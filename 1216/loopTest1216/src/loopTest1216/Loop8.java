package loopTest1216;

public class Loop8{

	public static void main(String[] args) {
	 	int hap = 0;
		for (int i=1; i<=10; i++) {
			if(i % 3 == 0) {
				//continue를 만나는 순간 실행하지 않고 
				//반복문 처음으로 이동
				continue;
			}
			System.out.println("i" + i);
			hap += i;
			
			if(i==5) {
				System.out.println("탈출");
				break;
			}
		}
		System.out.println("1~10까지 3의 배수를 제외한 합 : " + hap);

	}

}

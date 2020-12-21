
public class Optest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 0;
		
		//++,--는 증감연산자
		//1을 증가 또는 1 감소
		num2 = num1++;// ++가 뒤에 있는 경우 10이 바로 num2로 넘어감
		//그리고 다음에 또 이런 변수가 있으면 다음 변수에 1을 추가해줌
		System.out.println("num2 : " + num2);
		
		num2 = ++num1;//++가 앞에 있는 경우 먼저 1을 추가하고 num2로 넘긴다
		System.out.println("num2 : " + num2);
		
		num2 = num1--;//-1이 적용되지 않고 12가 바로 num2로 넘어감
		System.out.println("num2 : " + num2);

	}

}

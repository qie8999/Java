package switch1215;

public class Switch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade ='A';//학점
		switch (grade) {//문자또는 문자열, 숫자값을 씀
		case 'A':
			System.out.println("A학점");//출력
			break;//탈출
		case 'B' :
			System.out.println("B학점");
			break;
		case 'c':
			System.out.println("C학점");
			break;
		default:
			System.out.println("F학점");
			break; //끝까지 와서 default가 없으면 실행 안됨
		
		}

	}

}

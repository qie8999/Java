
public class OpTest4 {

	public static void main(String[] args) {
		int num =99;
		
		//&& (�� and������) --> �ϳ��� ������ ������ ����,
		//true && true --> true
		//true && false --> false
		//false && true --> false
		//false && false --> false
		
		System.out.println("and���� : " +    
		(num >= 100 && num <= 200));
		
		        // || (�� or ������) Shift + \
				//�ϳ��� ���� ������ ��.
		        //true || true --> true
				//true || false --> true
				//false || true --> true
				//false || false --> false
		System.out.println("or���� : " +    
				(num >= 100 || num <= 200));
		
		
		//! (�� not������)
		//!(true) --> false
		//!(false)--> true
		System.out.println("not������ : " +
		                    !(num == 100));


	

	}

}


public class OpTest4 {

	public static void main(String[] args) {
		int num =99;
		
		//&& (논리 and연산자) --> 하나라도 거짓이 있으면 거짓,
		//true && true --> true
		//true && false --> false
		//false && true --> false
		//false && false --> false
		
		System.out.println("and연산 : " +    
		(num >= 100 && num <= 200));
		
		        // || (논리 or 연산자) Shift + \
				//하나라도 참이 있으면 참.
		        //true || true --> true
				//true || false --> true
				//false || true --> true
				//false || false --> false
		System.out.println("or연산 : " +    
				(num >= 100 || num <= 200));
		
		
		//! (논리 not연산자)
		//!(true) --> false
		//!(false)--> true
		System.out.println("not연산자 : " +
		                    !(num == 100));


	

	}

}

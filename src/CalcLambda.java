
public class CalcLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method((a,b) -> a + b);
	}
	
	private static void method(Calc calc) {
		int sum = calc.sum(10, 20);
		System.out.println("the result is :" + sum);
	}

}

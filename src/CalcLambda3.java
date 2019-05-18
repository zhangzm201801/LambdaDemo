/*
 * 在Lambda表达式中，凡是可以推导的都是可以省略的
 * 
 * 1：参数类型可以省略不写
 * 2：如果参数有且皆有一个，则小括号可以省略
 * 3：如果语句只有一个，则大括号和return也可以省略
 */
public class CalcLambda3 {
	public static void main(String[] args) {
		//标准格式
		System.out.println("---------------------");
		method((int x) -> {return x * x;});
		
		//省略参数类型
		System.out.println("---------------------");
		method((x) -> {return x * x;});
		
		//省略参数小括号
		System.out.println("---------------------");
		method(x -> {return x * x;});
		
		//省略大括号和return关键字
		System.out.println("---------------------");
		method(x -> x * x);
	}

	private static void method(Calc2 calc) {
		int sum = calc.square(6);
		System.out.println("the result is :" + sum);
	}
}


/*
 * Lambda表达式要想使用，一定要有函数式接口的推断环境
 * 1：通过方法的参数类型来确定是哪个函数式接口
 * 2：通过赋值操作来确定是哪个函数式接口
 * 
 * 
 * Lambda的格式就是为了将抽象方法，翻译成为一下三点
 * 1：一些参数（方法参数）
 * 2：一个箭头
 * 3：一些代码（方法体 大括号）
 * 
 * 例如抽象方法
 * public abstract int sum(int a ,int b);
 * 
 * 翻译成为Lambda
 * (int a ,int b)　-> {return a + b ;}
 */
public class CalcLambda2 {
	public static void main(String[] args) {
		method((int a ,int b)-> {return a + b ;});
	}
	
	private static void method(Calc calc) {
		int sum = calc.sum(10, 20);
		System.out.println("the result is :" + sum);
	}
}

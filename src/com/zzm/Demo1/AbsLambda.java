package com.zzm.Demo1;

/*
 * 
 * JDK已经为我们提供了求绝对值的【类Math的静态方法abs】方法，我们就
 * 没有必要再用Lambda重写一遍，直接通过方法引用直接拿过来即可
 * 
 */
public class AbsLambda {
	public static void main(String[] args) {
		method((int num) -> {
			int result;
			if(num >= 0) {
				result = num;
			}else {
				result = -num;
			}
			return result;
		});
		
		System.out.println("--------------------------");
		method(Math::abs);
	}

	public static void method(Calc calc) {
		int result = calc.getAbs(-66);
		System.out.println("结果是：" + result);
	}
}

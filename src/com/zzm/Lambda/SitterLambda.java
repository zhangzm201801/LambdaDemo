package com.zzm.Lambda;

/*
 * 在某些场景中，Lambda表达式要做的事情，其实在另外一个地方已经谢过了
 * 那么此时通过Lambda表达式重复编写相同的代码，就是一种浪费
 * 那么如何复用已经存在的方法逻辑呢？
 * 
 * 
 */
public class SitterLambda {
	public static void main(String[] args) {
		hireSitter(food -> System.out.println("将" + food + "做成可口的食物"));
		
		System.out.println("------------------");
		Cook.makeFood("白菜");

		//通过方法引用来代替Lambda表达式
		hireSitter(Cook::makeFood);
	}
	
	public static  void hireSitter(Sitter sitter) {
		sitter.work("白菜");
	}
}

package com.zzm.Demo2;

/*
 *
 *  非静态成员方法的引用格式
 *  
 *  对象名::成员方法名
 * 
 */
public class SitterLambda {
	public static void main(String[] args) {
		Cook cook = new Cook();
		hireSitter(cook::makeFood);
	}
	
	public static  void hireSitter(Sitter sitter) {
		sitter.work("白菜");
	}
}

package com.zzm.Demo2;

/*
 *
 *  �Ǿ�̬��Ա���������ø�ʽ
 *  
 *  ������::��Ա������
 * 
 */
public class SitterLambda {
	public static void main(String[] args) {
		Cook cook = new Cook();
		hireSitter(cook::makeFood);
	}
	
	public static  void hireSitter(Sitter sitter) {
		sitter.work("�ײ�");
	}
}

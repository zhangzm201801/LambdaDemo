package com.zzm.Lambda;

/*
 * ��ĳЩ�����У�Lambda���ʽҪ�������飬��ʵ������һ���ط��Ѿ�л����
 * ��ô��ʱͨ��Lambda���ʽ�ظ���д��ͬ�Ĵ��룬����һ���˷�
 * ��ô��θ����Ѿ����ڵķ����߼��أ�
 * 
 * 
 */
public class SitterLambda {
	public static void main(String[] args) {
		hireSitter(food -> System.out.println("��" + food + "���ɿɿڵ�ʳ��"));
		
		System.out.println("------------------");
		Cook.makeFood("�ײ�");

		//ͨ����������������Lambda���ʽ
		hireSitter(Cook::makeFood);
	}
	
	public static  void hireSitter(Sitter sitter) {
		sitter.work("�ײ�");
	}
}

package com.zzm.Demo1;

/*
 * 
 * JDK�Ѿ�Ϊ�����ṩ�������ֵ�ġ���Math�ľ�̬����abs�����������Ǿ�
 * û�б�Ҫ����Lambda��дһ�飬ֱ��ͨ����������ֱ���ù�������
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
		System.out.println("����ǣ�" + result);
	}
}

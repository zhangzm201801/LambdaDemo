
/*
 * Lambda���ʽҪ��ʹ�ã�һ��Ҫ�к���ʽ�ӿڵ��ƶϻ���
 * 1��ͨ�������Ĳ���������ȷ�����ĸ�����ʽ�ӿ�
 * 2��ͨ����ֵ������ȷ�����ĸ�����ʽ�ӿ�
 * 
 * 
 * Lambda�ĸ�ʽ����Ϊ�˽����󷽷��������Ϊһ������
 * 1��һЩ����������������
 * 2��һ����ͷ
 * 3��һЩ���루������ �����ţ�
 * 
 * ������󷽷�
 * public abstract int sum(int a ,int b);
 * 
 * �����ΪLambda
 * (int a ,int b)��-> {return a + b ;}
 */
public class CalcLambda2 {
	public static void main(String[] args) {
		//1:���÷�����ʱ�򣬲��������Ǻ���ʽ�ӿڣ�����Lambda�����ƶϳ����ĸ�����ʽ�ӿ�
		method((int a ,int b)-> {return a + b ;});
		 
		//2:Ҳ���Ը��ݸ�ֵ�����������������Lambda�������ƶ�
		System.out.println("-----------------------------");
		Calc param = (int a ,int b)-> {return a + b ;};
		method(param);
	}
	
	private static void method(Calc calc) {
		int sum = calc.sum(10, 20);
		System.out.println("the result is :" + sum);
	}
}

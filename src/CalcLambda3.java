/*
 * ��Lambda���ʽ�У����ǿ����Ƶ��Ķ��ǿ���ʡ�Ե�
 * 
 * 1���������Ϳ���ʡ�Բ�д
 * 2������������ҽ���һ������С���ſ���ʡ��
 * 3��������ֻ��һ����������ź�returnҲ����ʡ��
 */
public class CalcLambda3 {
	public static void main(String[] args) {
		//��׼��ʽ
		System.out.println("---------------------");
		method((int x) -> {return x * x;});
		
		//ʡ�Բ�������
		System.out.println("---------------------");
		method((x) -> {return x * x;});
		
		//ʡ�Բ���С����
		System.out.println("---------------------");
		method(x -> {return x * x;});
		
		//ʡ�Դ����ź�return�ؼ���
		System.out.println("---------------------");
		method(x -> x * x);
	}

	private static void method(Calc2 calc) {
		int sum = calc.square(6);
		System.out.println("the result is :" + sum);
	}
}

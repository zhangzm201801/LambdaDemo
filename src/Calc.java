
/*
 * Java中使用Lambda表达式的前提是：必须有函数式接口
 * 
 * 函数式接口：有且仅有一个抽象方法的接口
 * 
 * 如何才能万无一失的加测一下当前接口是函数式接口？
 * 用一个固定的格式写在 interface定义之前一行即可
 * @FunctionalInterface
 * 
 */
@FunctionalInterface
public interface Calc {
	int sum(int a ,int b);
}

/**
 * 描述这个类/方法的相关文档内容
 * 背景
 * 使用方法
 * 注意事项
 * 相关的类似的其他类/方法
 */
public class Test {
	//这叫成员变量 --字段/属性
	//int num = 2;
	public static void main(String[] args) {
		//这是局部变量
		int i = 10;
		System.out.println(i + "hello");

		//不建议使用中文
		int 变量 = 11;
		System.out.println(变量);
		//小驼峰命名法:除了第一个单词其他单词首字母都大写（变量和方法）
		//大驼峰命名法:所有单词首字母都大写(类)
		//用下划线分割多个单词命名方式unix-like命名法

		final int a = 12;
		System.out.println(a);

		//小的赋给大的可以,大的不可以赋给小的
		int y = 10;
		long x = 20L;
		x = y;
		System.out.println(x);

		//int 和 boolean 不能相互赋值
		// int m = 10;
		// boolean n = true;
		// m = n;
		// System.out.println(m);

		byte c = 10;
		byte d = 20;
		byte e = (byte)(c + d);
		System.out.println(e);

		double z = 10.0;
		double v = 1.5;
		System.out.println(z % v);	//1.0
	}

}
/*
 * 
 * 
 * 测试方法的基本使用
 * 
 */

public class TestMethod {
	public static void main(String[]args) {
		
		//通过对象调用普通方法
		TestMethod tm = new TestMethod();
		tm.printSxt();
		tm.printSxt();
		int c = tm.add(30,40,50)+300;
		System.out.println(c);
	}
	
	void printSxt() {
		System.out.println("aaaa");
		System.out.println("bbbbb");
		System.out.println("cccccc");
	}
	
	
	 int add(int a, int b, int c) {
		int sum = a+b+c;
		return sum;   //return 结束方法的运行，返回值
	}
}
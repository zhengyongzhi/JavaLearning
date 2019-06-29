/*
 * 
 * 类调用
 * 
 */




public class SxtStu2 {
	
	//属性fields
	int id;
	String sname;
	int age;
	
	Computer comp;

	//方法
	void study() {
		System.out.println("学习:"+comp.brand);
	}
	
	void play() {
		System.out.println("游戏");
	}
	
	
	//程序执行的入口
	public static void main(String[]args) {
		SxtStu2 stu = new SxtStu2();
		stu.id=2014;
		stu.sname="zheng";
		stu.age=25;
		
		Computer c1 = new Computer() ;
		c1.brand = "联想";
		stu.comp = c1;
		
		stu.study();
		
	}
	
}

class Computer{
	String brand;
}



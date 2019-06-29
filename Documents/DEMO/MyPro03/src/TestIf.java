
/*
 * 
 * 测试if但选择结构
 * 
 */

public class TestIf {
 public static void main(String[]args) {
	 double d = Math.random();//返回0～1之间随机
	 System.out.println(d);
	 
	 int i =(int)(6*Math.random()+1);
	 System.out.println(i);
	 if(i<=3) {
		 System.out.println("小");
		 System.out.println("小小小");
	 }
 }
}

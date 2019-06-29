/*
 * 
 * 嵌套循环测试
 * 
 */

public class TestWhileQiaotao {
	public static void main(String[] args){
		for(int i=1; i<=5;i++) {
			System.out.println(i+"\t"+i+"\t"+i+"\t"+i+"\t"+i);
		}
		
		//
		for(int i=1; i<=5;i++) {
			for(int g=1;g<=5;g++) {
				System.out.print(i+"\t");
				}
				System.out.print("\n");
		}
		
		//制作9*9乘法表
		for(int i=1;i<=9;i++) {
			for(int g=1;g<=i;g++) {
				System.out.print(i+"*"+g+"="+i*g+"\t");
			}
			System.out.print("\n");
		}
				
				
		 
	}
}



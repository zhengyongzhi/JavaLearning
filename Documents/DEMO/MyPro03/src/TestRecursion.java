

/*
 * 
 * 测试递归
 * 
 * 
 */

public class TestRecursion {
	public static void main(String[]args) {
		long d1 = System.currentTimeMillis();
		System.out.printf("价乘结果:%s%n",funtional(10));
		long d2 = System.currentTimeMillis();
		System.out.printf("递归费时:%s%n",d2-d1);
		
		funtional02(10);	
		
		
	}
	
	//递归
	static long funtional(int t) {
		if  (t == 1) {//递归头
			return 1;
		}else {//递归体
			return t*funtional(t-1);
		}
	}
	
	//
	static long funtional02(int t){
		long d3 = System.currentTimeMillis();
		int p=1;
		for(int a = t;a>=1;a--) {
			p*=a;
		}
		long d4= System.currentTimeMillis();
		System.out.printf("价乘结果:%s%n",p);
		System.out.printf("普通循环费时:%s%n",d4-d3);
		return p;
	}
}

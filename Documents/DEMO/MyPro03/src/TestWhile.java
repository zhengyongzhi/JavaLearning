/*
 * 
 * 测试While循环
 * 
 * 
 */


public class TestWhile {
	public static void main(String[]args ){
		//计算1～100的求和
		int i=1;
		int sum=0;
		while (i<=100) {
			sum += i;
			i += 1;	
		}
		System.out.println("sum:"+sum);
		
		
		//分别计算1～100奇数与偶数的和
		int n= 1;
		int sum1 = 0;
		int sum2 = 0;
		while(n<=100) {
			if((n+2)%2 == 1) {
				sum1 +=n;
			}else {
				sum2 +=n;
			}
			n++ ;
		}
		System.out.print("sum1="+sum1 + "\n"+"sum2="+ sum2+"\n");
		
		//1~1000之间能被5整除的数，且每行输出5个
		for(int t=1, m= 0;t<=1000;t++){
			if(t%5==0) {
					System.out.print(t+"\t");	
					m++;
			}
			if(m%5==0) {
				System.out.print("\n");
			}
		}
	}
}

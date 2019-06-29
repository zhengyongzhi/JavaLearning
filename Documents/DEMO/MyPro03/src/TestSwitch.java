/*
 * 
 *Switch语句测试 
 * 
 */

public class TestSwitch {
	public static void main(String[]args) {
		int month =(int)(1+12*Math.random());
		
		switch(month){
		case 1:
			System.out.println("过年");
			break;
		case 2:
			System.out.println("开春");
			break;
		default:
			System.out.println("########");
			break;
		}
	}
}

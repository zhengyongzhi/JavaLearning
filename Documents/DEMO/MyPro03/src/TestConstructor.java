

class Point{
	double x,y;
	
	//构造方法与类名称保持一直
	public Point(double _x, double _y) {
		x=_x;
		y=_y;
	}
	
	//方法
	public double getDistance(Point p) {
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}
}


public class TestConstructor { 
	public static void main(String[]args){
		
		Point p = new Point(3.0,4.0);
		Point origin = new Point(0,0);
		System.out.println(origin.getDistance(p));
		System.out.println(p.getDistance(origin));
		
	}
}

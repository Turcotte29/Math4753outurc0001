import java.util.GregorianCalendar;
//import sun.util.calendar.Gregorian;

/**
 * 
 * @author ryanturcotte
 *
 */
public class Point {
	
	private static final int big = 5;
	int x; 
	int y;
	public int getX() {
		return x;
	}
	

	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y; 
	}


	public void setX(int x) {
		this.x = x;
	}
	int counter = 0;
	/*
	public static void main(String[] args) {
		Point[] points = new Point[2];
		int x; 
		System.out.println(x);
		for(int index = 0; index < big; index++) {
			int testIndex = index;
			//float pi = 3.14_7f;
			
			System.out.println(++testIndex + " " + testIndex);
			System.out.println(big);
			Point point;
			System.out.println(points[1].getX());
		}
		//GregorianCalender gc = new GregorianCalendar();
		//System.out.println(gc);
	}
	*/
	
	
	public Point(int x, int y)
	{
		if(x>= 0) {
			this.x =x;
			
		}
		if(y>=0) {
			this.y=y;
			
		}
		++counter;
	}
	public Point(Point p) {
		this(p.getX(), p.getY());
	}
}

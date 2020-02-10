package by.ld.unit01.ma;

public class Task8 {
	public static void main (String[] args) {
		
		double a,b,c,y;
		
		a = 1;
		b = 2;
		c = 123;
		
		if (a!=0 && b!=0 && Math.sqrt(b*b+4*a*c)>=0) {
			
			y = (b + Math.sqrt(b*b+4*a*c))/2*a - (Math.pow(a, 3)*c + Math.pow(b, -2));
			System.out.println("y = " + y);
		}
		else
		{
			System.out.println("нет решений");
		}
	
	}
}

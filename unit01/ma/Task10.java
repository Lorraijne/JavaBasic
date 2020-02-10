package by.ld.unit01.ma;

public class Task10 {
	public static void main (String[] args) {
		
		double x,y,z;
		
		x = 10;
		y = -1;

		if (Math.cos(x)-Math.sin(y)!=0)
		{
			z = (Math.sin(x) + Math.cos(y))/ (Math.cos(x) - Math.sin(y))*Math.tan(x*y);
			System.out.println("Значение выражения z = " + z);
		}	
	
		else
		{
			System.out.println("нет решений");
		}
		
	}
}

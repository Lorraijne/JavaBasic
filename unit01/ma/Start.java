package by.ld.unit01.ma;

public class Start {
	public static void main (String[] args) {
	
		double x, y, sum, dif, pr, quot = 0;
		
		x = 5;
		y = 10;
		
		sum = x + y;
		
		if (x - y > 0 || x - y == 0 ) {
			dif = x-y;
		}
		else {
			dif = y-x;
		} 
		
		pr = x * y;
		
		
		boolean temp;
		if (y!=0) {
			quot = x/y;
			temp = true;
		}
		else {
			temp = false;
		}
		
		if (temp == true) {
			System.out.println("Сумма = " + sum + "\n"+"Разница = " + dif+ "\n"+"Произведение = " + pr + "\n"+"Частное = "+ quot);
		}
		else
		{	System.out.println("Сумма = " + sum + "\n"+"Разница = " + dif+ "\n"+"Произведение = " + pr + "\n"+"Нельзя найти частное");
	
		}
	
		
		
	}
	
}


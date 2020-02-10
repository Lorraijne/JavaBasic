package by.ld.unit01.ma;

public class Task6 {
	public static void main (String[] args) {
		
		int n; //число бидонов
		double m_val; //общий объём молока в больших бидонах, в маленьких по условию 80
		
		n = 7; //определить число маленьких бидонов
		
		m_val = 80 + 12 *n; //алгоритм после преобразования
		
		System.out.println("Объём молока в больших бидонах = " + m_val);
	
	}
}

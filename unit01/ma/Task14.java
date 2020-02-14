package by.ld.unit01.ma;

public class Task14 {
	public static void main (String[] args) {
		
		double radius, circuit, area;
		
		radius = 6; //не буду добавлять проверки на дурака, потому что не читаем из консоли
		
		circuit = 2 * Math.PI * radius;
		
		area = Math.PI * Math.pow(radius, 2);
		
		System.out.println("Радиус окружности "+ circuit);
		
		System.out.println("Площадь круга "+ area);
	
	
	}
}

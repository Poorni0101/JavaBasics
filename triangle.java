package day2;

public class triangle {
	float a1;
	float a2;
	float a3;
	public triangle()
	{
		a1 = 3;
		a2 = 4;
		a3 = 5;
	}
	
	public void perimeter()
	{
		float p = a1+a2+a3;
		System.out.println("Perimeter : "+p);
	}
	
	public void area()
	{
		double a = (1.0/2.0)*a2*a3;
		System.out.println("area: "+a);
	}
	public static void main(String[] args) {
		triangle t1 = new triangle();
		t1.perimeter();
		triangle t2 = new triangle();
		t2.area();
	}
}

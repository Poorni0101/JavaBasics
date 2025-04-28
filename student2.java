package day2;

public class student2 {
	int roll_no;
	String name;
	int ph;
	String add;
	public student2(String name, int roll_no, int ph, String add)
	{
		this.roll_no = roll_no;
		this.ph = ph;
		this.add = add;
		this.name= name;
		
	}
	
	public static void main(String[] args) {
		student2 s = new student2("Sam",1,123456,"bangalore");
		s.answer();
		student2 s1 = new student2("Jhon",2,234567,"chennai");
		s1.answer();
	}


public void answer()
{
	System.out.print(name+" ");
	System.out.print(roll_no+" ");
	System.out.print(ph+" ");
	System.out.println(add);
}
}
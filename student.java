package day2;

public class student {
	  int roll_no;
	  String name;
	  public student(String name, int roll_no) {
		this.name = name;
		this.roll_no = roll_no;}
	  
	  public void answer()
		{System.out.println("Name: "+name);
		System.out.println("Roll no: "+roll_no);
	    }
		
	public static void main(String[] args) {
		
		student s = new student("Jhon",2);
		student s1 = new student("Mike",3);
		s.answer();
		s1.answer();
			}
	

		}
		
		
	



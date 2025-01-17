package Class;

public class ClassndObjects {
	public static void main(String[] args) {
		// Store 5 roll nos
//		int[] rollno=new int [5];
		
		//Store 5 names
//		String[] names=new String[5];
		
		//Data of 5 students
//		int[]rno=new int[5];
//		String[]name=new String[5];
//		float[]marks=new float[5];
		
		Student sucith=new Student();			//Empty constructor
		Student sucith1=new Student(51,"XXX",90.4f);	// The argument constructor
//		sucith.rollno=61;
//		sucith.name="Sucith";	// normal way to assigning data
//		sucith.marks=83.2f;
		
		System.out.println(sucith.rollno);
		System.out.println(sucith.name);
		System.out.println(sucith.marks);
		System.out.println();
		
		System.out.println("Constructor with arguments");
		System.out.println(sucith1.rollno);
		System.out.println(sucith1.name);
		System.out.println(sucith1.marks);
	}
	
	//create a class
	public static class Student{
		int rollno;
		String name;
		float marks;
		
		Student(){		// Empty Constructor
			this.rollno=62;
			this.name="Adaar";
			this.marks=93.3f;
		}
		
		Student(int roll,String naam, float mark){		//Constructor with arguments
			this.rollno=roll;
			this.name=naam;
			this.marks=mark;
		}
	}
}

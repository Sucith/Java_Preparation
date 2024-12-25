package Encapsulation;																						
public class Public {																					
	public int num;				//Public variable			
	protected String name;		//Protected variable
	float mark;					//No modifier
	private int avg;			//Private modifier
																			//(1) In the same class
	public Public(int num ,String name,float mark, int avg){				// (2) same package different class																			
		this.num= num;														// (3) same package subclass(inheritance)
		this.setName(name);													// (4) subclass of different package
		this.mark=mark;														// (5) Different package and not any subclass
		this.avg = avg;
	}																
	
	public void Display() {											
		System.out.println("The number is : "+num);					
	}
	
	public static class Subclass extends Public{
		Subclass(int num ,String name,float mark,int avg){
			super(num,name,mark,avg);
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public static void main (String [] args) {
		Public obj = new Public(16,"Sucith",89.6f,95);
		System.out.println("This is the public variable being accessed inside the class itself .");		
		System.out.println(obj.num);		//(1) PUBLIC
		System.out.println(obj.name);		//(1) PROTECTED
		System.out.println(obj.mark);		//(1) NO MODIFIER
		System.out.println(obj.avg);		//(1) PRIVATE 
		obj.Display();
		
		System.out.println();
		System.out.println("This is the public variavle being accessed in the subclass of the same package");		
		Subclass obj1 = new Subclass(4,"Sucith",98.5f,68);		
		System.out.println(obj1.num);			//(3) PUBLIC	
		System.out.println(obj1.name);			//(3) PROTECTED
		System.out.println(obj1.mark);			//(3) NO MODIFIER
//		System.out.println(obj1.avg);			//(3) Private is not possible
	}
		
}

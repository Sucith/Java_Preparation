package EncapsDiff;
import Encapsulation.Public;
public class DiffPackDemo {
	public static class Subclass extends Public{
		Subclass(int num,String name,float mark,int avg){
			super(num,name,mark,avg);
		}
		public String printname() {
			System.out.println(name);
			return null;
		}
	}
	public static void main(String[] args) {
		System.out.println("This is accessing the public variable in different package.");				
		Public obj = new Public(16, null,78.5f,54);		// null because (5) not possible for protected ones.
		System.out.println(obj.num);			//(5) PUBLIC
//		System.out.println(obj.name);			//(5) PROTECTED is not possible because in the case of protected variable they can't be accessed in the different packages without inheritance.
//		System.out.println(obj.mark);			//(5) NO MODIFIER is not possible in different package without inheritance
//		System.out.println(obj.avg);			//(5) PRIVATE is no possible in different package 
		System.out.println();
		System.out.println("This is accessing the public variable in the subclass of different package.");		
		Subclass obj1 = new Subclass(14,"Sucith",85.2f,75);	
		System.out.println(obj1.num);			//(4) PUBLIC
		obj1.printname();						//(4) PROTECTED
//		System.out.println(obj1.mark);			//(4) NO MODIFIER is not possible in case of different package with inheritance  
//		System.out.println(obj1.avg);			//(4) PRIVATE  is not possible in case of different package with inheritance
	}
}

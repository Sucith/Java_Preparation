package Encapsulation;
//import Encapsulation.Public;
public class SamePackage {
	public static class Subclass extends Public{
		Subclass(int num,String name,float mark,int avg) {
			super(num,name,mark,avg);
		}
	}
	public static void main(String[] args) {
		System.out.println("This is accessing the public variable in different class of the same Package"); 
		Public obj = new Public(14,"Sucith",78.5f,65);
		System.out.println(obj.num);		//(2) PUBLIC
		System.out.println(obj.name);		//(2) PROTECTED
		System.out.println(obj.mark);		//(2) NO MODIFIER
//		System.out.println(obj.avg);		//(2) PRIVATE
		System.out.println();
		System.out.println("This is accessing the public variable in subclass of the same package");		
		Subclass obj2 = new Subclass(45,"Sucith",89.5f,75);	
		System.out.println(obj2.num);		//(3) PUBLIC
		System.out.println(obj2.name);		//(3) PROTECTED
		System.out.println(obj2.mark);		//(3) NO MODIFIER
//		System.out.println(obj2.avg);		//(3) PRIVATE
}
}
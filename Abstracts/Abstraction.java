package Abstraction;

//import Abstraction.Abstraction.Parent;

public class Abstraction {
	public abstract  class Parent{	//Abstract parent class
		int age;
		Parent(int age){			//Parent class Constructor
			this.age=age;
		}
		abstract void career();			//Since this class has abstract methods the class is also defined abstract
		abstract void partner();
		
		static void hello() {
			System.out.println("This is Static method in the Abstract class");
		}
		
		void normal() {
			System.out.println("this is normal method in abstract class");
		}
	}
	
	public class Son extends Parent{	
		Son(int age){
			super(age);
		}		
		
		@Override
		void career() {										//Child class overrides the methods in the parent class
			System.out.println("im gonna be a coder");
		}

		@Override
		void partner() {
			System.out.println("I like Hinata "+" She is "+age+"years old.");
		}
		
		@Override
		void normal() {
			super.normal();
		}
		
	}
	
	public class Daughter extends Parent{
		Daughter(int age){
			super(age);
		}
		@Override													//Child class overrides the methods in the parent class
		void career(){
			System.out.println("I'm gonna be a doctor");
		}

		@Override
		void partner() {
			System.out.println("I like iron man");
		}
		@Override
		void normal() {
			super.normal();
		}
	}

public static void main(String[] args ) {
	Abstraction basic = new Abstraction();	
	Son obj = basic.new Son(26);
	Daughter obj1 = basic.new Daughter(23);
	obj.career();
	obj.partner();
	obj1.career();
	obj1.partner();
	obj.normal();
	Parent.hello();   			// Static methods in abstract class.
	//	Parent pobj = new Parent();	// Cannot create object of abstract class
}
}

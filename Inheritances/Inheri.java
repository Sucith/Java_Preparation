package Inheritance;

public class Inheri {
	public static class Box{
		double l;
		double h;
		double w;
		
		Box(){
			this.h=-1;		// Empty constructor
			this.l=-1;
			this.w=-1;
		}
		
		//cube
		Box(double side){
			this.l=side;
			this.h=side;	// single argument
			this.w=side;
		}
				
		Box(double l,double h, double w){		// three args
			this.l=l;
			this.h=h;
			this.w=w;
		}
		
		Box(Box old){
			this.h=old.h;
			this.l=old.l;		// Copy constructor
			this.w=old.w;
		}
		
		public void info() {
			System.out.println("This is runnnin'. ");
		}
	}
	
	// The child class
	public static class BoxWeight extends Box{		// The extends make the child class to inherit all the properties of the parent class into the child class.
		double weight;
		
		BoxWeight(){
			this.weight=-1;
		}
		BoxWeight(double l,double h, double w,double weight){
			super(l,h,w);			// Here this line is used to call the values that are present in the parent class parameter
			this.weight=weight;
		}
	}
	
	public static void main(String[] args) {
		Box box=new Box();// Runs the contructor with no arguments
		box.info();
		System.out.println(box.l+" "+box.h+" "+box.w);		
		// Runs the cons with one arg
		Box box1= new Box(54);
		System.out.println(box1.l+" "+box1.h+" "+box1.w);		
		// Cons with 3 args
		Box box2= new Box(11,22,33);
		System.out.println(box2.l+" "+box2.h+" "+box2.w);
		//Copy constructor
		Box box3=new Box(box);
		System.out.println(box3.l+" "+box3.h+" "+box3.w);		
		
		
		BoxWeight boxW=new BoxWeight();			// here the constructor BoxWeight tries to access the l and h that are not inside it , but it is accessed thro' the concept of inheritance
		System.out.println("INHERITANCE");
		System.out.println(boxW.l+" "+boxW.h+" "+boxW.weight);	// only weight is present in Boxweight().
		
		//Super keyword
		BoxWeight boxW1=new BoxWeight(10,20,30,40);	//here we are trying to call the args of the parent class constructor.(l,h,w)
		System.out.println(boxW1.l+" "+boxW1.h+" "+boxW1.w+" "+boxW1.weight);
	}
}

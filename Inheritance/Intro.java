package inherit;

public class Intro {
	public static class Box {
		double l; double h ;double w;
		// No arugments
		Box(){
			this.l=-1;
			this.h=-1;
			this.w=-1;
	}
		//Single argument
		Box(double side){	
			this.l=side;
			this.h=side;
			this.w=side;
		}
		//three arguments
		Box(double L ,double H,double W){
			this.l=L;
			this.h=H;
			this.w=W;
		}
		//Another object as argument
		Box(Box old){
			this.h=old.h;
			this.l=old.l;
			this.w=old.w;
		}
	}
	
	public static class BoxWeight extends Box{		// single inheritance
		double weight;
		BoxWeight() {
			this.weight=1;
		}
		BoxWeight(double l, double h, double w, double weight){
			super(l,h,w);			// The super is used to initialize the values present in the parent class to child class.(only if they are public)
			this.weight=weight;		// CALLS THE PARENT CLASS's CONSTRUCOR
		}
	}
	
	
	public static class BoxCost extends BoxWeight{
		double cost;
		BoxCost(){
			super();
			this.cost=-1;
		}
		BoxCost(double l,double h,double w, double weight, double cost){
			super(l,h,w,weight);
			this.cost=cost;
		}
	}
	
	public static void main(String[] args) {
		Box box=new Box();
		System.out.println("Empty Argument");
		System.out.println(box.l+"  "+box.h+"  "+box.w);	// runs the constructor with the empty args
		System.out.println();
		
		Box box1=new Box(2); 
		System.out.println("Single Argument");
		System.out.println(box1.l+"  "+box1.h+"  "+box1.w);	// runs the constructor with 2 args
		System.out.println();
		
		Box box2=new Box(2,4,6);
		System.out.println("Three Arguments");
		System.out.println(box2.l+"  "+box2.h+"  "+box2.w);// Runs the constructor with 3 args
		System.out.println();
		
		Box box3=new Box(box);
		System.out.println("Object as an argument");
		System.out.println(box3.l+"  "+box3.h+"  "+box3.w);  // since here box is the argument the output where the box is as argument is printed
		System.out.println();
		
		BoxWeight boxW=new BoxWeight();
		System.out.println("Using Inheritance");
		System.out.println(boxW.h+"  "+box3.l+"  "+boxW.w+"  "+boxW.weight);	// Runs as usual but here the diff is it adds another arg
		System.out.println();													// here first three are the args of base class and the last is of child class
		
		BoxWeight BoxW1=new BoxWeight(2,4,6,8);	 	// here if the super keyword is not used then is as error. Because the l , h and w are from the parent class.
		System.out.println("Using the super ");			// and are not initialized unless we use the super keyword
		System.out.println(BoxW1.l+"  "+BoxW1.h+"  "+BoxW1.w+"  "+BoxW1.weight);		
		System.out.println();
	
		BoxCost Box=new BoxCost(12,14,16,12,1200);
		System.out.println("Multilevel inheritance");
		System.out.println();
	}
}

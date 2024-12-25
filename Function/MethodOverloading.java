package Functions;

public class MethodOverloading {	
	public static void main(String[] args) {
		demo obj = new demo();
		int op=obj.addnums(5, 5);
		System.out.println(op);
		int op2=obj.addnums(5,5,5);
		System.out.println(op2);
	}
	
	public static class demo{
		public int addnums(int a, int b) {
			int ans = a+b;
			return ans;
		}
		
		public int addnums(int a , int b , int c) {
			int ans = a+b+c;
			return ans;
		}
	}
}

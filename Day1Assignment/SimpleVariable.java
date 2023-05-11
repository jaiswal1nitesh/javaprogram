package varible;

public class SimpleVariable {
    int x =10;
    static int y =20;
	public static void main(String[] args) {
		//System.out.println(x+"Is Instance variable");
		SimpleVariable sv =new SimpleVariable();
		System.out.println(sv.x+" Is Instance variable");
		System.out.println(y+" Is Static variable");
		sv.myInstanceMethod();
		myStaticMethod();
	}
	
	public void myInstanceMethod() {
		System.out.println(x+"  Is Instance variable Access in Instance method");
		System.out.println(y+"  Is Static variable Access in Instance Method");
     }
	static void myStaticMethod() {
		//System.out.println(x+" Is Instance variable Access in method");
		//SimpleVariable sv =new SimpleVariable();
		String s = "Welcome";
		SimpleVariable sv1 =new SimpleVariable();
		System.out.println(sv1.x+ " Is Instance variable Access in method");
		System.out.println(y+" Is Static variable Access in Static  Method");
		System.out.println(s+"  Is Local Variable"); 
	}
	
}
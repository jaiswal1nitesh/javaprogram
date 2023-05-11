package day1Problem;

public class DisplayDefaultValue {
	static int x;
	int y;
	float f;
	long l;
	double d;
	char ch;
	short sh;
	byte by;
	boolean b;
	String s;
	public static void main(String[] args) {
		DisplayDefaultValue defaultValue = new DisplayDefaultValue();
		System.out.println("Instance variable Integer Default value--> " +defaultValue.y);
		System.out.println("Static variable Intger Default value--->" +x);
		//System.out.println("String  Default Value -->"+defaultValue.ch);
		defaultValue.checkValue();
		
	}
	
	public void checkValue() {
		System.out.println("Floting Default Value -->"+f);
		System.out.println("Double Default Value -->"+d);
		System.out.println("Long Defaul Value -->"+l);
		System.out.println("Character Default Value -->"+ch);
		System.out.println("Short Default Value -->"+sh);
		System.out.println("Byte Default Value -->"+by);
		System.out.println("Boolean Default Value -->"+b);
		System.out.println("String Default Value -->"+s);
      }
}

package day16;

interface shape{
	int length =10; // final & static
	int width =20;  //final static
	
	void circle();  //abstract method
	
	default void square()
{
		System.out.println("this is square");
}

static void rectangle() {
	System.out.println("this is  rectangle -- static method");
}

}
public class Interfacedemo implements shape {
	public void circle() {
		System.out.println("this is circle -- abstract... ");
	}
	
	void triangle() {
		System.out.println("this is triangle");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interfacedemo idobj = new Interfacedemo();
		idobj.circle();  //abstract
		idobj.square(); //default
		
		shape.rectangle();  //static method can directly access from interface
	idobj.triangle();
	

		//scenario 2
		shape sh = new Interfacedemo();
		
		sh.circle();
		sh.square();
		
		shape.rectangle();
//		sh.triangle();
		
		System.out.println(shape.length*shape.width);
		//System.out.println(sh.x+sh.y);
	}

}

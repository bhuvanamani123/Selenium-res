package day16;

public class c1 extends c2 implements I1,I2{

public void m1() {
	System.out.println(x);
}
	
public void m2() {
	System.out.println(y);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
c1 c1obj = new c1();
c1obj.m1();
c1obj.m2();
	}

}

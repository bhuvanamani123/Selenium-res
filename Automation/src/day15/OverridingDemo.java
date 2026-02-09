package day15;

class Bank
{
	double roi() {
		return 0;
		
	}
}

class ICIC extends Bank
{
	double roi() {
		return 10.5;
		
	}
}

class sbi extends Bank
{
	double roi() {
		return 11.5;
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ICIC ic = new ICIC();
		System.out.println(ic.roi());
		
	sbi sb = new sbi();
		System.out.println(sb.roi());

	}

}

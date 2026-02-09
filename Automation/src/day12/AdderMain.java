package day12;

public class AdderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adder addobj = new Adder();
		addobj.sum();
		addobj.sum(10, 20);
		addobj.sum(15, 30.5);
		addobj.sum(100, 30);
		addobj.sum(10, 15, 30);
	}

}

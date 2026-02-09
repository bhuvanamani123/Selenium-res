package day5;

public class Continuestatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=10; i++) {
			if(i==3 || i==5 || i==9) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}

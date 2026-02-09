package day7;

public class Findhowmanyduplicateinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,200,100,500,100,400,100, 200};
		int num = 200;
		int count=0;
		for(int value:a) {
			if(value==num)
			{
				count++;	
			}
			
		}
		System.out.println(count);

	}

}

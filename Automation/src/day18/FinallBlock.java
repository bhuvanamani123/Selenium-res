package day18;

public class FinallBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s =null;
		try
		{
			System.out.println(s.length());
			
		}
		catch (NullPointerException e) {
			System.out.println("catch block handled Handle exception....");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("you entered into finaaly bock.. ");
		}
		
		
	System.out.println("Program finised");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

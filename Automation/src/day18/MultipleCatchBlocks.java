package day18;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program is started............");

		String s = null;
		try {
			System.out.println(s.length());

		}
//		catch (ArithmeticException e) {
//			System.out.println("Handle exception ");
//			System.out.println(e.getMessage());
//		} catch (NullPointerException e) {
//			System.out.println("Handle exception....");
//			System.out.println(e.getMessage());
//		}
		catch (Exception e) {
			System.out.println("Handle exception....");
			System.out.println(e.getMessage());
		}
		System.out.println("Program finshed....");

	}

}

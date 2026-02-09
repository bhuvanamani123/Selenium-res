package day11;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Student stu = new Student();
		
		
		//1) using object reference variable
		
		/*stu.sid = 101;
		stu.sname = "john";
		stu.grad='A';
		*/
		//using method
		
//		stu.setStudentsDate(101, "David", 'A');
//		stu.printStudentData();
		
		// 3) using constructor
		
		Student stu = new Student(101, "David", 'A');
		stu.printStudentData();
		
	}

}

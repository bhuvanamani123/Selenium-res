package day10;

public class Employee {
	//Variables
	int eid;
	String ename;
	String job;
	int sal;
	
	//methods
	 void display(){
		 System.out.println(eid);
		 System.out.println(ename);
		 System.out.println(job);
		 System.out.println(sal);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();//object
		emp1.eid = 101;
		emp1.ename="Bhuvana";
		emp1.job = "tester";
		emp1.sal = 3456;
		emp1.display();
		
		Employee emp2 = new Employee();//object
		emp2.eid = 102;
		emp2.ename="janu";
		emp2.job = "Teacher";
		emp2.sal = 4456;
		emp2.display();
		
	}

}

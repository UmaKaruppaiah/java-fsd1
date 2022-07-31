package Constructor;

public class EmployeeConstructor {
	int empId;
	 String empName;

	 //parameterized constructor with two parameters
	 EmployeeConstructor(int id, String name){
	 this.empId = id;
	 this.empName = name;
	 }
	 void info(){
	 System.out.println("Id: "+empId+" Name: "+empName);
	 }

	 public static void main(String args[]){
	EmployeeConstructor obj1 = new EmployeeConstructor(10245,"Chaitanya");
	EmployeeConstructor obj2 = new EmployeeConstructor(92232,"Negan");
	obj1.info();
	obj2.info(); 
	}
	 }

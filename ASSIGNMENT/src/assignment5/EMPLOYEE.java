package assignment5;

public class EMPLOYEE {

	private String EmpId;
	private String EmpName;
	private int age;
	private double salary;
	String designation;
	boolean PermanentEmployee;
	
	
	public EMPLOYEE(String eid, String empName, int age, double salary, String designation, boolean permanentEmployee) {
		super();
		this.EmpId = eid;
		this.EmpName = empName;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
		this.PermanentEmployee = permanentEmployee;
	}
	
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public boolean isPermanentEmployee() {
		return PermanentEmployee;
	}
	public void setPermanentEmployee(boolean permanentEmployee) {
		PermanentEmployee = permanentEmployee;
	}
}

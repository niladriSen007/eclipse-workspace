import java.util.Scanner;
public class Sample1 {

	
		Scanner sc=new Scanner(System.in);
		
		private int id;
		private String name;
		private int age;
		private double salary;
//		public void setid()
//		{
//			id=10;
//		}
//		public void getid()
//		{
//			System.out.println(id);
//		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}

	

}

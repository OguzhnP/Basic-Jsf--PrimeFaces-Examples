package bean;

import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
	  private String name2;
	   private String department;
	   private int age;
	   private double salary;
	   private boolean canEdit;

	   public Employee (String name2,String department,int age,double salary) {
	      this.name2 = name2;
	      this.department = department;
	      this.age = age;
	      this.salary = salary;
	      canEdit = false;
	   }

	   public String getName2() {
	      return name2;
	   }

	   public void setName2(String name2) {
	      this.name2 = name2;
	   }

	   public String getDepartment() {
	      return department;
	   }

	   public void setDepartment(String department) {
	      this.department = department;
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

	   public boolean isCanEdit() {
	      return canEdit;
	   }

	   public void setCanEdit(boolean canEdit) {
	      this.canEdit = canEdit;
	   }	
	   
	   
}

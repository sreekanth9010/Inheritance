package inheritance;


class Employee
{
	private int empId;
	private String name;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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

class PermanentEmployee extends Employee
{
	private double basicPay;
	private double hra;
	private int experience;
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public PermanentEmployee(double basicPay, double hra, int experience,int empId,String name) {
		super();
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
		this.setEmpId(empId);
		this.setName(name);
		
	}
	public void calculateSalary()
	{
		double variableComponent=0;
		if(experience<3)
		{
			variableComponent=0;
		}
		else if(experience>=3 && experience<5)
		{
			variableComponent=(0.05*basicPay);
		}
		else if(experience>=5 && experience<10)
		{
			variableComponent=(0.07*basicPay);
		}
		else if(experience>=10)
		{
			variableComponent=(1.2*basicPay);
		}
		double salary = basicPay+hra+variableComponent;
		System.out.println("PermanentEmployee :your salary is:"+salary);
	}	
}
class ContractEmployee extends Employee
{
	private double wage;
	private int hours;
	public ContractEmployee(double wage, int hours,int empId,String name) {
		super();
		this.wage = wage;
		this.hours = hours;
		this.setEmpId(empId);
		this.setName(name);
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public void calculateSalary()
	{
		double salary = hours*wage;
		System.out.println("ContractEmployee :your salary is:"+salary);
		
	}	
	
}
public class TestEssentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee p = new PermanentEmployee(10000,1500,3,101,"Anil");
		p.calculateSalary();
		System.out.println(p.getName());
		ContractEmployee c = new ContractEmployee(500,10,102,"Ankit");
		c.calculateSalary();

	}

}

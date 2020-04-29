
/**
*Employee wage computation program
*@author:Amrut
*/
import java.util.Random;
public class EmpWageComputation 
{
	//main method
	public static void main(String[] args) 
	{
		int attend;
		System.out.println("Welcome to employee wage computation");

		//instantiating EmpUtil class
		EmpUtil eu=new EmpUtil();
		Random ran=new Random();
		attend=ran.nextInt(2);

		//calling checkAttendance method
	  	eu.checkAttendance(attend);
	}
}

//Employee utility class
class EmpUtil
{
	int attendance;
	double salary;
	final int wagePerHr=20;
	int empHr;

	//method to check employee attendance
	public void checkAttendance(int attendance)
	{
		this.attendance = attendance;
		if(this.attendance==0)
		{
			System.out.println("Employee is present");
			empDailyWage();
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
	
	//method to calculate employee daily wage
	public void empDailyWage()
	{
		empHr=8;
		salary=wagePerHr*empHr;
		System.out.println("Employee daily wage is::"+salary);
	}
}
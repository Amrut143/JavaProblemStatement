/**
*Employee wage calculation for different company using procedural approach
*@author:Amrut
*/
import java.util.Random;
public class EmpWageCalObject 
{
	
	public static final int IS_PART_TIME=0;
	public static final int IS_FULL_TIME=1;

	/*instance variables*/
	private final String company;
	private final int empRatePerHr;
	private final int numOfWorkingDays;
	private final int maxHrPerMonth;

	/*constructor to initialize the instance variables*/
	public EmpWageCalObject( String company, int empRatePerHr, int numOfWorkingDays, int maxHrPerMonth)
	{
		this.company=company;
		this.empRatePerHr=empRatePerHr;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHrPerMonth=maxHrPerMonth;
	}

	//maim method
	public static void main(String[] args) 
	{
		//create instance of the class
		EmpWageCalObject dmart=new EmpWageCalObject("Dmart", 100, 20, 10);
		//variables
		int empHrs=0;
		int totalWorkingHrs=0;
		int totalWorkingDays=0;
		int empCheck;

		//computation of employee wage
		while(totalWorkingHrs <= dmart.maxHrPerMonth && 
			  totalWorkingDays < dmart.numOfWorkingDays)
		{
			totalWorkingDays++;
			Random ran=new Random();
			empCheck=ran.nextInt(2);
			switch(empCheck)
			{
				case 0:
					System.out.println("part time employee");
					empHrs=4;
					break;

				case 1:
					System.out.println("full time employee");
					empHrs=8;
					break;

				default:
					empHrs=0;

			}
			totalWorkingHrs+=empHrs;
			System.out.println("Day:: "+totalWorkingDays+ "\nEmp Hr::" +empHrs);
		}
		int totalEmpWage=totalWorkingHrs * dmart.empRatePerHr;
		System.out.println("Total Emp Wage for Company: " +dmart.company+" is: " +totalEmpWage);
		
	}
}

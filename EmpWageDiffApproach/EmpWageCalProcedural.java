/**
*Employee wage calculation for different company using procedural approach
*@author:Amrut
*/

import java.util.Random;
public class EmpWageCalProcedural 
{
	public static final int IS_PART_TIME=0;
	public static final int IS_FULL_TIME=1;

	//method to calculate employee wage for company
	public static void calEmpWageForCompany(String company, int empRate, int numOfDays, int maxHrs)
	{
		//variables
		int empHrs=0;
		int totalWorkingHrs=0;
		int totalWorkingDays=0;
		int empCheck;

		//computation of employee wage
		while(totalWorkingHrs <= maxHrs && totalWorkingDays <= numOfDays)
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
		int totalEmpWage=totalWorkingHrs * empRate;
		System.out.println("Total Emp Wage for Company: " +company+" is: " +totalEmpWage);
	}
	public static void main(String[] args) 
	{
		//calling empwage method for dmart company
		calEmpWageForCompany("Dmart", 20, 20, 10);
		//calling empwage for flipkart company
		calEmpWageForCompany("Flipkart", 50, 10, 8);
		//calling empwage method for relaince company
		calEmpWageForCompany("Relaince", 30, 15, 9);
	}
}

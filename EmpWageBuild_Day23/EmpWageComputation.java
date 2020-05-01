import java.util.Random;
/**
*compute employee wage for multiple companies and manage them using array
*@author:Amrut
*/
public class EmpWageComputation
{
	public static final int IS_PART_TIME=0;
	public static final int IS_FULL_TIME=1;

	private int numOfCompany=0;

	/*define array to store company employee wage*/
	private CompanyEmpWage[] companyEmpWageArray;
	/*define constructor to initialize array*/
	public EmpWageComputation()
	{
		companyEmpWageArray=new CompanyEmpWage[5];
	}
	/*method to add company employee wage*/
	private void addCompanyEmpWage(String company, int empRatePerHr,
									int numOfWorkingDays,int maxHrPerMonth)
	{
		companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHr,numOfWorkingDays,maxHrPerMonth);
		numOfCompany++;
	}
	/*method to compute employee wage for specified number of company*/
	private void computeEmpWage()
	{
		for (int i=0; i<numOfCompany; i++ )
		{
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	/*method to compute employee wage*/
	private int computeEmpWage(CompanyEmpWage companyEmpWage)
	{
		//variables
		int empHrs=0;
		int totalWorkingHrs=0;
		int totalWorkingDays=0;
		int empCheck;

		//computation of employee wage
		while(totalWorkingHrs <= companyEmpWage.maxHrPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays)
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
		return totalWorkingHrs * companyEmpWage.empRatePerHr;
	}

	public static void main(String[] args) 
	{
		/*instantiate empwage computation class*/
		EmpWageComputation emp=new EmpWageComputation();
		/*calling addCompanyEmpWage method for different companies*/
		emp.addCompanyEmpWage("Dmart",20,2,10);
		emp.addCompanyEmpWage("Relaince",10,4,20);
		emp.addCompanyEmpWage("IBM",50,6,15);
		/*call computeEmpwage method*/
		emp.computeEmpWage();
	}
}


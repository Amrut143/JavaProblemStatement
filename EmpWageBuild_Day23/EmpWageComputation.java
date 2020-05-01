import java.util.*;

/**compute employee wage for multiple company and manage them using arraylist
*@author:Amrut
*/
/*emp wage computation class that implements interface IComputeEmpWage*/
public class EmpWageComputation implements IComputeEmpWage
{
	public static final int IS_PART_TIME=0;
	public static final int IS_FULL_TIME=1;

	private int numOfCompany=0;
	/*define arraylist and map object*/
	private ArrayList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyEmpWageMap;

	public EmpWageComputation()
	{
		/*creating arraylist and map object to manage multiple company employee wage and retrieved according to company*/
		companyEmpWageList=new ArrayList<>();
		companyEmpWageMap=new HashMap<>();
	}

	/*method to add multiple company*/
	public void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrPerMonth)
	{
		//instantitate company employee wage class
		CompanyEmpWage companyEmpWage=new CompanyEmpWage(company, empRatePerHr, numOfWorkingDays, maxHrPerMonth);
		/*addind object in arraylist and map*/
		companyEmpWageList.add(companyEmpWage);
		companyEmpWageMap.put(company, companyEmpWage);
		
	}
	public void computeEmpWage()
	{
		for(int i=0; i<companyEmpWageList.size(); i++)
		{
			CompanyEmpWage companyEmpWage=companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	/*override method from companyempwage class to get total emp wage according to company*/
	@Override
		public int getTotalWage(String company)
	{
		return companyEmpWageMap.get(company).totalEmpWage;
	}
	/*mnethod to compute emp wage*/
	public int computeEmpWage(CompanyEmpWage companyEmpWage)
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
		/*instantiate EmpWageComputation class*/
		IComputeEmpWage empWageComputation=new EmpWageComputation();
		//calling addCompanyEmpWage method for different company
		empWageComputation.addCompanyEmpWage("Dmart",20,2, 10);
		empWageComputation.addCompanyEmpWage( "Relaince", 50, 4,20);
		empWageComputation.addCompanyEmpWage( "Flipkart", 70, 6,10);
		empWageComputation.addCompanyEmpWage( "IBM", 100, 5,15);
		empWageComputation.addCompanyEmpWage( "Mindtree", 150, 4,10);
		//calling computeEmpWage method
		empWageComputation.computeEmpWage();
		System.out.println("Total Wage for Dmart Company: "+empWageComputation.getTotalWage("Dmart"));
		System.out.println("Total Wage for IBM Company: "+empWageComputation.getTotalWage("IBM"));
	}
}


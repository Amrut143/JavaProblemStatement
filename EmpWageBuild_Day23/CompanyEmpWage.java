/**
*creating company employee wage to manage emp wage for multiple company
*@author:Amrut
*/

public class CompanyEmpWage
{
	public final String company;
	public final int empRatePerHr;
	public final int numOfWorkingDays;
	public final int maxHrPerMonth;
	public int totalEmpWage;

	//define constructor to initialize variables
	public CompanyEmpWage(final String company,final int empRatePerHr,
							final int numOfWorkingDays,final int maxHrPerMonth)
	{
		this.company=company;
		this.empRatePerHr=empRatePerHr;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHrPerMonth=maxHrPerMonth;
		totalEmpWage=0;
	}
/*method to set the total employee wage*/
public void setTotalEmpWage(int totalEmpWage)
	{
		this.totalEmpWage=totalEmpWage;
	}

	@Override
		public String toString()
	{
		return "Total Emp Wage for Company:" +company+ " is: "+totalEmpWage;
	}
}

/**
*create interface to define method which is implemented in empwagecomputation class
*@author:Amrut
*/
public interface IComputeEmpWage
{
	/*define method to add multiple companies*/
	public void addCompanyEmpWage(String company, int empRatePerHr,
									int numOfWorkingDays, int maxHrPerMonth);
	/*define method to compute employee wage*/
	public void computeEmpWage();
	/*define method to get the total employee wage*/
	public int getTotalWage(String company);
}

/**
*Employee Wage Computation Program
*calculated wages for a month
*@author:Amrut
*/
import java.util.Random;

class EmpWageComputation{
      public static void main(String []s){
	int empType;
	int dailyWage;
	int monthlyWage=0;
	int workingHrs;
        System.out.println("Welcome to Employee Wage Computation Program");
	EmpUtil eu = new EmpUtil();
	Random ran = new Random();
	empType = ran.nextInt(2);
	//Storing the empHr returned in the variable workingHrs
	workingHrs = eu.getEmpType(empType);
	//Storing the daily wage in the variable DailyWage
	dailyWage = eu.getDailyWage(workingHrs);
	//getting monthly wage  
        for (int i=1;i<=20;i++){
            monthlyWage += eu.getMonthlyWage(workingHrs,i);
	}
        System.out.println("Employee monthy wage is: "+monthlyWage);
      }
}
///Employee utility class
class EmpUtil{
int salary;
int attendance;
final int wagePerHr=20;
int empHr;

      //method to get employee is part time or full time
      public int getEmpType(int type){
       if(type==0){
          System.out.println("FULL TIME EMPLOYEE");
          empHr = 8;
          return empHr;
       }
       else{
          System.out.println("PART TIME EMPLOYEE");
          empHr = 4;
          return empHr;
       }
	  }

      //method to get employee monthly wage
      public int getMonthlyWage(int Hour , int day)
		  {
			int status;
			Random ran = new Random();
			status = ran.nextInt(2);
				if(status==0)
					{
						System.out.println("Day "+day+":Employee Present");					
      					salary=wagePerHr*Hour;
      					return salary;
					}
				else
					{
						System.out.println("Day "+day+": Employee Absent");
						salary=0;																
						return salary;
					}
			}
      //method to return employee daily wages
      public int getDailyWage(int Hour)
		  {
			int wage;
			wage=wagePerHr*Hour;
			return wage;
		}
}

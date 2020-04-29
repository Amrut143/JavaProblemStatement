/*
*Employee Wage Computation Program
*calculate wages till 20 days or 100 working hours reached
*@author:Amrut
*/
import java.util.Random;

class EmpWageComputation3{
      //main method
      public static void main(String[] args){
        int empType;
		int dailyWage;
		int workingHrs;
	  //Totaldays variable counts days till 20 starting from day 1
		int totalWorkingDays=1;
		int loop=0;
		int [] salaryAndHours = new int[2];
        System.out.println("Welcome to Employee Wage Computation Program");
		EmpUtil eu = new EmpUtil();
		Random ran = new Random();
		empType = ran.nextInt(2);

		workingHrs = eu.getEmpType(empType);
		//daily wage of employee
		dailyWage = eu.getDailyWage(workingHrs);
		System.out.println("The daily wage is: "+dailyWage);

         while (loop==0){

            salaryAndHours = eu.getMonthlyWage(workingHrs,totalWorkingDays,empType);
			//Loop till 20 days are over or 100 working hours completed
            if(totalWorkingDays==20 || salaryAndHours[1]==100){
				if(totalWorkingDays==20)
					{
						System.out.println("20 days over!");
						break;
					}
				else
					{
						System.out.println("100 working hours completed!");
						break;
					}
				}
				totalWorkingDays+=1;
         }
		System.out.println("Employee worked for: "+salaryAndHours[1]+ "hours");
		System.out.println("Employee monthly wage is: "+ salaryAndHours[0]);
      }
}
//employee utility class
class EmpUtil{
int salary;
int attendance;
int workingHour;
int empHr;
final int wagePerHr=20;
      
	  //method to find employee type and return employee working hour
      public int getEmpType(int type){
        int empHr;
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

      //method to get employee monthly wage and total working hours
      public int[] getMonthlyWage(int hour, int day, int type){
       	int status;
		Random ran = new Random();
		status = ran.nextInt(2);
		int[] salaryAndHours = new int[2];
		if(status==0){
			System.out.println("Day "+day+": Employee Present");
			salary+=wagePerHr*hour;
	    if(type==0)
			workingHour+=8;
	    if(type==1)
			workingHour+=4;
            salaryAndHours[0] = salary;
			salaryAndHours[1] = workingHour;
			return salaryAndHours;
		}
		else
			{
			System.out.println("Day "+day+": Employee Absent");
			salary+=0;
            workingHour+=0;
			salaryAndHours[0] = salary;
            salaryAndHours[1] = workingHour;
            return salaryAndHours;
		}
      }
      //method to get employee daily wages
		public int getDailyWage(int hour){
	    int wage;
	    wage=wagePerHr*hour;
            return wage;
      }
}


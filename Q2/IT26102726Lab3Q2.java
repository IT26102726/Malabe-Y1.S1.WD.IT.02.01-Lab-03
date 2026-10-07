import java.util.Scanner;
public class IT26102726Lab3Q2{
	public static void main (String[]args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the monthly salary:");
		double price=input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:");
		double monthlySalary=input.nextDouble();
		
		System.out.print("Enter the number of OT hours:");
		double otHours=input.nextDouble();
		
		System.out.print("Enter the OT hourly rate:");
		double otRate=input.nextDouble();
		
		double otAmount = otHours*otRate;
		double totalSalary =monthlySalary+otAmount;
		
		
		System.out.println("The total salary including OT is:"+totalSalary);
		
	}
}

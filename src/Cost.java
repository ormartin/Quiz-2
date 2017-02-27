import java.util.Scanner;

public class Cost {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("How much is your initial tuition: ");
		double BaseTuition = scan.nextDouble();
		
		System.out.print("What is the percentage increase in tuition each year: ");
		double percent = scan.nextDouble();
		scan.close();
		
		double rate = 1 + (percent/100);
		//This problem is just a geometric series
		double FourYearCost = BaseTuition * (1 - Math.pow(rate, 4)) / (1 - rate);
	
		System.out.printf("The four year cost of tuition is: $%.2f", FourYearCost);
	}
}

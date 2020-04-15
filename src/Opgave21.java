import java.util.Scanner;

public class Opgave21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount");
        double investmentAmount = input.nextDouble();
        System.out.println("Enter annual interest rate in percentage");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate/1200;
        System.out.println("Enter number of years");
        int numberOfYears = input.nextInt();

        double futureInvestment = investmentAmount* (Math.pow(1 + monthlyInterestRate,numberOfYears*12));

        System.out.println("Future value is $" + futureInvestment);
    }
}

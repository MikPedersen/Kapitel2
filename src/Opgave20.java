import java.util.Scanner;

public class Opgave20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%)");

        int balance = input.nextInt();
        double interestRate = input.nextDouble();
        double interest = balance * (interestRate/1200);

        System.out.println("Next months interest is $" + interest);
    }
}

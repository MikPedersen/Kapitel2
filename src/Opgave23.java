import java.util.Scanner;

public class Opgave23 {
    public static void main(String[] args) {
        //System.out.println("Opgave 2.23");
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the cost of driving calculator");
        System.out.println("Please enter the driving distance");
        double distance = input.nextDouble();
        System.out.println("Please enter your miles per gallon");
        double milesPerGallon = input.nextDouble();
        System.out.println("Please enter the current price pr gallon");
        double pricePerGallon = input.nextDouble();
        System.out.println("Your cost of driving is " + distance/milesPerGallon*pricePerGallon);
    }
}

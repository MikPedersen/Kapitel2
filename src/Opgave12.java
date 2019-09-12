import java.util.Scanner;
import java.lang.Math;
public class Opgave12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Opgave 2.12");
        System.out.println("Welcome to the runway length calculator");
        System.out.println("Please enter the takeoff speed in meters pr second");
        double takeOffSpeed = input.nextDouble();
        System.out.println("Please enter the acceleration in meters pr second");
        double acceleration = input.nextDouble();
        double lenght = (Math.pow(takeOffSpeed, 2)/(2*acceleration));
        System.out.println("The minimum required runway is " + lenght + " meters");
    }
}

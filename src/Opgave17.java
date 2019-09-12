import java.util.Scanner;
import java.lang.Math;
public class Opgave17 {
    public static void main(String[] args) {
        //System.out.println("Opgave 2.17");
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the wind chill temperature calculator");
        System.out.println("Please enter the temperature in fahrenheit");
        double degrees = input.nextDouble();
        System.out.println("Please enter the windspeed in miles pr hour");
        double windspeed = input.nextDouble();
        double windChillTemp = 35.74 + (0.6215 * degrees) - ((35.75) * Math.pow(windspeed, 0.16)) + (0.4275 * degrees * (Math.pow(windspeed, 0.16)));
        if (degrees < -58 || degrees > 41 || windspeed < 2) {
            System.out.println("Cannot calcute if the tempeture is lower then -58°F or above 41°F");
            System.out.println("Cannot calculate if windspeed is below 2 miles pr hour");
            System.out.println("Please enter the temperature in fahrenheit");
            degrees = input.nextDouble();
            System.out.println("Please enter the windspeed in miles pr hour");
            windspeed = input.nextDouble();
            System.out.println("The wind chill temperature is " + windChillTemp);
        }
        else
            System.out.println("The wind chill temperature is " + windChillTemp);
    }
}
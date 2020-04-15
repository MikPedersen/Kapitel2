import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Opgave3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many meters do you want in feet?");
        double feetPerMeter = 3.2786;
        double result = feetPerMeter*input.nextInt();

        System.out.println("The result is " + result);
    }
}

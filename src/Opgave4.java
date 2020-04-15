import java.util.Scanner;

public class Opgave4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your square meters");
        double pingsPerSquaremeter = 0.3025;
        double result = pingsPerSquaremeter*input.nextInt();
        System.out.println("Your input is " + result + " pings");
    }
}

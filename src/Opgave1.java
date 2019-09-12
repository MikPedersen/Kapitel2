import java.util.Scanner;

public class Opgave1 {
    //scanner Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.println("Opgave 2.1");
        System.out.println("Welcome to mile konverter");
        System.out.println("How many miles do you want to convert");
        Scanner input = new Scanner(System.in);

        double mile = input.nextDouble();
        double km = mile*1.6;

        System.out.println(mile + " miles is " + km + " kilometers");
    }
}

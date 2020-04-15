import java.util.Scanner;

public class Opgave5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter subtotal and gratuity");
        int subtotal = input.nextInt();
        double gratuity = (subtotal*input.nextInt())/100.0;
        double result = gratuity + subtotal;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + result);
    }
}

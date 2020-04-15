import java.util.Scanner;

public class Opgave6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000");
        int userinput = input.nextInt();
        int lastNumber = userinput%10;
        int secondNumber = userinput/10%10;
        int firstNumber = userinput/10/10%10;

        int result = lastNumber*secondNumber*firstNumber;
//        System.out.println(lastNumber + " " + secondNumber + " " + firstNumber);
        System.out.println("The multiplication of all digits in " + userinput + " is " + result);
    }
}

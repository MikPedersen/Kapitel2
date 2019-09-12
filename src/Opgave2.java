import java.util.Scanner;
import java.lang.Math;
public class Opgave2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Opgave 2.2");
        System.out.println("Welcome to area and volume calculator");
        System.out.println("Please enter a side in centimeters");
        double side = input.nextDouble();
        System.out.println("Please enter the height of the prism");
        double prism = input.nextDouble();
        double area = (Math.sqrt(3)/(4))*(Math.pow(side, 2));
        System.out.println("The area of the triangle is " + area);
        System.out.println("The volume of the triangles prism is " + area*prism);

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will give you the required runway length for a plane if you know the acceleration and takeoff speed");
        System.out.println("Enter speed and acceleration: ");
        double v = input.nextDouble();
        double a = input.nextDouble();
        System.out.println("The minimum runway length has to be = " + Math.pow(v,2) / (2 * a));

    }
}

import java.util.Scanner;

public class Convertcentimeterstofeet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double centimeters = input.nextDouble();
        double feet = centimeters / 30.48;
        System.out.println((int) feet);
        input.close();
    }
}
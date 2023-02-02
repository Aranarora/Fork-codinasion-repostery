import java.util.Scanner;

public class Converthourstoweeks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();
        int weeks = hours / 168;
        System.out.println(weeks);

        input.close();
    }
}
import java.util.Scanner;

public class convertweekstohours {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter number of weeks: ");
        int weeks = scnr.nextInt();
        int hours = weeks * 168;
        System.out.println(weeks + " weeks = " + hours + " hours");
        scnr.close();
    }
    
}

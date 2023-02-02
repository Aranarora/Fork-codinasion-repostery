import java.util.Scanner;


    public class PrintstringofASCIIvalues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String asciiValues = input.nextLine();
        String[] values = asciiValues.split(" ");
        StringBuilder result = new StringBuilder();
        for (String value : values) {
            result.append((char) Integer.parseInt(value));
        }
        System.out.println(result.toString());
        input.close();
    }
}

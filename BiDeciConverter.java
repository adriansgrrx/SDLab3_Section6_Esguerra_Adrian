import java.util.Scanner;

public class BiDeciConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of conversions: ");
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading N

        String[] binaryNumbers = new String[N]; // Array to store binary numbers

        // Read N binary numbers
        System.out.println("\nYour binary numbers: ");
        for (int i = 0; i < N; i++) {
            binaryNumbers[i] = scanner.nextLine();
        }

        // Convert binary numbers to decimal and display the results
        System.out.println("\nIn decimal form: ");
        for (int i = 0; i < N; i++) {
            int decimal = convertBinaryToDecimal(binaryNumbers[i]);
            System.out.println(decimal);
        }
    }

    private static int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, power);
            power++;
        }

        return decimal;
    }
}

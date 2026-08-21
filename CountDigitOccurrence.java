import java.util.Scanner;

public class CountDigitOccurrence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter the digit to count: ");
        int target = sc.nextInt();

        int count = 0;
        int temp = Math.abs(num);

        while (temp > 0) {
            int digit = temp % 10;

            if (digit == target) {
                count++;
            }

            temp = temp / 10;
        }

        System.out.println("Occurrence of " + target + ": " + count);

        sc.close();
    }
}

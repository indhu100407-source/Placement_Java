import java.util.Scanner;

public class ContainsZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = Math.abs(num);
        boolean containsZero = false;

        if (temp == 0) {
            containsZero = true;
        }

        while (temp > 0) {
            int digit = temp % 10;

            if (digit == 0) {
                containsZero = true;
                break;
            }

            temp = temp / 10;
        }

        if (containsZero) {
            System.out.println("Number contains 0");
        } else {
            System.out.println("Number does not contain 0");
        }

        sc.close();
    }
}

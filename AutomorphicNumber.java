import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;

        if (square % 10 == num % 10) {
            System.out.println(num + " is an Automorphic Number");
        } else {
            System.out.println(num + " is not an Automorphic Number");
        }

        sc.close();
    }
}
import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int mul;
        for (int i = 1; i <= 10; i++) {
            mul = n * i;
            System.out.println(mul);
        }
    }
}
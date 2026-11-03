import java.util.Scanner;

public class Armstrong {
 
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = countDigits(num);
        
        while (num > 0) {
            int digit = num % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
            num /= 10;
        }
        
        return sum == originalNum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
        
        sc.close();
    }
}

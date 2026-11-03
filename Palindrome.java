import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int originalNum = n;
        int rev = 0,m;
        while(n>0){
            m=n%10;
            n=n/10;
            rev = (rev*10) + m;
        }
        if(originalNum == rev){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome Number");
        }
    }
}
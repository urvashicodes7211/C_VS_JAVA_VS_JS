import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of series: ");
        int n = sc.nextInt();
        int first=0,second=1,sum;
        for(int i=0;i<n;i++){
            System.out.print(first+" ");
            sum=first+second;
            first=second;
            second=sum;
        }
    }
}
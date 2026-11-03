import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int rev=0,m;
        while(n>0){
            m=n%10;
            n=n/10;
            rev = (rev*10) + m;
        }
        System.out.println(rev);
    }
}
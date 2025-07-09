import java.util.Scanner;
public class while2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a=n;
        int rev=0;
        while(n!=0){
            int m=n%10;
            rev=(rev*10)+m;
            n=n/10;
        }
        if(a==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}

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
/*
Write a program to find if the given number is palindrome or not. 
Test Case 1 
Input  
Output 
Test Case 2 
Input  
Output 
: 1234 
: Not a Palindrome 
: 11211 
: Palindrome 
    */

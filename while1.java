import java.util.Scanner;
public class while1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0;
        int rem=0;
        while(n>0){
            rem = n%10;
            rev = (rev*10)+rem;
            n/=10;
        }
        System.out.println(rev);
    }
}
/*
Write a program to reverse a   given number and print 
Test Case 1 
Input  
Output  
Test Case 2 
Input  
Output  
: 1234 
: 4321 
: 78512 
: 21587
    */

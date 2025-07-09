import java.util.Scanner;

public class forloop4 {
    public class ForLoop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=n; i!= 0;i=i/ 10) {
            int m=i%10;  
            sum+=m;         
        }
        System.out.println(sum);
    }
}
}
/*
Write a program to print the sum of all the digits of a given number. 
 
Test Case 1 
Input  : 12345 
Output  : 15 
 
Test Case 2 
Input  : 17854 
Output  : 25  
*/

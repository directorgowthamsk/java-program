import java.util.Scanner;
public class if1 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(0<n) {
            System.out.println("Positive");
        }else if(n<0) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
/*
Write a program to check if a given integer number is Positive, Negative, or Zero. 
Test Case 1 
Input 
: 1 
Output : Positive Number 
Test Case 2 
Input 
: -125 
Output : Negative Number 
Test Case 3 
Input 
: 0 
Output : Zero 
     */

    

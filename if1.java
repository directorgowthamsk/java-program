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
Write a program to receive a color code from the user (an Alphabhet). The program 
should then print the color name, based on the color code given. 
The following are the color codes and their corresponding color names. 
R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. 
If color code provided by the user is not valid then print "Invalid Code". 
Test Case 1 
Input  
Output : Green 
Test Case 2 
Input  
Output : Blue 
Test Case 3 
Input  
: G 
: B 
: M 
Output : Invalid Code
     */

    

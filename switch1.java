import java.util.Scanner;
public class switch1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        switch (a) {
            case 'G':
                System.out.println("Green");
                break;
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'W':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid code");
                break;
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

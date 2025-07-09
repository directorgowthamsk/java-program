import java.util.Scanner;
class if2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
/*
Write a program to receive a number and print the corresponding month name. 
Test Case 1 
Input  
Output  
Test Case 2 
Input  
Output  
: 8 
: August 
: 15 
: Invalid Month 

    */

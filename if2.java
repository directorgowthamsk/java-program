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
Write a program to check if a given integer number is odd or even. 
Test Case 1 
Input 
: 1 
Output : Odd Number 
Test Case 2 
Input 
: 124 
Output : Even Number

    */

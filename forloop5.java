import java.util.Scanner;
public class forloop5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println(" ");
        }
    }
}
/*
 
Write a program to print the Floyds Triangle 
 
Test Case 1 
Input  : 3 
Output  :  1 
   2 3 
   4 5 6 
 
Test Case 2 
Input  : 6 
Output  :  1 
   2   3 
   4   5    6 
   7   8    9   10 
   11 12 13  14  15
    */

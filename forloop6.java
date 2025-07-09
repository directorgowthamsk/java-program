import java.util.Scanner;
public class forloop6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
/*
   
Write a program to print the following pattern 
 
Test Case 1 
Input  : 5 
Output 
 
         * 
       * * 
     * * * 
   * * * * 
 * * * * * 
 
Test Case 2 
Input  : 4 
Output   
  
         * 
       * * 
     * * * 
   * * * * 
*/

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
Initialize a character variable with an alphabet in a program. 
Test Case 1 
If the character value is in lowercase, the output should be displayed in uppercase 
in the following format. 
Input 
: a 
Output : A 
Test Case 2 
If the character value is in uppercase, the output should be displayed in lowercase 
in the following format. 
Input 
: A 
Output : a 
*/

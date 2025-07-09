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
Write a program to accept gender ("Male" or "Female") and age and print the 
percentage of interest based on the given conditions. 
Test Case 1 
If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 
8.2%. 
Test Case 2 
If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 
9.2%. 
Test Case 3 
If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%. 
Test Case 4 
If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 
10.5%.
    */

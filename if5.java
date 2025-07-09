import java.util.Scanner;
public class if5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        if(s.equals("Male")){
            if(n>=1 && n<=58){
                System.out.println("8.4%");
            }else if(n>=59 && n<=100){
                System.out.println("10.5%");
        }
    }if(s.equals("Female")){
            if(n>=1 && n<=58){
                System.out.println("8.2%");
            }else if(n>=59 && n<=100){
                System.out.println("9.2%");
            }
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

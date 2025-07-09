import java.util.Scanner;

public class forloop4 {
    public class ForLoop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=n; i!= 0;i=i/ 10) {
            int m=i%10;  
            sum+=m;         
        }
        System.out.println(sum);
    }
}
}
/*
Initialize a character variable in a program and print the initialized data type 
Test Case 1 
Print 'Alphabhet' if the initialized value is an alphabhet,  
Test Case 2 
Print 'Digit' if the initialized value is a number 
Test Case 3 
Print 'Special Character', if the initialized value is anything else. 
*/

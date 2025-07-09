import java.util.Scanner;
public class if4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char n = sc.next().charAt(0);
        if(Character.isDigit(n)){
            System.out.println("number");
        }else if(Character.isAlphabetic(n)){
            System.out.println("alphabet");
        }else{
            System.out.println("special character");
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

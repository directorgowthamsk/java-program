import java.util.Scanner;
public class if3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        int a1 = (int)a;
        int b1 = (int)b;
    if(a1 < b1){
        System.out.println((char)a1 + "," + (char)b1);
    } else {
        System.out.println((char)b1 + "," + (char)a1);
    }
    }
}
/*
Initialize two character variables in a program and display the characters in 
alphabetical order. 
Test Case 1 
If the first character is 's' and second character is 'e' then the output should be e,s 
Test Case 2 
If the first character is 'a' and second character is 'e', then the output should be a,e 
    */

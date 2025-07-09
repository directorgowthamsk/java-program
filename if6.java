import java.util.Scanner;
public class if6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(Character.isUpperCase(a)){
            System.out.println(Character.toLowerCase(a));
    }else{
        System.out.println(Character.toUpperCase(a));
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

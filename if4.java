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

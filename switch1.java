import java.util.Scanner;
public class switch1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        switch (a) {
            case 'G':
                System.out.println("Green");
                break;
            case 'R':
                System.out.println("Red");
                break;
            case 'B':
                System.out.println("Blue");
                break;
            case 'Y':
                System.out.println("Yellow");
                break;
            case 'O':
                System.out.println("Orange");
                break;
            case 'W':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid code");
                break;
        }
    }
}
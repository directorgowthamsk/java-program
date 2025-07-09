import java.util.Scanner;
public class if1 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(0<n) {
            System.out.println("Positive");
        }else if(n<0) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}

    

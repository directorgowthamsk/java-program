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

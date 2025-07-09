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
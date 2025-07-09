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

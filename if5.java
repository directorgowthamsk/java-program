import java.util.Scanner;
public class if5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        if(s.equals("Male")){
            if(n>=1 && n<=58){
                System.out.println("8.4%");
            }else if(n>=59 && n<=100){
                System.out.println("10.5%");
        }
    }if(s.equals("Female")){
            if(n>=1 && n<=58){
                System.out.println("8.2%");
            }else if(n>=59 && n<=100){
                System.out.println("9.2%");
            }
        }
}
}

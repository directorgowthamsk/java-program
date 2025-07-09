public class forloop3 {
     public static void main(String[] args){
        for (int i=10;i<99;i++) {
            int count=0;
            for (int j=2;j<i;j++) {
                if (i%j == 0) {
                    count++;
                }
            }
            if(count==0){
                System.out.print(i+" ");
            }

    }
}
}
/*
Write a program to print the prime numbers between 10 and 99. 
 
Output 
11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
     */

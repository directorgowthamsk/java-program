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
Initialize two character variables in a program and display the characters in 
alphabetical order. 
Test Case 1 
If the first character is 's' and second character is 'e' then the output should be e,s 
Test Case 2 
If the first character is 'a' and second character is 'e', then the output should be a,e
     */

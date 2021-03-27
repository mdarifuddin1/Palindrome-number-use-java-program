
package code;

import java.util.Scanner;


public class PalindromeNumber {
    
    public static void main(String[] args) {
        
        int sum =0, num,r,temp;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a any number");
        num = input.nextInt();
        
        
        temp = num;
        
        while(temp !=0)
        {
            r = temp%10;
            sum = sum *10+r;
            temp = temp/10;
        }
        if(num==sum){
            System.out.println("The number are Palindrom");
        }
        
        else
            System.out.println("The number are not palindrom");
            
    }
    
}

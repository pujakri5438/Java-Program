import java.util.*;
public class factorial{

    static int fact(int n){
        if(n==1 || n==0)
        return 1;
        else
        return n * fact(n-1);
    }

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter any number:");
         int num = sc.nextInt();
         int F = fact(num);
         System.out.printf("Factorial = "+F);
    }
}

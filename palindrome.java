import java.util.*;
import java.lang.*;
public class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k=0;
        j=n;
        while(n>0)
        {
            i=n%10;
            k=(k*10)+i;
            n=n/10;
        }
        if(j==k)
            System.out.println("palindrome");
            else
            System.out.println("not a palindrome");
        
        
}
}

/*Given an integer, check whether it is a palindrome or not.

Example 1:

Input: n = 555
Output: Yes
 */
package gfg;

public class palindrom {
    public static void main(String[] args)
    {
        int num=122;
        System.out.println(is_palindrome(num));
    }
    static String is_palindrome(int n)
    {
        int sum=0;
        int match=n;
        while(n>0)
        {
            int rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(sum==match)
        {
            return "Yes";
        }else{
            return "No";
        }
    }
}

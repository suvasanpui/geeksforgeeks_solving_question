/*Given an integer N. The task is to return the position of first set bit found from the right side in the binary representation of the number.
Note: If there is no set bit in the integer N, then return 0 from the function.  

Example 1:

Input: 
N = 18
Output: 
2
Explanation: 
Binary representation of 18 is 010010,the first set bit from the right side is at position 2. (19/09/23)*/

package gfg;
public class Bit {
    public static void main(String[] args)
    {
        int num=160;
        int res=binarybit(num);
        System.out.println(res);
    }
    static int binarybit(int num)
    {
        int count=0;
        while(num>0)
        {
            while(num%2==0)
            {
                num=num/2;
                count++;
            }
            return count+1;
        }
        return count;
    }
}

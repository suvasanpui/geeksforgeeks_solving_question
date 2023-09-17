/*Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1. */
/*Input:
N = 5
Output: 1 1 2 3 5 */
package gfg;

import java.util.Scanner;
public class Fibonacci 
{
    public static void main(String[] args)
    {
        int n=5;
        System.out.println(cal(n));
    }
    static long[] cal(int n)
    {
        long[] arr=new long[n];
        arr[0]=1;
        if(n>1) arr[1]=1;
        for(int k=2;k<n;k++)
        {
            arr[k]=arr[k-1]+arr[k-2];
        }
        return arr;
       
    }
}
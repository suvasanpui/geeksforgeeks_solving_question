
/*Given an integer N and an integer D, rotate the binary representation of the integer N by D digits to the left as well as right and return the results in their decimal representation after each of the rotation.
Note: Integer N is stored using 16 bits. i.e. 12 will be stored as 0000000000001100.

Example 1:

Input:
N = 28, D = 2
Output:
112
7
Explanation: 
28 in Binary is: 0000000000011100
Rotating left by 2 positions, it becomes 0000000001110000 = 112 (in decimal).
Rotating right by 2 positions, it becomes 0000000000000111 = 7 (in decimal)
}*/
package gfg;

import java.util.ArrayList;

public class Rotatebits
{
    public static void main(String[] args)
    {
        ArrayList arr=new ArrayList<>(16);
        int n=28;
        int d=2;
        System.out.println(rotate(n,d));
    }
    ArrayList<Integer> rotate(int N, int D)
    {
        int left=0, right=0;
        int[] arr=new int[16];
        D=D%16;
        for(int i=0;i<16;i++)
        {
            arr[i]=(N & 1)==1?1:0;
            N=N/2;
        }
        int j=0;
        int x=(16-D)%16;
        int y=D;
        while(j<16)
        {
            if(arr[x]==1)
            {
                left+=1<<j;
            }
            if((arr[y]==1))
            {
                right+=1<<j;
            }
            x=(x+1)%16;
            y=(y+1)%16;
            j++;
        }
        ArrayList<Integer> res=new ArrayList<>();
        res.add(left);
        res.add(right);
        return res;
    }
}
}

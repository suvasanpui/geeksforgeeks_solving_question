/*Geek's island has weird rules. The king of the island ordered that if the price of any item is even then, it can only be used by boys, and if the price is odd, it can only be used by girls.
A person can only buy one type of item else he/she is punished.
The gender of a person on the island  can be determined by the type of item which he/she bought.
Geek bought exactly two items, the cost of which is A and B respectively. 
Return "He" if Geek is a boy, return "She" if Geek is a girl else return "Punished" if Gender cannot be determined */
/*Input:
A = 3, B = 7
Output: 
She
Explanation: 
Both are odd. */
package gfg;

public class Wired_island {
    public static void main(String[] args)
    {
        int num1,num2;
        num1=3;
        num2=7;
        System.out.println(calculate(num1,num2));
    }
    static String calculate(int num1,int num2)
    {
        boolean res1=(num1%2==0);
        boolean res2=(num2%2==0);
        if(res1 && res2)
        {
            return "He";
        }else if(!res1 && !res2)
        {
            return "she";
        }else{
            return "punished";
        }
    }
    
}

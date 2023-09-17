/*find coomon prefix in string */
/*Input: strs = ["flower","flow","flight"]
Output: "fl" */
package gfg;

public class Common {
    public static void main(String[] args)
    {
        String[] arrs={"flower","flow","flight"};
        String val=longestCommonPrefix(arrs);
        System.out.println(val);
    }
    static String longestCommonPrefix(String[] strs) {
        String val=finding(strs);
        if(val==" ")
        {
            return "-1";
        }else{
            return val;
        }
        
    }
    static String finding(String[] strs)
    {
        String result=strs[0];
        for(int k=0;k<strs.length;k++)
        {
            result=compare(result,strs[k]);
            if(result.equals(""))
            {
                return "-1";
            }    
        }
        return result;
    }
    static String compare(String frist,String last)
    {
        int min1=Math.min(frist.length(),last.length());
        StringBuilder obj=new StringBuilder();
        for(int i=0;i<min1;i++)
        {
            if(frist.charAt(i)==last.charAt(i))
            {
                obj.append(last.charAt(i));
            }else{
                break;
            }
        }
        return obj.toString();
    }
    
}

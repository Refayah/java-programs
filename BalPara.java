import java.util.Stack;

public class BalPara {
    public static boolean func(String str)
    {
        Stack<Character> st=new Stack<>();
        for(char ch:str.toCharArray())
        {
            if(ch=='(')
            {
                st.push(ch);
            }
            else if(ch==')')
            {
                if(st.isEmpty()||st.pop()!='(')
                {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String args[])
    {
        String str1="(())";
        String str2=")())";
        System.out.println(str1+" is balanced :"+func(str1));
        System.out.println(str2+" is balanced :"+func(str2));        
    }
}

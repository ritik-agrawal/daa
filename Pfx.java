package pfx;
import java.util.*;
public class Pfx {
    static Stack<Character> st=new Stack();
    int conv(){
     char ch;
     char sym='@';
     int num=0,num1=0,re=0;
     while(!st.empty())
     {for(int i=0;i<3;i++)
     {
      if(i==0)
       {if(!Character.isDigit(st.peek()))
        {sym=st.pop();}
       }
      if(i==1)
       {if(Character.isDigit(st.peek()))
        {num=Integer.parseInt(String.valueOf(st.pop()));}
      else{num=conv();}
      }
      if(i==2)
       {if(Character.isDigit(st.peek()))
        {num1=Integer.parseInt(String.valueOf(st.pop()));}
      else{num1=conv();}
       }
      }
     switch(sym)
      {
         case '+':
             re=(num1 + num);
             break;
         
         case '-':
             re=(num1 - num);
             break;    
             
         case '*':
             re=(num1 * num);
             break;
             
         case '/':
             re=(num1 / num);
             break;    
      }
     return re;
     }
     return re;   
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Pfx oj=new Pfx();
       System.out.println("Enter the postfix expression:");
       String str=sc.next();
       for(int i=0;i<str.length();i++)
       {st.push(str.charAt(i));}
        System.out.println(oj.conv());
    }
    
}

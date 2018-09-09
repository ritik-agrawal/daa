package strmatch;
import java.util.*;
import java.lang.*;
public class Strmatch {
   static String t,p;
   static int tl,pl,i=0,j=0;
   void search(){int flg=0;
       i=0;j=0;
       while(pl!=0){
           if(i>(tl-pl+1) && flg!=1){
               System.out.println("Pattern not in Text.");
               System.exit(0);
           }
           if(t.charAt(i)==p.charAt(j)){
               flg=1;
               j++;
               pl--;
           }
           else{
               flg=0;
               j=0;
               pl=p.length();
           }
           i++;
       }
       System.out.println("Pattern in the Text");
   }
   
    public static void main(String[] args) {
        Strmatch oj=new Strmatch();
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the Text:\nI/P:");
        t=sc.nextLine();
        tl=t.length();
        System.out.printf("Enter the Pattern:\nI/P:");
        p=sc.nextLine();
        pl=p.length();
        System.out.println(tl+" "+pl);
        if(pl<tl){
            oj.search();
        }
        else if(pl==tl){
            for(i=0;i<tl;i++){System.out.printf("%c %c",t.charAt(i),p.charAt(i));
                if(t.charAt(i)!=p.charAt(i)){
                    System.out.println("Pattern not in Text");
                    System.exit(1);
                }
            }
            System.out.println("Pattern is Text");
        }
        else{
            System.out.println("pattern greater than Text");
        }
    }
}
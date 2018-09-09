package selecsort;
import java.util.*;

public class Selecsort {
    static int i,j,q[]=new int[50],temp,min,mini,l,flg=0;
    void sort(){
        for(i=0;i<l-1;i++){
            min=q[i];
            for(j=i+1;j<l;j++){
                if(min>q[j]){min=q[j];
                mini=j;
                flg=1;
                }
            }
            if(flg==1){
                swap(i,mini);
                flg=0;
              }
            for(int a=0;a<l;a++){System.out.printf("%d ",q[a]);}
            System.out.println();
        }
    }
    
    void swap(int a,int b){
        temp=q[a];
        q[a]=q[b];
        q[b]=temp;
    }
    public static void main(String[] args){
      Selecsort oj=new Selecsort();
      Scanner sc= new Scanner(System.in);
      System.out.printf("Enter the length:\nI/P:");
      l=sc.nextInt();
      System.out.printf("Enter the sting:\nI/P:");
      for(i=0;i<l;i++){q[i]=sc.nextInt();}
      oj.sort();
    }
    
}

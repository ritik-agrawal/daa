package insort;
import java.util.*;

public class Insort {
    static int i,j,m,x,u[]=new int[10];
    
    void sort(){
        m=u[0];
        for(i=1;i<6;i++){
            x=i;
            if(m<u[i]){
                m=u[i];
            }
            else{
                for(j=i-1;j>=0;j--){
                    if(u[j]>u[x]){swap(j,x--);}
                    else{break;}
                }
            }
        }
}
    
    void swap(int a,int b){int temp;
        temp=u[a];
        u[a]=u[b];
        u[b]=temp;
    }

    public static void main(String[] args) {
       Insort oj=new Insort();
       Scanner sc=new Scanner(System.in);
       System.out.printf("Enter the unsorted array:\nI/p:");
        for(i=0;i<6;i++){
            u[i]=sc.nextInt();
        }
        oj.sort();
        System.out.printf("Sorted array:\nO/p:");
        for(i=0;i<6;i++){
            System.out.printf("%d ",u[i]);
        }
    }
}
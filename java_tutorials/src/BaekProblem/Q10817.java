package BaekProblem;

import java.util.*;

class cal{

    public void calcal(int a,int b,int c){
    if((a>=b)&&(a>=c)){
        if(b>c){
        System.out.println(b);
        }
        else{
        System.out.println(c);
        }
    }
    else if((b>=a)&&(b>=c)){
        if(a>c){
        System.out.println(a);
        }
        else{
        System.out.println(c);
        }
    }
    else if((c>=a)&&(c>=b)){
        if(a>b){
        System.out.println(a);
        }
        else{
        System.out.println(b);
        }
    }
    
    
    
    }

}



public class Q10817{
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int C=sc.nextInt();
    sc.close();
    
    cal mycal=new cal();
    mycal.calcal(A,B,C);
    
    

    
    }


}

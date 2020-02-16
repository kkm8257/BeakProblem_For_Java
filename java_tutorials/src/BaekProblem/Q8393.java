package BaekProblem;

//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
//첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
//
//1부터 n까지 합을 출력한다.

import java.util.*;

public class Q8393{
    
    public static void main(String[] args){
     
    	Scanner sc=new Scanner(System.in);
        int result=0;
        int temp=sc.nextInt();
        for(int i=1;i<=temp;i++){
            result=result+i;
            
        }
        System.out.println(result);
        
    	
    }
    
}



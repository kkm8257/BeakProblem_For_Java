package BaekProblem;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//각 테스트 케이스마다 A+B를 출력한다.

//첫째 줄에 테스트 케이스의 개수 T가 주어진다.

//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)


import java.util.*;

public class Q10950{
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int caseNum=sc.nextInt();
        int temp1;
        int temp2;
        
        
        for(int i=1;i<=caseNum;i++){
            temp1=sc.nextInt();
            temp2=sc.nextInt();
            System.out.println(temp1+temp2);
          
        }
    
}
    
}



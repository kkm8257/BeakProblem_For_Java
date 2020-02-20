package BaekProblem;

import java.util.Scanner;

public class Q10809 {

	public static void main(String[] args) {
		
		
		int[] Array = new int[26];
		for(int i = 0;i<Array.length;i++) {
			
			Array[i]=-1;
		}
		
		String[] alphabet= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		Scanner sc = new Scanner(System.in);
		
		String Word=sc.next();
		
		String[] splitWord=Word.split("");
		
		for(int i = 0;i<splitWord.length;i++) {
			
			for(int j = 0;j<alphabet.length;j++) {
				
				if((splitWord[i].equals(alphabet[j]))&&(Array[j])==-1) {
					Array[j]=i;
				}
				
			}
			
			
		}
		
		for(int a=0;a<Array.length;a++) {
			System.out.print(Array[a]+" ");
		}
		
	}

}

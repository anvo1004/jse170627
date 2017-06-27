package com.hanbit.algorithm.Sequence;

import java.util.Scanner;
public class TopRanking{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);		
		System.out.print("1반의 총 학생수는 몇명?");				
		int a=s.nextInt();
		int[] arr=new int[a];
		
		for(int i=0;i<arr.length;i++){
			System.out.print(i+"번째 점수 입력하세요 : \n");
			int b=s.nextInt();
			arr[i] = b;
			if(arr[i]>arr[i]+1){}
		}
		
		
		
	}
}
		
		
	
package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class Minus{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
		System.out.print("####Minus Calc####\n");
		
		System.out.print("1 : ");
		int a=s.nextInt();
		
		System.out.print("2 : ");
		int b=s.nextInt();
		
		int c = a-b;
		System.out.print("value : " + c);
	}
}



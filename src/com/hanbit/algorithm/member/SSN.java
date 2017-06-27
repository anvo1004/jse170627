package com.hanbit.algorithm.member;

import java.util.Scanner;
public class SSN{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력\n");
		String name = sc.next();
		System.out.print("주민번호 입력\n");
		String ssn = sc.next();
		
		char ch = ssn.charAt(7);
		
		String gender = "";
		
		switch(ch){
			case '1': case '3':
			    gender = "남";
			break;
			case '2': case '4':
			    gender = "여";
			break;
			case '5': case '6':
			    gender = "외국인";
			break;
			default:
			    gender = "외계인";
				break;
		}
		
		System.out.print("*************************\n");
		System.out.print("* 이름     코드   성별  *\n");
		System.out.print("-------------------------\n");		
		System.out.print(
		       String.format("* %s |   %s |   %s   |\n",name,ch,gender));
		System.out.print("**************************\n");
	}
	
}
package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class Calc{
public static void main(String[] args){
System.out.print("##############계산기##################");

Scanner s=new Scanner(System.in);

//String name=s.next();	//next : 문자열 
//double dollar=s.nextDouble();

System.out.print("첫번째 숫자 입력 : ");
int a=s.nextInt();		//netxtInt : 정수

System.out.print("두번째 숫자 입력 : ");
int b=s.nextInt();

int c=a+b;
System.out.print("결과 :"+c);


}
}
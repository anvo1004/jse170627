package com.hanbit.algorithm.greade;

import java.util.Scanner;

public class Ranking 
{
 public static void main(String[] args) {
  
  int input;
  int[] score = new int[5];
  int[] rank = new int[5];
  
  Scanner sc = new Scanner(System.in);
  
  for(int i = 0 ; i < 5 ; i++){
   rank[i] = 1;
  }
  
  for(int i = 0 ; i < 5 ; i++){
   System.out.print("학생" + (i+1) + "의 점수 : ");
   score[i] = sc.nextInt();
  }
  
  for(int i = 0 ; i < 5 ; i++){
   for(int j = 0 ; j < 5 ; j++){
    if(score[i] < score[j])
     rank[i] = rank[i] + 1;
   }
  }
  
  for(int i = 0 ; i < 5 ; i++){
   System.out.println("학생" + (i+1) + "의 순위 : " + rank[i] + "등");
  }
 }
}



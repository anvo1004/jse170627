package com.hanbit.algorithm.matrix;

public class MrSmith{
	public static void main(String[] args){
		//int[][] mtx = new int[4][5];
		String[][] mtx = {
			{"Good Morning","Good Afternoon","Good Evening","Good bye"},
			{"Mr.","Mrs.","Miss","My"},
			{"Smith","Alex","John","James"}
		};
		System.out.print(mtx[0][3]+mtx[1][3]+mtx[2][3]);
	}
}
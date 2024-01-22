package com.edubridge.homework1;

import java.util.Scanner;

public class AssignmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);         
	float x=s.nextFloat();         
	char y=s.next().charAt(0);         
	System.out.printf("%.2f",x);         
	System.out.printf("\n%c is %d\n",y,(int)y);         	
	s.close();  
	}

}

     
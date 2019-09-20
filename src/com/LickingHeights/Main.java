package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   Scanner keyboard;
	   keyboard = new Scanner(System.in);

	   Double inch;
	   Double pound;
	   int imp;
	   System.out.println("Hello ");
	   System.out.println("Answer these questions to calculate your body mass index.");
	   System.out.println("After asnwering questions your body mass index will be calculated.");
	   System.out.println ("What is your height in inches?");
	   inch = keyboard.nextDouble();
	   System.out.println("What is your weight in pounds?");
	   pound = keyboard.nextDouble();
	   imp = 703;
	   System.out.println(" ");
	   System.out.println("Your body mass index is, ");
	   System.out.println( imp* pound/(inch*inch));
	   System.out.println("Depending on your gender the normality of this number may vary. ");
	   System.out.println("The average BMI for Women is 26.5");
	   System.out.println("The average BMI for Men is 26.6 ");








    }
}

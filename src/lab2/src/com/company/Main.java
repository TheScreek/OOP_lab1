package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    PassGen pass = new PassGen();
		Scanner scanner = new Scanner(System.in);
	    int length;
	    boolean in=false;
	    do {
	    	System.out.print("Enter length from 3 to 20: ");
	    	length = scanner.nextInt();
	    	if(length>=3 && length<=20) {
	    		in=true;
			}
			else {
				System.out.println("Wrong range. Please try again.");
			}
		}
		while(in==false);
	    String password = pass.getPass(length);
	    System.out.format("Generated password: %s", password);
    }
}
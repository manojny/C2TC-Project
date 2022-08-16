package com.cg.wapperclass;

import java.util.Scanner;

public class CharDemo {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your name:");
    String input=sc.nextLine();
    
    
    int upperCharCount=0;
    int lowerCharCount=0;
    
    if(!input.isEmpty()) {
    
    	for(char ch:input.toCharArray()) {
	if (!Character.isDigit(ch)&&Character.isAlphabetic(ch)){
		if(Character.isUpperCase(ch)) {
			upperCharCount++;
		}else {
			lowerCharCount++;
				}
	}
	}
   System.out.println("no.of upper characters in your name:" + upperCharCount); 
   System.out.println("no.of lower characters in your name:" + lowerCharCount); 
    }
sc.close();
	}	
}



package com.wordstuff;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class WordOrder {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> strList = new ArrayList<String>();
 		boolean strCheck = false;
 		String strInput;
 		 
 		do {
			System.out.println("Input characters A-Z a-z, separated by commas. I will trim whitespace and remove empty entries");
			strInput = sc.nextLine();
			System.out.println("I heard: "+strInput);
			strInput = strInput.replaceAll("\\s+",""); //remove spaces
			strInput = strInput.replaceAll("[,]+",","); //remove instances of more than one comma
			System.out.println("With spaces and dupe commas removed: "+strInput);
			
			if(strInput.matches("[A-Za-z,]+")){
				strCheck=true;
			} else {
				System.out.println("Seriously, I used input validation. Try again.");
				strInput = null;
			} //end if/else
			
		} while (strCheck==false);
 		
 		System.out.println("I heard: "+strInput);
 		System.out.println("Length is "+strInput.length());
				
		/*
		for(int y=0; y < strInput.length(); y++){
			System.out.println("At char pos. " + y + " lies character " + strInput.codePointAt(y));
		}//end for
		*/
 		
		System.out.println("now its: "+strInput);
		strList = Arrays.asList(strInput.split(","));
		System.out.println("Pre-sorted");
		
		for(int y=0; y < strList.size(); y++){
			System.out.println("pos: " + y + ", string: " + strList.get(y));	
		}
		
		Collections.sort(strList);
		
		System.out.println("Post-sorted");
		for(int y=0; y < strList.size(); y++){
			System.out.println("pos: " + y + ", string: " + strList.get(y));	
		}
		
		sc.close();
	}//end main

}//end class WordOrder

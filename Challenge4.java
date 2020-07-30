/*
Ava Harnick 
Tamid tech junior software engineer
Challenge Four
This program takes in a String and then determines if that String is a palidrome 
*/
import java.util.*;
public class Challenge4{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a word:");//Promts the user to enter a string 
		String s=input.next();
		s=s.toLowerCase();//Converts the String to lower case 
		if((isPalidrome(s))){
			System.out.println("This word is a palidrome");
		}else{
			System.out.println("This word is NOT a palidrome");
		}
	}
	public static boolean isPalidrome(String s){//Takes in a String and then determines if that String is a palidrome 
		if(s.length()==1){//If the string is one letter, it is a palidrome 
			return true;
		}
		int len=s.length();
		for(int i=0;i<len/2;i++){//Returns false if any letter is different than its corresponding letter 
			if(s.charAt(i)!=s.charAt(len-i-1)){
				return false;
			}
		}
		return true;//Returns true if it is a palidrome 
	}
}
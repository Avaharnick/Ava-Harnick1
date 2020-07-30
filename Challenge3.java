/*
Ava Harnick 
Tamid tech junior software engineer
Challenge Three 
This program takes in a list of Strings and prints them in a box
*/
public class Challenge3{
	
	public static void box(String[]arr){//Takes in a list of Strings and prints them in a box 
		int rows=arr.length;//Amount of rows the in the box
		int longest=0;//The longest String 
		for (int i=0;i<rows;i++){//Finds the longest String 
			if(arr[i].length()>longest){
				longest=arr[i].length();
			}
		}
		for(int i=0;i<longest+4;i++){//Prints the top of the box 
			System.out.print("*");
		}
			System.out.println("");
		for (int j=0;j<rows;j++){
			System.out.print("* ");//Prints the Star in the begining of each row
			System.out.printf("%-"+longest+"s", arr[j]);//Prints the String and spaces in each row 
			System.out.print(" *");//Prints the star at the end of each row 
			System.out.println("");
		}
		for(int k=0;k<longest+4;k++){//Prints the bottom of the box 
			System.out.print("*");
		}
			System.out.println("");
	}
}
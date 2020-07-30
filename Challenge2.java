/*
Ava Harnick 
Tamid tech junior software engineer
Challenge Two
This program acts as a calculator 
*/
import java.util.*;
public class Challenge2{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Would you like to calculate something? Please enter y or n");//Promts the user to enter if they want to calculate something 
		String again=input.next();
		while(!again.equals("y")&&!again.equals("n")){//Handels user error if the user does not enter y or n  
			System.out.println("Please enter y or n");
			again=input.next();
		}
		while(again.equals("y")){//If the user wants to calculate something 
			System.out.println("Please enter a number:");//Promts the user to enter a number
			float num1=getNum1();//Firsr number
			System.out.println("Please enter a second number:");//Promts the user to enter a second number 
			float num2=getNum1();//Second number 
			char operator= getOperator();
			float result=calc(num1,num2, operator);//The reult 
			if (result!=0){
				System.out.print("Your result is: "+result);
			}
			System.out.println();
			System.out.println("Would you like to calculate something? Please enter y or n");//Promts the user to enter if they want to calculate something else
			again=input.next();
			while(!again.equals("y")&&!again.equals("n")){//If the user enter's invalid input 
				System.out.println("Please enter y or n");//Promts the user to enter y or n
				again=input.next();
		}
		}	
		System.out.println("Thanks for using the calculator");
	}

	
	
	public static float getNum1(){//This method gets the numbers the user wants to preform operatoion and checks to see if they are valid 
		Scanner inputNum=new Scanner(System.in);
		String input1=inputNum.next();//The number the user entered 
		float num=0;
		boolean isNum=false;//If the user enters a valid number 
		while (isNum==false){//Loops until the user enters a valid number 
			try{//If the User enters a valid number 
				num=Float.parseFloat(input1);
				isNum=true;
			}
			catch(NumberFormatException ex){//If the user does not enter a valid number 
				System.out.println("This is not a valid number, please enter a new number:");//Promts the user to enter a valid number
				input1=inputNum.next();
			}
		}
			return num; 
	}
 	
	public static char getOperator(){//This method prompts the user to enter an operator, and then determines if it is valid 
		Scanner inputOp=new Scanner(System.in);
		System.out.println("Please enter an operator");//Prompts the user to enter an operator 
		String opinput=inputOp.next();
		char operator=opinput.charAt(0);
		boolean opVal=false;//If the char is a valid operator 
		while(opVal==false){
			if(operator=='+'&&opinput.length()==1){//If it is an additiion sign and the addition sign is the only value in the String Contains 
				opVal=true;
			}
			else if(operator=='-'&&opinput.length()==1){//If it is a subtraction sign and the subtraction sign is the only value in the String Contains 
				opVal=true;
			}
			else if(operator=='%'&&opinput.length()==1){//If it is a division sign and the division sign is the only value in the String Contains 
				opVal=true;
			}
			else if(operator=='*'&&opinput.length()==1){//If it is a multiplication sign and the multiplication sign is the only value in the String Contains 
				opVal=true;
			}
			else{//If the user enters an invalid operator 
				System.out.println("This is not a valid operator, please enter a valid operator");
		   		 opinput=inputOp.next();
		    	operator=opinput.charAt(0);
			}	
		}
		return operator; 
	}

	public static float calc(float num1,float num2, char operator){//This function preforms the calculation 
		float result=0;
		if(operator=='+'){//Preforms addition 
			result=num1+num2;
		}
		if(operator=='-'){//Preforms Subtraction 
			result=num1-num2;
		}
		if(operator=='*'){//Preforms multiplication 
			result=num1*num2;
		}
		if(operator=='%'&&num2!=0){//Preforms division 
			result=num1/num2;
		}
		if(operator=='%'&&num2==0){//If the user tries to dividie by zero 
			System.out.println("Sorry you can not divide by zero.");
		}
		return result;
	}




}
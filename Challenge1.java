/*
Ava Harnick 
Tamid tech junior software engineer
Challenge One 
This program takes two sorted Arrays and an intereger,k and returns a sorted array of the first k elememts 
Run time complexity O(n)
Space complexity O(n)
*/
import java.util.*;
public class Challenge1{
	public static int [] sortArrays(int [] arr1, int[] arr2,int k){//Takes two sorted Arrays and an intereger,k and returns a sorted array of the first k elememts
		int length=0;
		if(k>(arr1.length+arr2.length)){//Determines the length of the new combined Array 
			length=arr1.length+arr2.length;
		}else{
			length=k;
		}
		int [] combined=new int [length];//The new sorted Array of K elements 
		int i=0;//Pointer for traversing arr1 
		int j=0;//Pointer for traversing arr2 
		int counter=0;//Keeps tracks on the places in combined 
		while(i<arr1.length&&j<arr2.length&&counter<k){//While the pointer is not on the last element of each Array 
			if(arr1[i]<arr2[j]){
				combined[counter]=arr1[i];
				i++;//Moves on to the next element in arr1
			}else{
				combined[counter]=arr2[j];
				j++;//Moves to the next element in arr2 
			}
			counter++;
		} while(i<arr1.length&&counter<k){//When arr2 has been traversed, arr1 has not 
			combined[counter]=arr1[i];
			i++;
			counter++;
		}while(j<arr2.length&&counter<k){//When arr1 has been traversed, arr2 has not 
			combined[counter]=arr2[j];
			j++;
			counter++;
		}
			return combined;
}
}
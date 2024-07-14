package conditionalStatements;

import java.io.*;

public class reverseArray {

	public static void reversenArray(int arr[]){
		int[] revArr = new  int[arr.length]  ;
	
		for(int i=0; i< arr.length; i++) {
			revArr[i]= arr[arr.length-i-1];
			
		}
		System.out.println("Reversed Array:");
		for(int i:  revArr) {
			System.out.println(i+" ");	
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] orgArray= {1,2,3,4,5};
		reversenArray(orgArray);
		
			
	}

}

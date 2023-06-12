import java.lang.reflect.Array;
import java.util.Arrays;

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class copyArray{

	public static void main(String[] args) {
	int arr[] ={23,14,64,10,20};
	printarray(arr);
	changeArray(arr);
	System.out.println();
	printarray(arr);
	}
	static void  printarray(int arr[]){
	    int n=arr.length;
	    for (int i=0;i<n ;i++ ){
	        System.out.print(arr[i] + " ");
	    } 
	}
static void changeArray(int arr[]){
	   int m=arr.length;
	 int[] copiedArray =arr.clone(); 
int n=copiedArray.length;
	  
	    for (int i=0;i<n ;i++ ){
	       copiedArray[i]=0;
	    } 
	
	}
}

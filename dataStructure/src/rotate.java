package codewithisha;
import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int p=sc.nextInt();
        System.out.println("enter the array :");
    int arr[]=new int [p];
    for (int i = 0; i < p; i++) {
            arr[i]=sc.nextInt();
        }
System.out.println("enter the value of k:");
int k=sc.nextInt();

rotated(arr, k);
sc.close(); 
}

    static void  rotated(int arr[],int k){
        int n=arr.length;
        int arr1[]=new int[n];
        int j=0;
k=k%n;    
        for (int i = n-k; i <n; i++) {
            arr1[j++]=arr[i];
        }
        for (int i = 0; i < n-k; i++) {
            arr1[j++]=arr[i];
        }
        System.out.println("the rotated array is : ");
    for (int i = 0; i < arr1.length; i++) {
        System.out.print(arr1[i]+ " ");
    }}
    }




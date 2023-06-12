import java.util.*;
public class prefixSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array :");
int size=sc.nextInt();
int arr[]=new int [size];
System.out.println("enter the array : ");
for (int i = 0; i < size; i++) {
    arr[i]=sc.nextInt();
}
System.out.println(" ORIGINAL ARRAY : ");
printArray(arr);
System.out.println(" PREFIX SUM ARRAY : ");
prefix(arr);
    }
static void prefix(int arr[]){
    int n=arr.length;
    int  ans[] =new int[n];
    int k=1;
    ans[0]=arr[0];
    for (int i = 1; i <n; i++) {
        ans[k++]=arr[i-1]+arr[i];
    }
    printArray(ans); 
}
static int[] printArray(int []arr){
    int n=arr.length;
    for (int i = 0; i <n; i++) {
        System.out.print(arr[i] + " ");
    }
    return arr;
        }

}

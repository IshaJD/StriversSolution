import java.util.*;
public class sortOddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array :");
int size=sc.nextInt();
int arr[]=new int [size];
System.out.println("enter the array : ");
for (int i = 0; i < size; i++) {
    arr[i]=sc.nextInt();
}
System.out.println("original  array :");
printArray(arr);
System.out.println("sorted array : ");
EvenOdd(arr);
sc.close();
       }
       static int[] printArray(int []arr){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
            }

            static void  swap(int arr[],int i,int j){

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
                

static void EvenOdd(int arr[]){
    int n=arr.length;
    int left=0;
    int right=n-1;
    while(left<right) {
        if(arr[left]%2==1 && arr[right]%2==0)
        {swap(arr, left, right);
        left++;
        right--;
        }
        if(arr[left]%2==0){
            left++;
        }
        if(right%2!=0){
            right--;
        }
    }
    printArray(arr);
} 
}

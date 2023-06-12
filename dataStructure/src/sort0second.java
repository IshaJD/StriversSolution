import java.util.Scanner;

public class sort0second{
    public static void main(String[] args) {
        // sorted using two pointers to reduce time complexity
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array :");
int size=sc.nextInt();
int arr[]=new int [size];
System.out.println("enter the array : ");
for (int i = 0; i < arr.length; i++) {
    arr[i]=sc.nextInt();
}
System.out.println("original array : ");
printArray(arr);
System.out.println("sorted array : ");
sortTwoPointer(arr);
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
            static void sortTwoPointer(int arr[]){
            int n=arr.length;
            int left=0;
            int right=n-1;
while(left<right){
    if(arr[left]==1 && arr[right]==0)
    {swap(arr,left,right);
    left++;
    right--;
    }
    if(arr[left]==0){
        left++;
    }
    if(arr[right]==1){
        right--;
    }
}printArray(arr);
        }
}

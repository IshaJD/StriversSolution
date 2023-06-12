import java.util.*;
public class squareArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array :");
int size=sc.nextInt();
int arr[]=new int [size];
System.out.println("enter the array : ");
for (int i = 0; i <size; i++) {
    arr[i]=sc.nextInt();
}
System.out.println(" ORIGINAL ARRAY :");
printArray(arr);
System.out.println(" RESULTANT ARRAY :  ");
Square(arr);

    }

    static int[] printArray(int []arr){
        int n=arr.length;
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
            }
static void Square(int arr[]){
    int n=arr.length;
    int left=0;
    int right=n-1;
    int ans[]=new int [n];
    int k=n-1;
while(left<=right){
    if(Math.abs(arr[left])>Math.abs(arr[right])){
    ans[k--]=arr[left]*arr[left];
    left++;
    }
    else{
        ans[k--]=arr[right]*arr[right];
        right--;
    }
    }
printArray(ans);
}
}

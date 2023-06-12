import java.util.*;
public class rangeAdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array :");
int size=sc.nextInt();
int arr[]=new int [size+1];
System.out.println("enter the array : ");

for (int i = 0; i <=size; i++) {
    arr[i]=sc.nextInt();
}
System.out.println("enter the number of queries : ");
int q=sc.nextInt();
int[] prefixSum=prefix(arr);

int ans=0;
while(q-- >0 ){
    System.out.println("enter the range : ");
    int l=sc.nextInt();
    int r=sc.nextInt();
 ans=prefixSum[r]-prefixSum[l-1];

}
System.out.println(" SUM= "+ ans);
    }
  
    static int[] prefix(int arr[]){
        int n=arr.length;
        for (int i = 1; i <n; i++) {
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    }


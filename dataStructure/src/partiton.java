import java.util.*;
public class partiton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array :");
int size=sc.nextInt();
int arr[]=new int [size];
System.out.println("enter the array : ");
for (int i = 0; i < arr.length; i++) {
    arr[i]=sc.nextInt();
}
System.out.println(" partition possible : " + partition(arr));

    }
static int Arraysum(int arr[]){
    int sum=0;
    int n=arr.length;
    for (int i = 0; i < arr.length; i++) {
        sum+=arr[i];
    }
    return sum;
}
static boolean partition(int arr[]){
    int n=arr.length;
    int totalSum=Arraysum(arr);
    int prefixsum=0;

    for (int i = 0; i < arr.length; i++) {
    prefixsum +=arr[i];
        int suffixsum=totalSum-prefixsum;    
        if(prefixsum==suffixsum)
        return true;

    }
return false;
}
}

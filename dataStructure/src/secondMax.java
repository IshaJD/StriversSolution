import java.util.Scanner;

public class secondMax {
    public static void main(String[] args) {
        
        int arr[]=new int [5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
System.out.println("the first max element is = "+ firstMax(arr));
System.out.println("the second max element is = " + second(arr));
sc.close();
            }






 static int firstMax(int arr[]) {

    int mx=Integer.MIN_VALUE;
int n=arr.length;
    for (int i = 0; i <n; i++) {
        if(arr[i]>mx){
            mx=arr[i];
        }
}
return mx;
}

static int second(int arr[]){
int mx=firstMax(arr);
for (int i = 0; i < arr.length; i++) {
    if(arr[i]==mx){
        arr[i]=Integer.MIN_VALUE;

    }
}
int second=firstMax(arr);
return second;
}

}

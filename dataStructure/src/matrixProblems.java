
import java.util.Scanner;

public class matrixProblems {
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the row and column of input matrix: ");
 int n=sc.nextInt();
 int m=sc.nextInt();
 int [][] arr=new int [n][m]; 
 System.out.println(" enter the matrix : ");
 for (int i = 0; i <n; i++) {
    for (int j = 0; j <m; j++) {
       arr[i][j] =sc.nextInt();
    }
 }  
 System.out.println(" original matrix : ");
 PrintMatrix(arr, n, m);
 /*System.out.println(" for addition : ");
add(arr, arr, n, m);
*/
Tranpose(arr, n, m);
System.out.println(" rotated matrix : ");
Rotate(arr, n, m);
}
static void PrintMatrix(int arr[][],int n,int m){
    for (int i = 0; i <n; i++) {
        for (int j = 0; j <m; j++) {
       System.out.print(arr[i][j] + " ");
        }
    System.out.println();}      
}
static void add(int arr[][],int b[][],int n,int m){
    int ans[][]=new int [n][m];
    for (int i = 0; i <n; i++) {
        for (int j = 0; j <m; j++) {
        
            ans[i][j]=arr[i][j]+b[i][j];
        
        }}
        System.out.println(" additon of matrix : ");
        PrintMatrix(ans, n, m);
}
static void  Tranpose(int arr[][],int n,int m){
    for (int i = 0; i <n; i++) {
        for (int j = i; j <m; j++) {
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
        
        }}    
       /* System.out.println(" tranpose :");
        PrintMatrix(arr, n, m);*/
}
static void Rotate(int arr[][],int n,int m){
    Tranpose(arr, n, m);
for (int i = 0; i <n; i++) {
reverse(arr[i]);

}
PrintMatrix(arr, n, m);
}
static int [] reverse(int arr[]){
    int i=0;
    int j=arr.length-1;
    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
i++;
j--;
    }
    return arr;
}
}

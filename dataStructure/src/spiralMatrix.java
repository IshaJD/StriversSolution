import java.util.*;
public class spiralMatrix {

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
System.out.println(" spiral couting is : ");
spiral(arr, n, m); 
    }
static void spiral(int arr[][],int n,int m){
    int toprow=0,leftcol=0,bottomrow=n-1,rightcol=m-1;
int totalCount=0;
while(totalCount< n*m){
//toprow->leftcol-rightcol
    for (int i = leftcol; i <=rightcol && totalCount< n*m; i++) {
    System.out.print(arr[toprow][i]+ " ");
        totalCount++;
    }
    toprow++;
    //rightcol->toprow->bottomrow
for (int i =toprow; i <=bottomrow && totalCount<n*m; i++) {
    System.out.print(arr[i][rightcol] + " ");
    totalCount++;
}
rightcol--;

////bottomrow->rightcol->leftcol
for (int i =rightcol; i >=leftcol && totalCount<n*m; i--) {
    System.out.print(arr[bottomrow][i] + " ");
    totalCount++;
}
bottomrow--;
//leftcol->bottomrow->toprow
for (int i =bottomrow; i >=toprow && totalCount<n*m; i--) {
    System.out.print(arr[i][leftcol] + " ");
    totalCount++;

}
leftcol++;
}

}
}

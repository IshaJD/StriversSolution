import java.util.Scanner;

public class COUNTmATRIX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the value upto whose square u want matrix : ");
        int n=sc.nextInt();
              int matrix[][]=countingMatrix(n) ;
              PrintMatrix(matrix, n, n);

    }
    static int[][]  countingMatrix(int n){
        
int arr[][]=new int [n][n];
 
        int toprow=0,leftcol=0,bottomrow=n-1,rightcol=n-1;
        int current =1;
        while(current<=n*n){
        //toprow->leftcol-rightcol
            for (int i = leftcol; i <=rightcol && current< n*n; i++) {
            arr[toprow][i]=current;
                current++;
            }
            toprow++;
            //rightcol->toprow->bottomrow
        for (int i =toprow; i <=bottomrow && current<n*n; i++) {
            arr[i][rightcol]=current;
            current++;
        }
        rightcol--;
        
        ////bottomrow->rightcol->leftcol
        for (int i =rightcol; i >=leftcol && current<n*n; i--) {
        arr[bottomrow][i]=current;
            current++;
        }
        bottomrow--;
        //leftcol->bottomrow->toprow
        for (int i =bottomrow; i >=toprow && current<n*n; i--) {
            arr[i][leftcol]=current;
            current++;
        
        }
        leftcol++;
        }
      
        return arr;     
    }
    static void PrintMatrix(int arr[][],int n,int m){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
           System.out.print(arr[i][j] + " ");
            }
        System.out.println();}      
    }
    
}

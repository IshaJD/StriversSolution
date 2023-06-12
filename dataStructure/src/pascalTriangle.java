import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[][]=new int [4][4];
    System.out.println("enter the matrix ");
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            a[i][j]=sc.nextInt();
        }
    }    
    for (int i = 1; i <=4; i++) {
        for (int j = 1; j <=4; j++) {
        a[i][j]=a[i-1][j-1]+ a[i-1][j];
    }}
    
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < 4; j++) {
        System.out.print(a[i][j] + " ");
    }
System.out.println();
}
    sc.close();
    }
    
}

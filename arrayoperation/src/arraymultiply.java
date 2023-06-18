import java.util.Scanner;

public class arraymultiply {
    public static void main(String[] args) throws Exception {
        
    /*     System.out.println("enter the size of array");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arrr[]=new int[5];
        System.out.println("enter the array of elements ");
        for (int i = 0; i < n; i++) {
            arrr[i]=s.nextInt();
        }
        System.out.println("the elements of array are");
        for (int j = 0; j < n; j++) {
            System.out.println(arrr[j]);
        }*/
int a[][]=new int [3][3];
int b[][]=new int [3][3];
int c[][]=new int [3][3];
Scanner s=new Scanner(System.in);
System.out.println("enter the matrix 1");
for (int i = 0; i < a.length; i++) {
    for (int j = 0; j < a.length; j++) {

        a[i][j]=s.nextInt();
    }
}

System.out.println("enter the matrix 2");
for (int i = 0; i < b.length; i++) {
    for (int j = 0; j < b.length; j++) {

        b[i][j]=s.nextInt();
    }
}
for (int i = 0; i < c.length; i++) {
    for (int j = 0; j < c.length; j++) {

    c[i][j]=a[i][j]+b[i][j];
    }
}

for (int i = 0; i < c.length; i++) {
    for (int j = 0; j < c.length; j++) {
    System.out.print(" "  + c[i][j]+ " "  );
    }
    System.out.println();
}
s.close();

    }
}

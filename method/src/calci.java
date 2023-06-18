import java.util.Scanner;

public class calci {
    public static void main(String[] args) throws Exception {


        //methods 
        System.out.println("_________________________________________________");
        Scanner s=new Scanner(System.in);
        System.out.println("WELCOE TO THE CALCULATOR");
System.out.println("CHOOSE THE OPERATION YOU WANT TO PERFORM:");

System.out.println("press 11  to select these options");
System.out.println("_________________________________________________");

System.out.println(" 1) ADDTION");
System.out.println(" 2) SUBTRACTION");
System.out.println(" 3) MULTIPLICATION");
System.out.println(" 4) DIVISION");
System.out.println(" 5) MODULUS");

System.out.println("press 12 to select these options");
System.out.println("_________________________________________________");
System.out.println(" 6) FACTORIAL");
System.out.println(" 7) POWER");
System.out.println(" 8) SQUARE ROOT");
System.out.println("press 13 to select this");
System.out.println("_________________________________________________");
System.out.println(" 9) ROOTS OF QUADRATIC EQUATION");
System.out.println("ENTER YOUR CHOICE:");

int ch=s.nextInt();
if((ch==11))
{
System.out.println("CHOOSE THE OPTIONS:");
System.out.println(" 1) ADDTION");
System.out.println(" 2) SUBTRACTION");
System.out.println(" 3) MULTIPLICATION");
System.out.println(" 4) DIVISION");
System.out.println(" 5) MODULUS");

System.out.println("ENTER TWO NUMBERS:");
int a=s.nextInt();
int b=s.nextInt();

System.out.println("ENTER YOUR CHOICE:");
int c=s.nextInt();
switch(c){
    case 1: add(a,b);
    break;
case 2: subtract(a,b);
break;
case 3: multiply(a,b);
break;
case 4: divide(a,b);
break;
case 5: mod(a,b);
break;
    default: System.out.println("INVALID CHOICE");
}    
}
    else if(ch==12){
    System.out.println("CHOOSE YOUR OPTION:");
    System.out.println(" 6) FACTORIAL");
    System.out.println(" 7) POWER");
    System.out.println(" 8) SQUARE ROOT");
   
    System.out.println("ENTER YOUR CHOICE:");
    int v=s.nextInt();
    System.out.println("ENTER THE NUMBER:");
    int p=s.nextInt();
    switch(v){
        case 6: fact(p);
        break;
    case 7: power(p);
    break;
    case 8: squareroot(p);
    break;
    default: System.out.println("INVALID CHOICE");       
   s.close();    
}
}
else if(ch==13)
{
    System.out.println("ENTER THE VALUES OF A,B,C:");
    double a=s.nextDouble();
    double b=s.nextDouble();
    double c=s.nextDouble();
       double z=((b*b)-(4*a*c));
       double e1=(-b+ squareroot(z))/(2*a);
       double e2=(-b-squareroot(z))/(2*a);

       if(z<0)
System.out.println("ROOTS ARE IMAGINARY");
else{
System.out.println("ROOTS ARE:");
System.out.println(e1);
System.out.println(e2);

}
    }
else{
    System.out.println("INVALID CHOICE");
 }
}
    
public static int add(int x,int y) {
int z;
     z=x+y;
System.out.println(z);
return z;
}
    public static int subtract(int x,int y) {
        int z;
             z=x-y;
        System.out.println(z);
        return z;
    }
        public static int multiply(int x,int y) {
            int z;
                 z=x*y;
            System.out.println(z);
            return z;
            
}
public static int divide(int x,int y) {
    int z;
         z=x/y;
    System.out.println(z);
    return z;
}
public static int mod(int x,int y) {
    int z;
         z=x%y;
    System.out.println(z);
    return z;
    
}

    public static int fact(int x) {
        int multi=1;
            while(x>1){
                multi=multi*x;
                x--;
            }        System.out.println(multi);
        return multi;
        }

        public static double power(double x) {
            double z,i;
System.out.println("ENTER THE POWER:");
try (Scanner sc = new Scanner(System.in)) {
    i=sc.nextInt();
}
z=Math.pow(x, i);
            System.out.println(z);
            return z;
            
            }

            public static double squareroot(double x){
                double z;
                z=Math.pow(x, 0.5d);
                System.out.println(z);
                return z;
                
            }
                }
                

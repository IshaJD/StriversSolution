import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        
                        System.out.println("TOWER OG HANOI ");
                        Scanner sc=new Scanner(System.in);
                        System.out.println("ENTER THE NUMBER OF DISKS: ");
                        int n=sc.nextInt();
                        TOH(n, 1, 2, 3);
                    }
                    static void TOH(int n,int a,int b,int c ){
                        if(n>0){
                            TOH(n-1, a, b, c);
                            System.out.println("MOVING DISK --- FROM " + a + " TO -> " + c+ " USING " +b);
                            TOH(n-1, b, a, c);
                        }
                        
                    }
                
                
        }
        


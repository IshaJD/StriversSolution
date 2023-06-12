public class taylor1 {
    public static void main(String[] args) {
        System.out.println("****************");
        System.out.println("ANS = " + taylorSeries(2, 3));
    }
    static int taylorSeries(int x,int n){
        int s=1;
        if(n==0)
        return 1;
        else
        s=(1+x/n)*s;
        return taylorSeries(x, n-1);
    }
}

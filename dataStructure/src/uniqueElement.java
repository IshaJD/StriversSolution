public class uniqueElement {
    public static void main(String[] args) {


        int arr[]={1,2,3,4,2,4,5,1,3};
        int count=-1;
    
        int n=arr.length;
        for (int i = 0; i <n; i++) {
        for (int j = i+1; j < n; j++) {
        if(arr[i]==arr[j]){
        arr[i]=-1;
        arr[j]=-1;
        }    
            }    }
            for (int i = 0; i <n; i++) {

                    if(arr[i]>0)
                    count=arr[i];
                }
 
System.out.println("  unique element =" + count);
    }
}


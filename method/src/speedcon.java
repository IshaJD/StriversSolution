public class speedcon {
    public static void main(String[] args) throws Exception {

double kilometer;
kilometer= toMeter(18);
System.out.println("    the value in meter per second    " + kilometer);

double kilobyte;
kilobyte=megaByte(10078);
System.out.println("energy in megabytes is " + kilobyte);




    }    
    public static double toMeter(double kilometer) {
        return ((kilometer*5)/18);
        
        }
public static double megaByte(double kilobyte) {
    return (kilobyte/1024);
}





        
}

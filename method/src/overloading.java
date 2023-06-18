public class overloading {
    public static void main(String[] args) throws Exception {
        calculatefeetandInchesTocm(0,1);
calculatefeetandInchesTocm(6);

    }

public  static double calculatefeetandInchesTocm(double feet,double inches) {
    if((feet<0)||(inches<0 || inches>12)){
        System.out.println("invalid parameters");
        return -1;
    }
else{
    double cm= (feet*12)*2.54;
    cm=cm+(inches*2.54);
System.out.println(feet + " feet " + inches +" inches"+ cm + " centimeters ");
return cm;
}
}


public  static double calculatefeetandInchesTocm(double inches) {
if(inches<=0){
    return -1;}
    else{
double feets= inches*12;
System.out.println("the feets is " + feets);
return feets;
    }
}


}

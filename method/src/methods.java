

public class methods {
    public static void main(String[] args) throws Exception {

        System.out.println(getDurationString(65,45));




    }
    public static String getDurationString(long minutes,long seconds) {
        if(minutes<=0){
            return "invalid value";
}
else if(minutes <0 || seconds<=0|| seconds>=59){
return "invalid value";
}
else{
    long hours= minutes/60;
long remainingminutes= minutes%60;
    return hours + "h " + remainingminutes + "m " + seconds + "s ";
}
    }
    public static String getDurationString(long seconds){
        if(seconds<=0){
            System.out.println("invalid value");
        }
        long minutes=seconds/60;
        
    return getDurationString(minutes, seconds);
    }
}

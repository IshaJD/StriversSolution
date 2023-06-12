public class strings {
    public static void main(String[] args) {
   /*      String bulletIt= "PRINT BULLETED POINTS \n" + "\u2022 FIRST POINT \n " + " \u2022 SECOND POINT ";
        System.out.println(bulletIt);
        System.out.println("my name is isha\n i am doing btech");
        String textblock= """
                print a bulleted list 
                    """;
                System.out.println(textblock);*/
                int age=45;
                System.out.printf("your age is %d\n", age);
                System.out.printf("your age is %f\n", (float)age);
                System.out.printf("your age is %.2f\n",(float) age);
                int dOB=2023-age;
                System.out.printf("your age = %d \n your date of birth = %d\n", age,dOB);
                for (int i = 1; i <= 100000; i*=10) {
                    System.out.printf("printing  %6d %n", i);
                }
                String format="your age is %d" .formatted(age);
                System.out.println(format);
    }
}

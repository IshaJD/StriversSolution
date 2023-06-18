

public class constructor {
    public static void main(String[] args) throws Exception {
Bankaccount b= new Bankaccount();
b.setnumber("12345");
b.setbalance(5.99);
b.setcustomerEmailAddress("abc@gmail.coom");
b.setcustomerName("isha");

b.deposit(50.00);
System.out.println("the number is " + "b.getnumber()");
System.out.println("the balance is " + "b.getbalance()");


    }}    

    class Bankaccount{
        private String number;
        private String customerName;
        private double balance;
        private String customerEmailAddress;
        
    
        public void setnumber(String number){
            this.number=number;
        } 
        public String getnumber(){
            return number;
        }
        public void setcustomerName(String customerName){
            this.customerName=customerName;
        }
        public String getcustomerName(){
            return customerName;
        }
        
        public void setbalance(double balance){
            this.balance=balance;
        }
        public double getbalance(){
            return balance;
        }
        public void setcustomerEmailAddress(String customerEmailAddress){
        
            this.customerEmailAddress=customerEmailAddress;
        }
        public String getcustomerEmailAddress(){
            return customerEmailAddress;
        }
        public String getcustomerPhoneNumber(String customerPhoneNumber){
            return customerPhoneNumber;
        }
        public void  deposit(double depositAmount) {
            this.balance+=depositAmount;
            System.out.println("the deposited amount is " + depositAmount);
        }
        public void withdrawl(double withdrawlAmount) {
            if(balance-withdrawlAmount<=0){
                System.out.println("only " + balance + "is available");
            }
            else{
                this.balance-=withdrawlAmount;
                System.out.println("withdrawl of " + withdrawlAmount +"is done " + balance + "is available balance");
            }
        }
        
        
        
        }
            
            
        

    

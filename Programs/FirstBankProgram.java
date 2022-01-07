public class FirstBankProgram {
    static double balance = 1000.234;
    static void deposit(double amount){
       balance = balance + amount;
    }
    static void withdraw(double amount){
    balance=balance-amount;
    }
 public static void main(String[] args){
    deposit(23.5);
    withdraw(123.5);
    System.out.println(balance);
 }
}

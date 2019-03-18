


public class Accounts {
    private double balance;
    private String owner;

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
       Account bartosAccount = new Account("Barto's account",100.00);
    

System.out.println("Initial state");
System.out.println(bartosAccount);


bartosAccount.deposit(20);


System.out.println("Final state");
System.out.println(bartosAccount);

    }
}



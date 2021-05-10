
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matthewsAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);
        matthewsAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(myAccount.toString());
        System.out.println(matthewsAccount.toString());
        

    }
}

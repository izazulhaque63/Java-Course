package challenge78;

public class coustemer {
    public static void main(String[] args) {
    bankAccount account = new bankAccount("001","izaul");
    account.depositMoney(100);
    System.out.println(account.widthrawMoney(200));
     account.depositMoney(-40);
    System.out.println(account.widthrawMoney(0));
    }
}

package oop2.com.atguigu01._this.exer2;

/**
 * ClassName: BankTest
 * Description:
 *
 * @Author ÉĞ¹è¹È-ËÎºì¿µ
 * @Create 14:35
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("²Ù","²Ü");
        bank.addCustomer("±¸","Áõ");

        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(0).getAccount().withdraw(50);

        System.out.println("ÕË»§Óà¶îÎª£º" + bank.getCustomer(0).getAccount().getBalance());
    }
}

package oop2.com.atguigu01._this.exer2;

/**
 * ClassName: BankTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 14:35
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("��","��");
        bank.addCustomer("��","��");

        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(0).getAccount().withdraw(50);

        System.out.println("�˻����Ϊ��" + bank.getCustomer(0).getAccount().getBalance());
    }
}

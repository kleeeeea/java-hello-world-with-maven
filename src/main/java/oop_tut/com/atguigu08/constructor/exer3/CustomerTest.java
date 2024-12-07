package oop_tut.com.atguigu08.constructor.exer3;

/**
 * ClassName: CustomerTest
 * Description:
 *      ��1������һ��Customer �����ֽ� Jane Smith, ����һ���˺�Ϊ1000�����Ϊ2000Ԫ��������Ϊ 1.23�� ���˻���
 *      ��2����Jane Smith������
 *          ���� 100 Ԫ����ȡ��960Ԫ����ȡ��2000Ԫ��
 *          ��ӡ��Jane Smith �Ļ�����Ϣ��
 * @Author �й��-�κ쿵
 * @Create 9:04
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        //����Customerʵ��
        Customer customer = new Customer("Jane","Smith");

//        Account account = new Account(1000,2000,0.0123);
//        customer.setAccount(account);
        //��
        customer.setAccount(new Account(1000,2000,0.0123));



        //����ڿͻ����˻�����ȡǮ����Ǯ�Ĳ���
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        //����ͻ���Ϣ
        //Customer [Smith, Jane] has a account: id is 1000,
        // annualInterestRate is 1.23��, balance is 1140.0
        System.out.println("Customer [" + customer.getLastName() + "," + customer.getFirstName() +
                "] has a account:id is " + customer.getAccount().getId() + ",annualInterestRate is " +
                customer.getAccount().getAnnualInterestRate()*100 + "%,balance is " +
                customer.getAccount().getBalance());


        /*
         * ������������
         *
         * 1. ������������ֻ�ܱ�����һ��
         * 2. �������󳣳���Ϊʵ�δ��ݸ��������βΡ�
         * */
        new Account(1001,2000,0.0123).withdraw(1000);
        System.out.println(new Account(1001, 2000, 0.0123).getBalance());

        int num = 10;


    }
}

package oop2.com.atguigu05._super.exer3;

/**
 * ClassName: AccountTest
 * Description:
 *  дһ���û��������Account�ࡣ���û������У�����һ���˺�Ϊ1122�����Ϊ20000��������4.5%��Account����
 *  ʹ��withdraw�������30000Ԫ������ӡ��
 *  ��ʹ��withdraw�������2500Ԫ��ʹ��deposit�������3000Ԫ��Ȼ���ӡ���������ʡ�
 * @Author �й��-�κ쿵
 * @Create 14:32
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {

        Account acct = new Account(1122,20000,0.045);

        acct.withdraw(30000);
        System.out.println("�����˻����Ϊ��" + acct.getBalance());

        acct.withdraw(2500);
        acct.deposit(3000);
        System.out.println("�����˻����Ϊ��" + acct.getBalance());

        System.out.println("������Ϊ��" + acct.getMonthlyInterest());

    }
}

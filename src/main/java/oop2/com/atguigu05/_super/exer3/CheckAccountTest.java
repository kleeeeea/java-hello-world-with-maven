package oop2.com.atguigu05._super.exer3;

/**
 * ClassName: CheckAccountTest
 * Description:
 *      дһ���û��������CheckAccount�ࡣ
 *      ���û������У�����һ���˺�Ϊ1122�����Ϊ20000��������4.5%����͸֧�޶�Ϊ5000Ԫ��CheckAccount����
 *
 *       ʹ��withdraw�������5000Ԫ������ӡ�˻����Ϳ�͸֧�
 *       ��ʹ��withdraw�������18000Ԫ������ӡ�˻����Ϳ�͸֧�
 *       ��ʹ��withdraw�������3000Ԫ������ӡ�˻����Ϳ�͸֧�
 * @Author �й��-�κ쿵
 * @Create 14:49
 * @Version 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {

        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);

        checkAccount.withdraw(5000);
        System.out.println("�����˻���" + checkAccount.getBalance());
        System.out.println("���Ŀ�͸֧�" + checkAccount.getOverdraft());

        checkAccount.withdraw(18000);
        System.out.println("�����˻���" + checkAccount.getBalance());
        System.out.println("���Ŀ�͸֧�" + checkAccount.getOverdraft());

        checkAccount.withdraw(3000);
        System.out.println("�����˻���" + checkAccount.getBalance());
        System.out.println("���Ŀ�͸֧�" + checkAccount.getOverdraft());
    }
}

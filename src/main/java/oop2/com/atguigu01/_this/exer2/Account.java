package oop2.com.atguigu01._this.exer2;

/**
 * ClassName: Account
 * Description:
 *      �˻���
 * @Author �й��-�κ쿵
 * @Create 14:22
 * @Version 1.0
 */
public class Account {
    private double balance;//���

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    //��Ǯ
    public void deposit(double amt){
        if(amt > 0){
            balance += amt;
            System.out.println("�ɹ����룺" + amt);
        }
    }

    //ȡǮ
    public void withdraw(double amt){
        if(balance >= amt && amt > 0){
            balance -= amt;
            System.out.println("�ɹ�ȡ����" + amt);
        }else{
            System.out.println("ȡ���������������");
        }
    }
}

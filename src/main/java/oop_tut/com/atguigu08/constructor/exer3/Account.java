package oop_tut.com.atguigu08.constructor.exer3;

/**
 * ClassName: Account
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 8:52
 * @Version 1.0
 */
public class Account {
    private int id;//�˺�
    private double balance; //���
    private double annualInterestRate;//������

    public Account(int i, double b, double a) {
        id = i;
        balance = b;
        annualInterestRate = a;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double a) {
        annualInterestRate = a;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    //ȡǮ
    public void withdraw(double amount){
        if(amount <= balance && amount > 0){
            balance -= amount;
            System.out.println("�ɹ�ȡ����" + amount);
        }else{
            System.out.println("���㣬ȡ��ʧ��");
        }

    }
    //���
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("�ɹ����룺" + amount);
        }
    }


}

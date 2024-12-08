package oop2.com.atguigu05._super.exer3;

/**
 * ClassName: Account
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 14:28
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;//������

//    public Account(){}

    public Account(int id, double balance, double annualInterestRate) {
//        super();
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * ��ȡ������
     * @return
     */
    public double getMonthlyInterest(){
        return annualInterestRate / 12;
    }

    /**
     * ȡǮ����
     * @param amount  Ҫȡ��Ǯ��
     */
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("���㣡");
        }
    }

    /**
     * ��Ǯ����
     * @param amount  Ҫ��Ķ��
     */
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }
}

package oop2.com.atguigu05._super.exer3;

/**
 * ClassName: CheckAccount
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 14:35
 * @Version 1.0
 */
public class CheckAccount extends Account{
    private double overdraft;//��͸֧�޶�

    public CheckAccount(int id, double balance, double annualInterestRate){
        super(id,balance,annualInterestRate);
    }

    public CheckAccount(int id, double balance, double annualInterestRate,double overdraft){
        super(id,balance,annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    /**
     * ����ڿ�͸֧���˻���ȡǮ�Ĳ���
     * @param amount  Ҫȡ��Ǯ��
     */
    public void withdraw(double amount){
        if(getBalance() >= amount){
            //����ģ�
//            getBalance() = getBalance() - amount;
            //��ȷ��
            super.withdraw(amount);
        }else if(getBalance() + overdraft >= amount){
            overdraft -= amount - getBalance();
            super.withdraw(getBalance());
        }else{
            System.out.println("������͸֧�޶�");
        }
    }
}

package oop2.com.atguigu01._this.exer2;

/**
 * ClassName: Bank
 * Description:
 *      ������
 * @Author �й��-�κ쿵
 * @Create 14:32
 * @Version 1.0
 */
public class Bank {
    private Customer[] customers;//���ڱ������ͻ�
    private int numberOfCustomer;//���ڼ�¼�洢�Ŀͻ��ĸ���

    public Bank(){
        customers = new Customer[10];
    }

    /**
     * ��ָ�������Ŀͻ����������еĿͻ��б���
     * @param f
     * @param l
     */
    public void addCustomer(String f,String l){
        Customer cust = new Customer(f,l);
//        customers[numberOfCustomer] = cust;
//        numberOfCustomer++;
        //��
        customers[numberOfCustomer++] = cust;
    }

    /**
     * ��ȡ�ͻ��б��д洢�Ŀͻ��ĸ���
     * @return
     */
    public int getNumOfCustomers(){
        return numberOfCustomer;
    }

    /**
     * ��ȡָ������λ���ϵĿͻ�
     * @param index
     * @return
     */
    public Customer getCustomer(int index){
        if(index < 0 || index >= numberOfCustomer){
            return null;
        }

        return customers[index];

    }
}

package oop_tut.com.atguigu01.oop;

/**
 * @author �й��-�κ쿵
 * @create 16:29
 */
public class PhoneTest { //��Phone��Ĳ�����
    public static void main(String[] args) {


        //��ϰ���������� ������ = ����ֵ
//        Scanner scann = new Scanner(System.in);

        //����Phone�Ķ���
        Phone p1 = new Phone();

        //ͨ��Phone�Ķ��󣬵������ڲ����������Ի򷽷�
        //��ʽ��"����.����" �� "����.����"
        p1.name = "huawei mate50";
        p1.price = 6999;

        System.out.println("name = " + p1.name + ", price = " + p1.price);

        //���÷���
        p1.call();
        p1.sendMessage("���ڹ���ֹ����");
        p1.playGame();
    }
}

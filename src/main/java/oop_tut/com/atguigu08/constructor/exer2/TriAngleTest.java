package oop_tut.com.atguigu08.constructor.exer2;

/**
 * ClassName: TriAngleTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 16:52
 * @Version 1.0
 */
public class TriAngleTest {
    public static void main(String[] args) {
        //����TriAngle��ʵ��1
        TriAngle t1 = new TriAngle();

        t1.setHeight(2.3);
        t1.setBase(3.4);

        System.out.println("���Ϊ��" + t1.findArea());

        //����TriAngle��ʵ��2
        TriAngle t2 = new TriAngle(2.4,4.5);

        System.out.println("�ױ߳�Ϊ��" + t2.getBase());
        System.out.println("��Ϊ��" + t2.getHeight());
        System.out.println("���Ϊ��" + t2.findArea());
    }
}

package oop2.com.atguigu07.object.tostring.exer;

/**
 * ClassName: CircleTest
 * Description:
 *      дһ�������࣬��������Circle�����ж�����ɫ�Ƿ���ȣ�����equals�����ж���뾶�Ƿ���ȣ�
 *      ����toString()���������뾶��
 * @Author �й��-�κ쿵
 * @Create 11:47
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle(2.3);

        Circle c2 = new Circle("red",2.0,3.4);

        System.out.println("��ɫ�Ƿ���ȣ�" + c1.getColor().equals(c2.getColor()));

        System.out.println("�뾶�Ƿ���ȣ�" + c1.equals(c2));

        System.out.println(c1);
        System.out.println(c1.toString());
    }
}

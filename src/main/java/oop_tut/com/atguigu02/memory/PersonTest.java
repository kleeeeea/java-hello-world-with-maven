package oop_tut.com.atguigu02.memory;

/**
 * Perosn���Ӧ�Ĳ�����
 *
 * @author �й��-�κ쿵
 * @create 14:38
 */
public class PersonTest {
    public static void main(String[] args) {

        //�����������ʵ����
        Person p1 = new Person();

        //ͨ������������Ի򷽷�
        p1.name = "�ܿ�";
        p1.age = 24;
        p1.gender = 'a';

        System.out.println("name = " + p1.name + ",age = " + p1.age +
                ", gender = " + p1.gender);

        p1.eat();
        p1.sleep(8);
        p1.interests("����");

        //�ٴ���Person���һ��ʵ��
        Person p2 = new Person();
        p2.name = "¶˿";
        p2.age = 18;
        p2.gender = 'a';


        System.out.println("name = " + p2.name + ",age = " + p2.age +
                ", gender = " + p2.gender);

        System.out.println("name = " + p1.name + ",age = " + p1.age +
                ", gender = " + p1.gender);

    }
}

package oop_tut.com.atguigu03.field_method.field;

/**
 * @author �й��-�κ쿵
 * @create 20:07
 */
public class FieldTest {
    public static void main(String[] args) {

        Person p1 = new Person();

        System.out.println(p1.name + "," + p1.age);


        p1.sleep(8);

        p1.eat();

    }
}

class Person{
    //����(���Ա������
    String name;
    int age;
    char gender;


    //����
    public void eat(){
        String food = "��������"; //�ֲ�����
//        String food;
        System.out.println("��ϲ����" + food);
    }

    public void sleep(int hour){ //�βΣ����ھֲ�����
        System.out.println("�˲�������" + hour + "Сʱ��˯��");

        //���벻ͨ������Ϊ������food������������
//        System.out.println("��ϲ����" + food);

        //����ͨ����
        System.out.println("name = " + name);
    }

}


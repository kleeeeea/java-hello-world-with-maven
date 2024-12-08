package oop3.com.atguigu01._static;

/**
 * ClassName: ChineseTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 15:47
 * @Version 1.0
 */
public class ChineseTest {
    public static void main(String[] args) {

        System.out.println(Chinese.nation);
        Chinese.show();


        Chinese c1 = new Chinese();
        c1.name = "Ҧ��";
        c1.age = 40;
        c1.nation = "China";

        Chinese c2 = new Chinese();
        c2.name = "����";
        c2.age = 39;

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.nation);//China
        System.out.println(c2.nation);//China

        c2.nation = "CHN";

        System.out.println(c1.nation);//CHN
        System.out.println(c2.nation);//CHN

        c1.show();

        ChineseTest.test();
    }

    public static void test(){
        System.out.println("����static�Ĳ��Է���");
    }
}

class Chinese{ //�й�����
    //�Ǿ�̬������ʵ������
    String name;
    int age;

    //��̬�����������
    static String nation = "�й�";

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat(String food){
        System.out.println("��ϲ����" + food);
    }

    public static void show(){
        System.out.println("����һ���й���");

        //���þ�̬�Ľṹ
        System.out.println("nation = " + Chinese.nation);
        method1();

        //���÷Ǿ�̬�Ľṹ
//        System.out.println("name = " + this.name);
//        this.eat("����");
    }

    public static void method1(){
        System.out.println("���Ǿ�̬�Ĳ��Է���");
    }

    public void method2(){
        System.out.println("���ǷǾ�̬�Ĳ��Է���");
        //���÷Ǿ�̬�Ľṹ
        System.out.println("name = " + this.name);
        this.eat("����");

        //���þ�̬�Ľṹ
        System.out.println("nation = " + nation);
        method1();
    }

    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Chinese.nation = nation;
    }
}

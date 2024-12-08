package chapter17_reflect_teacher.src.com.atguigu01.example;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ClassName: ReflectionTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 14:46
 * @Version 1.0
 */
public class ReflectionTest {
    /*
    * ʹ�÷���֮ǰ����ִ�еĲ���
    * */
    @Test
    public void test1(){

        //1.����Person���ʵ��
//        public Person()
        Person p1 = new Person();
        System.out.println(p1);

        //2.��������
        //public int age;
        p1.age = 10;
        System.out.println(p1.age);

        //3.���÷���
        //public void show()
        p1.show();

    }

    /*
    * ʹ�÷�����������Ĳ���
    * */
    @Test
    public void test2() throws Exception{
        //1.����Person���ʵ��
//        public Person()
        Class<Person> clazz = Person.class;
        Person p1 = clazz.newInstance();
        System.out.println(p1);

        //2.��������
        //public int age;
        Field ageField = clazz.getField("age");
        ageField.set(p1,10);
        System.out.println(ageField.get(p1));

        //3.���÷���
        //public void show()
        Method showMethod = clazz.getMethod("show");
        showMethod.invoke(p1);

    }

    /*
    * ����Person��֮�󣬾Ͳ���ֱ�ӵ���Person����������privateȨ�����εĽṹ�����ԡ���������������
    * ���ǣ����ǿ���ͨ������ķ�ʽ������Person����˽�еĽṹ  ---> ��������
    *
    * */
    @Test
    public void test3() throws Exception {
        //1. ����˽�еĹ�����������Person��ʵ��
        //private Person(String name, int age)
        Class clazz = Person.class;
        Constructor cons = clazz.getDeclaredConstructor(String.class,int.class);
        cons.setAccessible(true);
        Person p1 = (Person) cons.newInstance("Tom",12);
        System.out.println(p1);

        //2. ����˽�е�����
        //private String name;
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p1,"Jerry");
        System.out.println(nameField.get(p1));

        //3. ����˽�еķ���
        //private String showNation(String nation)
        Method showNationMethod = clazz.getDeclaredMethod("showNation",String.class);
        showNationMethod.setAccessible(true);
        String info = (String) showNationMethod.invoke(p1,"CHN");
        System.out.println(info);
    }
}

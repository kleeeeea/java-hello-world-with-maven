package oop_tut.com.atguigu08.constructor.exer1;

/**
 * ClassName: StudentTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 16:45
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student("��ǿ��",48,"�й������ѧ","���ѧ");
        System.out.println(s1.getInfo());

        Student s2 = new Student("�̲�����",28,"�廪��ѧ");
        System.out.println(s2.getInfo());
    }
}

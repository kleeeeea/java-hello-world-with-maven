package oop2.com.atguigu05._super;

/**
 * ClassName: Person
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 9:08
 * @Version 1.0
 */
public class Person {
    //����
    String name;
    private int age;

    int id = 1001;//���֤��

    public Person() {

        System.out.println("Person()....");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    //����
    public void eat(){
        System.out.println("�˳Է�");
    }
    public void sleep(){
        System.out.println("��˯��");
    }

    public void doSport(){
        System.out.println("���˶�");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

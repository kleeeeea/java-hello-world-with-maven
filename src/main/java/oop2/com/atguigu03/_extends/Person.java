package oop2.com.atguigu03._extends;

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

    //����
    public void eat(){
        System.out.println("�˳Է�");
    }
    public void sleep(){
        System.out.println("��˯��");
    }

    public void show(){
        System.out.println("age : " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

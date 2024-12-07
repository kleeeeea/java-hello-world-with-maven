package oop2.com.atguigu03._extends;

/**
 * ClassName: Person
 * Description:
 *
 * @Author ÉĞ¹è¹È-ËÎºì¿µ
 * @Create 9:08
 * @Version 1.0
 */
public class Person {
    //ÊôĞÔ
    String name;
    private int age;

    //·½·¨
    public void eat(){
        System.out.println("ÈË³Ô·¹");
    }
    public void sleep(){
        System.out.println("ÈËË¯¾õ");
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

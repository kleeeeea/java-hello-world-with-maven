package oop2.com.atguigu06.polymorphism;

/**
 * ClassName: Man
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 16:21
 * @Version 1.0
 */
public class Man extends Person{

    boolean isSmoking;

    int id = 1002;

    public void eat(){
        System.out.println("a�˶���⣬������");
    }

    public void walk(){
        System.out.println("a�˱�ͦ����·");
    }

    public void earnMoney(){
        System.out.println("a����Ǯ����");
    }

}

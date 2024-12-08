package oop2.com.atguigu06.polymorphism.apply;

/**
 * ClassName: AnimalTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 16:39
 * @Version 1.0
 */
public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();

        test.adopt(new Dog());
        test.adopt(new Cat());
    }

    public void adopt(Animal animal){ //Animal animal = new Dog()
        animal.eat();
        animal.jump();

//        animal.watchDoor();
    }

//    public void adopt(Dog dog){
//        dog.eat();
//        dog.jump();
//
//    }
//
//    public void adopt(Cat cat){
//        cat.eat();
//        cat.jump();
//
//    }

    //��������

}

class Animal{
    public void eat(){
        System.out.println("�����ʳ");
    }

    public void jump(){
        System.out.println("������");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("���Թ�ͷ");
    }

    public void jump(){
        System.out.println("������ǽ");
    }

    public void watchDoor(){
        System.out.println("���ܿ���");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("è����");
    }

    public void jump(){
        System.out.println("è��~~");
    }

    public void catchMouse(){
        System.out.println("èץ����");
    }
}


package oop_tut.com.atguigu08.constructor;

/**
 * ClassName: Person
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 16:20
 * @Version 1.0
 */
class Person {
    //����
    String name;
    int age;

    //������
    public Person(){
        System.out.println("Person()....");
    }

    //���������Ĺ�����
    public Person(int a){
        age = a;
    }

    public Person(String n){
        name = n;
    }

    public Person(String n,int a){
        name = n;
        age = a;
    }


    //����
    public void eat(){
        System.out.println("�˳Է�");
    }
    public void sleep(int hour){
        System.out.println("ÿ��˯��" + hour + "Сʱ");
    }

}

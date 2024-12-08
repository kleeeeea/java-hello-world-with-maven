package chapter17_reflect_teacher.src.com.atguigu01.example;

/**
 * @author �й��-�κ쿵
 * @create 9:35
 */
public class Person {
    //����
    private String name;
    public int age;

    //������
    public Person(){
        System.out.println("Person()...");
    }

    public Person(int age){
        this.age = age;
    }

    private Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //����
    public void show(){
        System.out.println("��ã�����һ��Person");
    }

    private String showNation(String nation){
        return "�ҵĹ����ǣ�" + nation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


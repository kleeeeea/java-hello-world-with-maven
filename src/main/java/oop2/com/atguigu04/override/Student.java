package oop2.com.atguigu04.override;

/**
 * ClassName: Student
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 9:08
 * @Version 1.0
 */
public class Student extends Person {

    String school;


    public void study(){
        System.out.println("ѧ��ѧϰ");
    }

    public void eat(){
        System.out.println("ѧ��Ӧ�ö����Ӫ����ʳ��");
    }

    public void show1(){
        System.out.println("age : " + getAge());

    }
    //��д������ڷ���ֵ�Ĳ���
    public int info(){
        return 1;
    }

    public Student info1(){
        return null;
    }

//    public void sleep(){
//        System.out.println("ѧ��Ӧ�ö�˯��������");
//    }


    @Override
    public void sleep() {
        System.out.println("ѧ��Ӧ�ö�˯��������");

    }
}

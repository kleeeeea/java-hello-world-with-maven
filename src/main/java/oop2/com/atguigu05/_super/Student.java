package oop2.com.atguigu05._super;

/**
 * ClassName: Student
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 9:08
 * @Version 1.0
 */
public class Student extends Person {
    //����
    String school;

    int id = 1002;//ѧ��

    public void setSchool(String school){
        this.school = school;
    }

    //����
    public void study(){
        System.out.println("ѧ��ѧϰ");
    }

    public void eat(){
        System.out.println("ѧ�������Ӫ����ʳ��");
    }
    public void sleep(){
        System.out.println("ѧ����֤ÿ�첻����10��Сʱ��˯��");
    }

    //����super���÷���������
    public void show(){
        eat(); //ʡ����this
        this.eat();

        super.eat();
    }

    public void show1(){
        doSport();
        this.doSport();
        super.doSport();
    }

    public void show2(){
        System.out.println(id);//1002
        System.out.println(this.id); //1002

        System.out.println(super.id); //1001
    }

    public void show3(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    //����super���ø���Ĺ�����
    public Student(){
        super();
//        this("Tom",12);
        System.out.println("Student()...");
    }
    public Student(String name,int age){
        System.out.print(age); System.out.println(" | String name,int age | oop2/com/atguigu05/_super/Student.java:67");
//        setAge(age);
//        super.name = name;
//        super(name,age);
    }

}

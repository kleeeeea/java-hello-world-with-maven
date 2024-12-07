package oop_tut.com.atguigu08.constructor.exer1;

/**
 * ClassName: Student
 * Description:
 *
 *  (1)����Student��,��4�����ԣ�
 *   String name;
 *   int age;
 *   String school;
 *   String major;
 *
 * (2)����Student���3��������:
 *
 * - ��һ��������Student(String n, int a)�������name��age���ԣ�
 * - �ڶ���������Student(String n, int a, String s)�������name, age ��school���ԣ�
 * - ������������Student(String n, int a, String s, String m)�������name, age ,school��major���ԣ�
 *
 * @Author �й��-�κ쿵
 * @Create 16:42
 * @Version 1.0
 */
public class Student {

    String name;
    int age;
    String school;
    String major;//רҵ

    public Student(String n,int a){
        name = n;
        age = a;
    }
    public Student(String n, int a, String s){
        name = n;
        age = a;
        school = s;
    }

    Student(String n, int a, String s, String m){
        name = n;
        age = a;
        school = s;
        major = m;
    }

    public String getInfo(){
        return "name = " + name + ",age = " + age +
                ",school = " + school + ", major = " + major;
    }

}

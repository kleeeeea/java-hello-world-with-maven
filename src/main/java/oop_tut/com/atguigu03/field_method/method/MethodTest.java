

package oop_tut.com.atguigu03.field_method.method;

/**
 * @author �й��-�κ쿵
 * @create 19:01
 */
public class MethodTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.eat();
        p1.eat();

        p1.info();

        p1.sleep(8);

        String info = p1.interests("���");
        System.out.println(info);
    }

}



class Person{

    //����
    String name;
    int age;
    char gender;

    //����
    public void eat(){
        System.out.println("�˳Է�");

        sleep(8);

        System.out.println("name = " + name);
    }

    public void sleep(int hour){
        System.out.println("������ÿ��˯��" + hour + "Сʱ");
    }

    public String interests(String hobby){
        String info = "�ҵİ�����" + hobby;
        System.out.println(info);
//        return info;

        return "abc";
    }

    public int getAge(){
        return age;
    }

    public void info(){
        System.out.println("Person info()");
//        info();

        //�����ڲ��ܶ��巽����
//        public void show(){
//
//        }
    }

    public void printNumber(int targetNumber){ //10
        for(int i = 1;i <= targetNumber;i++){

            if(i == 4){
                return ; //���ڽ���������
                //return���治������ִ�����
//                System.out.println("�����Ȱ�ҪԼ�ҳԷ�");
            }

            System.out.println(i);
        }
    }

}

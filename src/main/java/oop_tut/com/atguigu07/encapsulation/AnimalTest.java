package oop_tut.com.atguigu07.encapsulation;

/**
 * ClassName: AnimalTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 14:34
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {

        Animal animal1 = new Animal();

        animal1.name = "���";
        //��Ϊlegs����Ϊprivate����˽�еģ�����Animal��֮��Ͳ��ܵ����ˡ�
//        animal1.legs = 4;
//        animal1.legs = -4;

        //ֻ��ͨ��setLegs()����ӵĶ�legs���Խ��и�ֵ��
        animal1.setLegs(2);
        animal1.setLegs(-2);

//        System.out.println("name = " + animal1.name + ", legs = " + animal1.legs);

        System.out.println("name = " + animal1.name + ", legs = " + animal1.getLegs());

        animal1.eat();

    }
}

class Animal{ //����
    //����
    String name; //����
    private int legs;//�ȵĸ���



    //����
    //����legs������ֵ
    public void setLegs(int l){
        if(l >= 0 && l % 2 == 0){
            legs = l;
        }else{
            System.out.println("����������ݷǷ�");
        }
    }
    //��ȡlegs������ֵ
    public int getLegs(){
        return legs;
    }


    public void eat(){
        System.out.println("������ʳ");
    }
}

//private class AA{}

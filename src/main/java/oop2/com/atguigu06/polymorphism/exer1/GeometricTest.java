package oop2.com.atguigu06.polymorphism.exer1;

/**
 * ClassName: GeometricTest
 * Description:
 *      ��дequalsArea���������������������Ƿ���ȣ�ע�ⷽ���Ĳ������ͣ���
 *      ��дdisplayGeometricObject������ʾ����������ע�ⷽ���Ĳ������ͣ���
 * @Author �й��-�κ쿵
 * @Create 8:55
 * @Version 1.0
 */
public class GeometricTest {

    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();

        Circle c1 = new Circle("red",1.0,2.3);
        Circle c2 = new Circle("red",1.0,3.3);

        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);

        boolean isEquals = test.equalsArea(c1,c2);
        if(isEquals){
            System.out.println("������");
        }else{
            System.out.println("��������");
        }

        //ʹ����������
        test.displayGeometricObject(new MyRectangle("blue",1.0,2.3,4.5));

    }

    /**
     * �Ƚ���������ͼ�ε�����Ƿ����
     * @param g1
     * @param g2
     * @return true:��ʾ������   false:��������
     */
    public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        return g1.findArea() == g2.findArea();
    }

    /**
     * ��ʾ����ͼ�ε����
     * @param g
     */
    public void displayGeometricObject(GeometricObject g){ //GeometricObject g = new Circle("red",1.0,2.3);
        System.out.println("����ͼ�ε����Ϊ��" + g.findArea()); //��̬��  <---> ��̬��
    }
}

package oop2.com.atguigu03._extends.exer2;

/**
 * ClassName: CylinderTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 10:04
 * @Version 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cy = new Cylinder();

        cy.setRadius(2.3);
        cy.setLength(1.4);

        System.out.println("Բ�������Ϊ��" + cy.findVolume());

        System.out.println("Բ���ĵ������" + cy.findArea());

    }
}

package oop3.com.atguigu12.wrapper.exer1;

import java.util.Scanner;
import java.util.Vector;

/**
 * ClassName: ScoreTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 9:57
 * @Version 1.0
 */
public class ScoreTest {
    public static void main(String[] args) {

        //1. ����Vector����Vector v=new Vector();
        Vector v = new Vector();

        Scanner scanner = new Scanner(System.in);

        int maxScore = 0; //��¼��߷�



        //2. �Ӽ��̻�ȡ���ѧ���ɼ�����ŵ�v�� ���Ը����������������
        while(true){ //for(;;)

            System.out.print("������ѧ���ɼ����Ը������������������");
            int intScore = scanner.nextInt();

            if(intScore < 0){
                break;
            }

//            //װ�䣺int --> Integer����
//            Integer score = Integer.valueOf(intScore);
//            //���ѧ���ɼ�������v��
//            v.addElement(score);

            //jdk5.0֮���Զ�װ��
            v.addElement(intScore);

            //3. ��ȡѧ���ɼ������ֵ
            if(maxScore < intScore){
                maxScore = intScore;
            }
        }

        System.out.println("��߷֣�" + maxScore);
        //4. ���λ�ȡv�е�ÿ��ѧ���ɼ�������߷ֽ��бȽϣ���ȡѧ���ȼ��������
        for(int i = 0;i < v.size();i++){
            Object objScore = v.elementAt(i);
            //��ʽ1��
//            Integer integerScore = (Integer) objScore;
//            //����
//            int score = integerScore.intValue();

            //��ʽ2���Զ�����
            int score = (Integer) objScore;
            char grade;
            if(maxScore - score <= 10){
                grade = 'A';
            }else if(maxScore - score <= 20){
                grade = 'B';
            }else if(maxScore - score <= 30){
                grade = 'C';
            }else{
                grade = 'D';
            }

            System.out.println("student " + i +" score is " + score + " grade is " + grade);

        }

        scanner.close();
    }
}

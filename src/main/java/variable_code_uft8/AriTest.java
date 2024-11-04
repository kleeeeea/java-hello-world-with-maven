package variable_code_uft8;

/*
�����������ʹ��1�������������ʹ��


1. +  -  +  -  *  /  %  (ǰ)++  (��)++  (ǰ)--  (��)--  +


*/
class AriTest {
	public static void main(String[] args) {
		//*******************************
		//������ /
		int m1 = 12;
		int n1 = 5;
		int k1 = m1 / n1;
		System.out.println(k1);//2

		System.out.println(m1 / n1 * n1);//10
		
		//*******************************
		//ȡģ����ȡ�ࣩ�� %
		int i1 = 12;
		int j1 = 5;
		System.out.println(i1 % j1); //2

		//�����У����������ж�ĳ����num1����������һ����num2��  num1 % num2 == 0
		//���磺�ж�num1�Ƿ���ż���� num1 % 2 == 0
		
		//���ۣ�ȡģ�Ժ󣬽���뱻ģ���ķ�����ͬ
		int i2 = -12;
		int j2 = 5;
		System.out.println(i2 % j2); //-2

		int i3 = 12;
		int j3 = -5;
		System.out.println(i3 % j3); //2

		int i4 = -12;
		int j4 = -5;
		System.out.println(i4 % j4); //-2
		

		//*******************************
		//(ǰ)++ :������1��������
		//(��)++ :�����㣬������1
		int a1 = 10;
		int b1 = ++a1;
		System.out.println("a1 = " + a1 + ",b1 = " + b1); //a1 = 11,b1 = 11

		int a2 = 10;
		int b2 = a2++;
		System.out.println("a2 = " + a2 + ",b2 = " + b2); //a2 = 11,b2 = 10

		//��ϰ1��
		int i = 10;
		//i++;
		++i;
		System.out.println("i = " + i);//11

		//��ϰ2��
		short s1 = 10;
		//��ʽ1��

		//���벻ͨ��
		//s1 = s1 + 1;

		//s1 = (short)(s1 + 1);
		//System.out.println(s1);

		//��ʽ2��
		s1++;
		System.out.println(s1);

		//*******************************
		//(ǰ)-- :���Լ�1��������
		//(��)-- :�����㣬���Լ�1
		//��
		
		//���ۣ�++ �� -- ���㣬����ı�������������ͣ�

		//+ :���ӷ���ֻ������String���������͵ı���������㣬��������Ľ��Ҳ��String���͡�

	}
}

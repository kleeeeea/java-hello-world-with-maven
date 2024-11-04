package variable_code_uft8;

/*
��VariableTest4.java��������ǿ������ת��

����
1. �����Ҫ��������ı���������ת��Ϊ����С�ı��������ͣ���Ҫʹ��ǿ������ת��
2. ǿ������ת����Ҫʹ��ǿת����()����()��ָ��Ҫת��Ϊ���������͡�
3. ǿ������ת�������У����ܵ��¾�����ʧ��
*/
class VariableTest4 {
	public static void main(String[] args) {
		
		double d1 = 12;//�Զ���������
		
		//����ʧ��
		//int i1 = d1;

		int i2 = (int)d1;
		System.out.println(i2);


		long l1 = 123;
		//����ʧ��
		//short s1 = l1;
		short s2 = (short)l1;
		System.out.println(s2);


		//��ϰ
		int i3 = 12;
		float f1 = i3;//�Զ���������
		System.out.println(f1); //12.0

		float f2 = (float)i3; //�������ͨ����ֻ��������ʡ��()���ѡ�
		
		//������ʧ������1��
		double d2 = 12.9;
		int i4 = (int)d2;
		System.out.println(i4);

		//������ʧ������2��
		int i5 = 128;
		byte b1 = (byte)i5;
		System.out.println(b1); //-128


		//ʵ�ʿ���������
		byte b2 = 12;
		method(b2);

		long l2 = 12L;
		//���벻ͨ��
		//method(l2);
		method((int)l2);
	}


	public static void method(int num){   //int num = b2;�Զ���������
		System.out.println("num = " + num);
	}
}

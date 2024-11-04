package variable_code_uft8;

/*
����2����ν�������int�ͱ�����ֵ��String�أ�

*/
class BitExer {
	public static void main(String[] args) {
		
		int m = 10;
		int n = 20;

		System.out.println("m = " + m + ",n = " + n);

		//��������������ֵ
		//��ʽ1������һ����ʱ���������Ƽ���
		//int temp = m;
		//m = n;
		//n = temp;

		//��ʽ2���ŵ㣺����Ҫ������ʱ������  ȱ�㣺�ѡ������Բ�������ڷ���ֵ���ͣ������ܳ���int�ķ�Χ
		//m = m + n; //30 = 10 + 20;
		//n = m - n; //10 = 30 - 20;
		//m = m - n; //20 = 30 - 10;

		//��ʽ3���ŵ㣺����Ҫ������ʱ������  ȱ�㣺���ѡ������Բ�������ڷ���ֵ���ͣ�
		m = m ^ n;
		n = m ^ n;//(m ^ n) ^ n ---> m
		m = m ^ n;


		System.out.println("m = " + m + ",n = " + n);
		

	}
}

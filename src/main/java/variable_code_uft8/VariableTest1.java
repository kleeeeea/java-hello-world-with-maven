package variable_code_uft8;

/*
�������ͺ͸����ͱ�����ʹ��


*/
class VariableTest1 {
	public static void main(String[] args) {
		
		//1.�������ͱ�����ʹ��
		// byte(1�ֽ�=8bit) \ short(2�ֽ�) \ int(4�ֽ�) \ long(8�ֽ�) 

		byte b1 = 12;
		byte b2 = 127;
		//���벻ͨ������Ϊ������byte�Ĵ洢��Χ
		//byte b3 = 128;

		short s1 = 1234;

		int i1 = 123234123;
		//�� ����long���ͱ���ʱ����Ҫ�ṩ��׺����׺Ϊ'l'a'L'
		long l1 = 123123123L;

		//�� �����У���Ҷ������ͱ���ʱ��û����������Ļ���ͨ��������Ϊint���͡�

		//2.���Ը������ͱ�����ʹ��
		//float \ double
		double d1 = 12.3;
		//�� ����long���ͱ���ʱ����Ҫ�ṩ��׺����׺Ϊ'f'a'F'
		float f1 = 12.3f;
		System.out.println("f1 = " + f1);

		//�� �����У���Ҷ��帡���ͱ���ʱ��û����������Ļ���ͨ��������Ϊdouble���ͣ���Ϊ���ȸ��ߡ�

		//�� float���ͱ�����ΧҪ����long���͵ı�����Χ�����Ǿ��Ȳ��ߡ�

		//���Ը����ͱ����ľ���
		//���ۣ�ͨ�����Է��ָ����ͱ����ľ��Ȳ��ߡ�����ڿ����У���Ҫ���ߵľ��ȣ���Ҫʹ��BigDecimal���滻�����ͱ�����
		//����1
		System.out.println(0.1 + 0.2);

		//����2:
		float ff1 = 123123123f;
		float ff2 = ff1 + 1;
		System.out.println(ff1);
		System.out.println(ff2);
		System.out.println(ff1 == ff2);
		
		System.out.print(ff2); System.out.println(" | ff2 | VariableTest1.java:48");
		
	}
}

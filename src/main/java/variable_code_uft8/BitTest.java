package variable_code_uft8;

/*
�����������ʹ��5��λ�����

1. <<   >>   >>>   &  |  ^  ~

2. ˵����

�� <<   >>   >>>   &  |  ^  ~ �������ֵ���͵ı��������������㣬����Ľ��Ҳ����ֵ
�� 
<< : ��һ����Χ�ڣ�ÿ�����ƶ�һλ���������ԭ�еĻ����� * 2�����������������������ã�
>> : ��һ����Χ�ڣ�ÿ�����ƶ�һλ���������ԭ�еĻ����� / 2�����������������������ã�

3. �����⣺��Ч�ķ�ʽ����2 * 8 �� 

2 << 3 �� 8 << 1

*/
class BitTest {
	public static void main(String[] args) {
		int num1 = 7;
		System.out.println("num1 << 1 : " + (num1 << 1));
		System.out.println("num1 << 2 : " + (num1 << 2));
		System.out.println("num1 << 3 : " + (num1 << 3));
		System.out.println("num1 << 28 : " + (num1 << 28));
		System.out.println("num1 << 29 : " + (num1 << 29));//���̲���

		int num2 = -7;
		System.out.println("num2 << 1 : " + (num2 << 1));
		System.out.println("num2 << 2 : " + (num2 << 2));
		System.out.println("num2 << 3 : " + (num2 << 3));

		System.out.println(~9);
		System.out.println(~-10);

		
		

	}
}

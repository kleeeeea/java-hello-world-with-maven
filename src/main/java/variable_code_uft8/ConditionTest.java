package variable_code_uft8;

/*
�����������ʹ��6�����������

1. (�������ʽ)? ���ʽ1 : ���ʽ2

2. ˵����
�� �������ʽ�Ľ����boolean���͡�
�� ����������ʽ�Ľ����true����ִ�б��ʽ1������ִ�б��ʽ2��
�� ���ʽ1 �� ���ʽ2 ��Ҫ����ͬ�����ͻ��ܼ��ݵ����͡�

�� �����У����ǿ���ʹ�������������λ�ã������Ը�дΪif-else��
          ��֮����ʹ��if-else�ṹ����һ���ܸ�дΪ�����������
  
  ���飬�ڶ��߶���ʹ�õ�����£��Ƽ�ʹ���������������Ϊִ��Ч���Ըߡ�

*/
class ConditionTest {
	public static void main(String[] args) {
		
		String info = (2 > 10)? "���ʽ1" : "���ʽ2";
		System.out.println(info);

		double result = (2 > 1)? 1 : 2.0;
		System.out.println(result);

		//��ϰ1����ȡ���������Ľϴ�ֵ
		int m = 10;
		int n = 20;

		int max = (m > n)? m : n;
		System.out.println("�ϴ�ֵΪ��" + max);

		//��ϰ2����ȡ�������������ֵ
		int i = 20;
		int j = 30;
		int k = 23;

		int tempMax = (i > j)? i : j;
		int finalMax = (tempMax > k)? tempMax : k;
		System.out.println(finalMax);

		//�ϲ��Ժ��д�������Ƽ�
		int finalMax1 = (((i > j)? i : j) > k)? ((i > j)? i : j) : k;
		System.out.println(finalMax1);
	}
}

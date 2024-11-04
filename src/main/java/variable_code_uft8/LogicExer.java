package variable_code_uft8;

/*
1. ������ LogicExer
2. ���� main����
3. ����һ��int���ͱ���a,����b,����ֵΪ20
4. ����boolean���ͱ���bo1 , �ж�++a �Ƿ�3����,����a++ �Ƿ�7����,�������ֵ��bo1
5. ���a��ֵ,bo1��ֵ
6. ����boolean���ͱ���bo2 , �ж�b++ �Ƿ�3����,����++b �Ƿ�7����,�������ֵ��bo2
7. ���b��ֵ,bo2��ֵ

*/
class LogicExer {
	public static void main(String[] args) {
		int a,b;
		a = b = 20;
		
		boolean bo1 = (++a % 3 == 0) && (a++ % 7 == 0);

		System.out.println("a = " + a + ",bo1 = " + bo1);

		
		boolean bo2 = (b++ % 3 == 0) && (++b % 7 == 0);
		
		System.out.println("b = " + b + ",bo2 = " + bo2);
		

	}
}

package variable_code_uft8;

/*
�����ַ����ͺͲ������͵�ʹ��


*/
class VariableTest2 {
	public static void main(String[] args) {
		
		//1.�ַ����ͣ�char(2�ֽ�)

		//��ʾ��ʽ1��ʹ��һ��''��ʾ���ڲ����ҽ���һ���ַ�
		char c1 = 'a';
		char c2 = 'a';
		char c3 = '1';
		char c4 = '%';
		char c5 = 'a';
		
		//���벻ͨ��
		//char c6 = '';
		//char c7 = 'ab';

		//��ʾ��ʽ2��ֱ��ʹ��Unicodeֵ����ʾ�ַ��ͳ�����
		char c8 = '\u0036';
		System.out.println(c8);

		//��ʾ��ʽ3��ʹ��ת���ַ�
		char c9 = '\n';
		char c10 = '\t';
		System.out.println("hello" + c10 + "world");

		//��ʾ��ʽ4��ʹ�þ����ַ���Ӧ����ֵ������ASCII�룩
		char c11 = 97;
		System.out.println(c11);//a

		char c12 = '1';
		char c13 = 1;

		//2. �������ͣ�boolean
		//�� ֻ������ȡֵ��true �� false
		boolean bo1 = true;
		boolean bo2 = false;
		
		//���벻ͨ��
		//boolean bo3 = 0;
		//�� ��ʹ�������̿�������С����磺�����жϡ�ѭ���ṹ��
		boolean isMarried = true;
		if(isMarried){
			System.out.println("���ź������ܲμӵ����ɶ���");
		}else{
			System.out.println("���Զ�̸����Ů���ѻ�������");
		}
		//�� �˽⣺���ǲ�̸boolean����ռ�õĿռ��С�����ǣ��������ڴ��з���Ļ���ʹ�õ���4���ֽڡ�
	}
}

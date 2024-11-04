package variable_code_uft8;

/*
���Ա����Ļ���ʹ��

1. ��������⣺�ڴ��е�һ���洢���򣬸���������ݿ�����ͬһ���ͷ�Χ�ڲ��ϱ仯

2. �����Ĺ��ɰ�������Ҫ�أ��������͡����������洢��ֵ

3. Java�б��������ĸ�ʽ���������� ������ = ����ֵ

4. Java�еı��������������������ࣺ
	�����������ͣ�8�֣�:
		���ͣ�byte \ short \ int \ long 
		�����ͣ�float \ double 
		�ַ��ͣ�char
		�����ͣ�boolean

	�����������ͣ�
		��(class)
		����(array)
		�ӿ�(interface)

		ö��(enum)
		ע��(annotation)
		��¼(record)

5. �������ʱ��������Ҫ��ѭ��ʶ�������Ĺ���͹淶��

6. ˵����
�� ���������������򡣱���ֻ��������������Ч�ģ������������ʧЧ�ˡ�
�� ��ͬһ���������ڣ�������������ͬ���ı���
�� ����ñ����Ժ󣬾Ϳ���ͨ���������ķ�ʽ�Ա������е��ú����㡣
�� ����ֵ�ڸ�ֵʱ����������������������ͣ�����������������Ч�ķ�Χ�ڱ仯��

*/
class VariableTest {
	public static void main(String[] args) {
		
		
		//��������ķ�ʽ1��
		char gender; //����1������������
		gender = 'a'; //����2�������ĸ�ֵ�����ʼ����

		gender = 'a';
		
		//��������ķ�ʽ2���������ʼ���ϲ�
		int age = 10;


		System.out.println(age);
		System.out.println("age = " + age);
		System.out.println("gender = " + gender);

		//��ͬһ���������ڣ�������������ͬ���ı���
		//char gender = 'a';

		gender = 'a';
		
		//����numberǰû���������ͣ�����ǰnumber����û����ǰ���塣���Ա��벻ͨ����
		//number = 10;

		byte b1 = 127;
		//b1������byte�ķ�Χ�����벻ͨ����
		//b1 = 128;

	}

	public static void main123(String[] args) {
		//System.out.println("gender = " + gender);

		char gender = 'a';
		
	}
}

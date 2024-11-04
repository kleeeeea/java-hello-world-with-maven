package variable_code_uft8;

/*
���Գ��õĽ��ƣ�

- ʮ���ƣ�decimal��
  - ������ɣ�0-9
  - ��λ������ʮ��һ

- �����ƣ�binary��
  - ������ɣ�0-1
  - ��λ����������һ����`0b`��`0B`��ͷ

- �˽��ƣ�octal��������ʹ��
  - ������ɣ�0-7
  - ��λ�������˽�һ��������`0`��ͷ��ʾ

- ʮ������
  - ������ɣ�0-9��a-f
  - ��λ������ʮ����һ����`0x`��`0X`��ͷ��ʾ���˴��� a-f �����ִ�Сд

*/
class BinaryTest {
	public static void main(String[] args) {
		int num1 = 103; //ʮ����
		
		int num2 = 0b10; //������

		int num3 = 023;//�˽���

		int num4 = 0X23a; //ʮ������

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

	}
}

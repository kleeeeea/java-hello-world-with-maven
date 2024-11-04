package variable_code_uft8;

/*
�������һ����λ����������ӡ��ʾ���ĸ�λ����ʮλ������λ����ֵ��
��ʽ���£�
����xxx��������£�
��λ����
ʮλ����
��λ����

���磺
����153��������£�
��λ����3
ʮλ����5
��λ����1

*/
class AriExer {
	public static void main(String[] args) {
		
		int num = 153;
		int ge = num % 10; //��λ
		int shi = num / 10 % 10; //ʮλ.   ���� int shi = num % 100 / 10
		int bai = num / 100;

		System.out.println("��λ�ǣ�" + ge);
		System.out.println("ʮλ�ǣ�" + shi);
		System.out.println("��λ�ǣ�" + bai);

	}
}

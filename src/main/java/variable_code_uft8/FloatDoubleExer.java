package variable_code_uft8;

/*
����1������Բ���ʲ���ֵΪ3.14������3��Բ�İ뾶�ֱ�Ϊ1.2��2.5��6�������ǵ������

*/
class FloatDoubleExer {
	public static void main(String[] args) {

		//����Բ���ʱ���
		double pi = 3.14;

		//��������Բ�İ뾶
		double radius1 = 1.2;
		double radius2 = 2.5;
		int radius3 = 6;

		//�������
		double area1 = pi * radius1 * radius1;
		double area2 = pi * radius2 * radius2;
		double area3 = pi * radius3 * radius3;

		//���
		System.out.println("Բ1�İ뾶Ϊ��" + radius1 + ",���Ϊ��" + area1);
		System.out.println("Բ2�İ뾶Ϊ��" + radius2 + ",���Ϊ��" + area2);
		System.out.println("Բ3�İ뾶Ϊ��" + radius3 + ",���Ϊ��" + area3);
	}
}

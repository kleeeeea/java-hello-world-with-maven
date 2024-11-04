package variable_code_uft8;

/*

����2��Ϊ�ֿ���ˮ��սʿ������ս89Сʱ����̼��㹲�����������Сʱ��
*/
class AriExer1 {
	public static void main(String[] args) {

		int hours = 89;

		int day = hours / 24;
		int hour = hours % 24;

		System.out.println("����ս��" + day + "����" + hour + "Сʱ");


		//�������ϰ1��
		System.out.println("5+5=" + 5 + 5);
		System.out.println("5+5=" + (5 + 5));

		//�������ϰ2��
		byte bb1 = 127;
		bb1++;
		System.out.println("bb1 = " + bb1);

		//�������ϰ3��
		//int i = 1;
		//int j = i++ + ++i * i++;

		//System.out.println("j = " + j);//10

		//�������ϰ4��
		int i = 2;
		int j = i++;
		System.out.println(j); //2


		int k = 2;
		int z = ++k;
		System.out.println(z);//3

		int m = 2;
		m = m++;
		System.out.println(m); //2

	}
}

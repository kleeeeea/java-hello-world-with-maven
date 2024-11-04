package variable_code_uft8;

/*
��������2��10���Ժ����ܼ���

Ҫ�󣺿���̨���"��������2��10���Ժ�����x"��
*/
class ConditionExer {
	public static void main(String[] args) {
		
		int week = 2;
		//week = 4;

		week += 10;

		week %= 7;

		System.out.println("��������2��10���Ժ�����" + ((week == 0)? "��" : week));

	}
}

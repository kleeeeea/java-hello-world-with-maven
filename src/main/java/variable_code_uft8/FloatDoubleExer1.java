package variable_code_uft8;

/*
����2��С��Ҫ���������Σ�����������¶����Ի��϶�Ϊ��λ��¼�ġ�
����Ҫһ�����򽫻����¶ȣ�80�ȣ�ת��Ϊ���϶ȣ����Ի��϶Ⱥ����϶�Ϊ��λ�ֱ���ʾ���¶ȡ�

�� = (�H - 32) / 1.8
*/
class FloatDoubleExer1 {
	public static void main(String[] args) {
		
		double hua = 80.0;

		double she = (hua - 32) / 1.8;

		System.out.println("���϶�" + hua + "�H ��Ӧ�����϶�Ϊ" + she + "��");

	}
}

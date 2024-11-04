package variable_code_uft8;

/*
�����������ʹ��4���߼������

1.  & &&  |  ||  ! ^
2. ˵����
�� �߼��������ԵĶ���boolean���͵ı������еĲ���
�� �߼����������Ľ��Ҳ��boolean���͡�
�� �߼��������ʹ�������жϽṹ��ѭ���ṹ��


*/
class LogicTest {
	public static void main(String[] args) {
				
		/*
		���֣�& �� &&
		
		1����ͬ�㣺�������ű��Ķ���"��"�Ĺ�ϵ��ֻ�е������������ߵ�����ֵ��Ϊtrueʱ�������Ϊtrue��

		2��ִ�й��̣�
			1��������������true����& ��&& ����ִ�з����ұߵĲ���
			2��������������false���� & �����ִ�з����ұߵĲ���
			                           && ����ִ�з����ұߵĲ���
		3�������У������Ƽ�ʹ��&& 
		*/
		boolean b1 = true;
		b1 = false;

		int num1 = 10;

		if(b1 & (num1++ > 0)){
			System.out.println("��ǰ���¹�");
		}else{
			System.out.println("�ҽй��¸�");
		}
		
		System.out.println("num1 = " + num1);

		//

		boolean b2 = true;
		b2 = false;

		int num2 = 10;

		if(b2 && (num2++ > 0)){
			System.out.println("��ǰ���¹�");
		}else{
			System.out.println("�ҽй��¸�");
		}
		
		System.out.println("num2 = " + num2);

		//********************************************
		/*
		���֣�| �� ||
		
		1����ͬ�㣺�������ű��Ķ���"��"�Ĺ�ϵ��ֻҪ�������ߴ���true������������Ϊtrue.

		2��ִ�й��̣�
			1��������������false����| ��|| ����ִ�з����ұߵĲ���
			2��������������true���� | �����ִ�з����ұߵĲ���
			                          || ����ִ�з����ұߵĲ���
		3�������У������Ƽ�ʹ��||
		*/
		boolean b3 = false;
		b3 = true;

		int num3 = 10;

		if(b3 | (num3++ > 0)){
			System.out.println("��ǰ���¹�");
		}else{
			System.out.println("�ҽй��¸�");
		}
		
		System.out.println("num3 = " + num3);

		//

		boolean b4 = false;
		b4 = true;

		int num4 = 10;

		if(b4 || (num4++ > 0)){
			System.out.println("��ǰ���¹�");
		}else{
			System.out.println("�ҽй��¸�");
		}
		
		System.out.println("num4 = " + num4);
	}
}

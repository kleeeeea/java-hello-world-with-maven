package variable_code_uft8;

class StringExer1 {
	public static void main(String[] args) {
		
		//��ϰ1��
		//String str1 = 4;                       //�ж϶Դ�no
		String str2 = 3.5f + "";               //�ж�str2�Դ�yes
		System.out.println(str2);              //�����3.5
		System.out .println(3+4+"Hello!");     //�����7Hello!
		System.out.println("Hello!"+3+4);      //�����Hello!34
		System.out.println('a'+1+"Hello!");    //�����98Hello!
		System.out.println("Hello"+'a'+1);     //�����Helloa1

		//��ϰ2��
		System.out.println("*    *");				//�����*    *
		System.out.println("*\t*");					//�����*	*
		System.out.println("*" + "\t" + "*");		//�����*	*
		System.out.println('*' + "\t" + "*");		//�����*	*
		System.out.println('*' + '\t' + "*");		//�����51*
		System.out.println('*' + "\t" + '*');		//�����*	*
		System.out.println("*" + '\t' + '*');		//�����*	*
		System.out.println('*' + '\t' + '*');		//�����93

	}
}

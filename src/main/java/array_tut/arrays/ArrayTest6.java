package array_tut.arrays;

public class ArrayTest6 {
	public static void main(String argv[]){
//�洢26����ĸ
        char[] letters = new char[26];
        System.out.println("letters����ĳ��ȣ�" + letters.length);
        System.out.print("�洢��ĸ��letters����֮ǰ��[");
        for (int i = 0; i < letters.length; i++) {
            if(i==0){
                System.out.print(letters[i]);
            }else{
                System.out.print("," + letters[i]);
            }
        }
        System.out.println("]");

       //�洢5������
        String[] names = new String[5];
        System.out.println("names����ĳ��ȣ�" + names.length);
        System.out.print("�洢������names����֮ǰ��[");
        for (int i = 0; i < names.length; i++) {
            if(i==0){
                System.out.print(names[i]);
            }else{
                System.out.print("," + names[i]);
            }
        }
        System.out.println("]");
	}
}
package oop2.com.atguigu07.object;

public class FinalizeTest {
	public static void main(String[] args) {
		Person p = new Person("Peter", 12);
		System.out.println(p);
		p = null;//��ʱ����ʵ������������󣬵ȴ������ա���ʱ�䲻ȷ����
		System.gc();//ǿ�����ͷſռ�

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

	}
}

class Person{
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//�˷������õ�ʱ������GCҪ���մ˶���ʱ���������µķ�����
	//������д�˷����������ͷŶ���ǰ����ĳЩ����
	//finalize()���ܵ����ڲ�����ѭ�����ã����´˶����ܱ����ա�
	@Override
	protected void finalize() throws Throwable {
		System.out.println("�����ͷ�--->" + this);
	}
}


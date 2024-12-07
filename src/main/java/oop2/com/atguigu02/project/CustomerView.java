package oop2.com.atguigu02.project;


/**
 * ClassName: CustomerView
 * Description:
 *      CustomerViewΪ��ģ�飬����˵�����ʾ�ʹ����û�����
 * @Author �й��-�κ쿵
 * @Create 15:40
 * @Version 1.0
 */
public class CustomerView {

    CustomerList customerList = new CustomerList(10);

    /**
     * ����������ķ���
     */
    public void enterMainMenu(){

        boolean isFlag = true;

        while(isFlag){
            System.out
                    .println("\n-------------------ƴ���̿ͻ�����ϵͳ-----------------\n");
            System.out.println("                   1 �� �� �� ��");
            System.out.println("                   2 �� �� �� ��");
            System.out.println("                   3 ɾ �� �� ��");
            System.out.println("                   4 �� �� �� ��");
            System.out.println("                   5 ��       ��\n");
            System.out.print("                   ��ѡ��(1-5)��");

            char key = CMUtility.readMenuSelection();
            switch(key){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("ȷ���Ƿ��˳�(Y/N)��");
                    char isExit = CMUtility.readConfirmSelection();
                    if(isExit == 'Y'){
                        isFlag = false;
                    }

                    break;

            }
        }

    }

    private void addNewCustomer() {
        System.out.println("---------------------��ӿͻ�---------------------");
        System.out.print("������");
        String name = CMUtility.readString(4);
        System.out.print("�Ա�");
        char gender = CMUtility.readChar();
        System.out.print("���䣺");
        int age = CMUtility.readInt();
        System.out.print("�绰��");
        String phone = CMUtility.readString(15);
        System.out.print("���䣺");
        String email = CMUtility.readString(15);

        Customer cust = new Customer(name, gender, age, phone, email);
        boolean flag = customerList.addCustomer(cust);
        if (flag) {
            System.out
                    .println("---------------------������---------------------");
        } else {
            System.out.println("----------------��¼����,�޷����-----------------");
        }
    }

    private void modifyCustomer() {
        System.out.println("---------------------�޸Ŀͻ�---------------------");

        int index = 0;
        Customer cust = null;
        for (;;) {
            System.out.print("��ѡ����޸Ŀͻ����(-1�˳�)��");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }

            cust = customerList.getCustomer(index - 1);
            if (cust == null) {
                System.out.println("�޷��ҵ�ָ���ͻ���");
            } else
                break;
        }

        System.out.print("����(" + cust.getName() + ")��");
        String name = CMUtility.readString(4, cust.getName());

        System.out.print("�Ա�(" + cust.getGender() + ")��");
        char gender = CMUtility.readChar(cust.getGender());

        System.out.print("����(" + cust.getAge() + ")��");
        int age = CMUtility.readInt(cust.getAge());

        System.out.print("�绰(" + cust.getPhone() + ")��");
        String phone = CMUtility.readString(15, cust.getPhone());

        System.out.print("����(" + cust.getEmail() + ")��");
        String email = CMUtility.readString(15, cust.getEmail());

        cust = new Customer(name, gender, age, phone, email);

        boolean flag = customerList.replaceCustomer(index - 1, cust);
        if (flag) {
            System.out
                    .println("---------------------�޸����---------------------");
        } else {
            System.out.println("----------�޷��ҵ�ָ���ͻ�,�޸�ʧ��--------------");
        }
    }

    private void deleteCustomer() {
        System.out.println("---------------------ɾ���ͻ�---------------------");

        int index = 0;
        Customer cust = null;
        for (;;) {
            System.out.print("��ѡ���ɾ���ͻ����(-1�˳�)��");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }

            cust = customerList.getCustomer(index - 1);
            if (cust == null) {
                System.out.println("�޷��ҵ�ָ���ͻ���");
            } else
                break;
        }

        System.out.print("ȷ���Ƿ�ɾ��(Y/N)��");
        char yn = CMUtility.readConfirmSelection();
        if (yn == 'N')
            return;

        boolean flag = customerList.deleteCustomer(index - 1);
        if (flag) {
            System.out
                    .println("---------------------ɾ�����---------------------");
        } else {
            System.out.println("----------�޷��ҵ�ָ���ͻ�,ɾ��ʧ��--------------");
        }
    }

    private void listAllCustomers() {
        System.out.println("---------------------------�ͻ��б�---------------------------");
        Customer[] custs = customerList.getAllCustomers();
        if (custs.length == 0) {
            System.out.println("û�пͻ���¼��");
        } else {
            System.out.println("���\t����\t�Ա�\t����\t�绰\t\t\t����");
            for (int i = 0; i < custs.length; i++) {
//            System.out.println(i + 1 + "\t" + custs[i].getName() + "\t" + custs[i].getGender() + "\t" + custs[i].getAge() + "\t\t" + custs[i].getPhone() + "\t" + custs[i].getEmail());
                System.out.println((i+1) + "\t" + custs[i].getDetails());
            }
        }

        System.out.println("-------------------------�ͻ��б����-------------------------");
    }
    
    
    public static void main(String[] args){
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }


}

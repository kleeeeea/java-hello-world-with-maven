package chapter16_net_teacher.src.com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * ClassName: UDPTest
 * Description:
 *
 * @Author �й��-�κ쿵
 * @Create 11:32
 * @Version 1.0
 */
public class  UDPTest {
    //���Ͷ�
    @Test
    public void sender() throws Exception {
        //1. ����DatagramSocket��ʵ��
        DatagramSocket ds = new DatagramSocket();

        //2. �����ݡ�Ŀ�ĵص�ip��Ŀ�ĵصĶ˿ںŶ���װ��DatagramPacket���ݱ���
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        int port = 9090;
        byte[] bytes = "���Ƿ��Ͷ�".getBytes("utf-8");
        DatagramPacket packet =  new DatagramPacket(bytes,0,bytes.length,inetAddress,port);

        //��������
        ds.send(packet);

        ds.close();
    }

    //���ն�
    @Test
    public void receiver() throws IOException {
        //1. ����DatagramSocket��ʵ��
        int port = 9090;
        DatagramSocket ds = new DatagramSocket(port);

        //2. �������ݱ��Ķ������ڽ��շ��Ͷ˷��͹���������
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);

        //3. ��������
        ds.receive(packet);

        //4.��ȡ���ݣ�����ӡ������̨��
        String str = new String(packet.getData(),0,packet.getLength());
        System.out.println(str);

        ds.close();
    }
}

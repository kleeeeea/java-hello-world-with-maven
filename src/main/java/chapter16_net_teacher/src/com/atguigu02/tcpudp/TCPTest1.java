package chapter16_net_teacher.src.com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPTest1
 * Description:
 * ����1���ͻ��˷������ݸ�����ˣ�����˽����ݴ�ӡ������̨�ϡ�
 *
 * @Author �й��-�κ쿵
 * @Create 9:24
 * @Version 1.0
 */
public class TCPTest1 {

    //�ͻ���
//    @Test
    public static void main(String[] args) {

        Socket socket = null;
        OutputStream os = null;
        try {
            //1. ����һ��Socket
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1"); //�����Է���ip��ַ
//            192.168.21.107
            int port = 8989;//�����Է��Ķ˿ں�
            socket = new Socket(inetAddress, port);

            //2. ��������
            os = socket.getOutputStream();
            os.write("��ã����ǿͻ��ˣ��������".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3. �ر�socket���ر���
            try {
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //�����
//    @Test

}

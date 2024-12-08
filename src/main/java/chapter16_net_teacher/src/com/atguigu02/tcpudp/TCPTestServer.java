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
public class TCPTestServer {


    //�����
    @Test
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null; //����ʽ�ķ���
        InputStream is = null;
        try {
            //1. ����һ��ServerSocket
            int port = 8989;
            serverSocket = new ServerSocket(port);

            //2. ����accept()�����տͻ��˵�Socket
            socket = serverSocket.accept();
            System.out.println("���������ѿ���");

            System.out.println("�յ���������" + socket.getInetAddress().getHostAddress() + "������");

            //3. ��������
            is = socket.getInputStream();
            byte[] buffer = new byte[5];
            int len;
            ByteArrayOutputStream baos = new ByteArrayOutputStream(); //�ڲ�ά����һ��byte[]
            while ((len = is.read(buffer)) != -1) {
                //����ģ����ܻ�������롣
//                String str = new String(buffer, 0, len);
//                System.out.print(str);

                //��ȷ��
                baos.write(buffer,0,len);
            }

            System.out.println(baos.toString());

            System.out.println("\n���ݽ������");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. �ر�Socket��ServerSocket����
            try {
                if (socket != null) {
                    socket.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (serverSocket != null) {
                    serverSocket.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null) {
                    is.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}

package chapter16_net_teacher.src.com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPTest1
 * Description:
 * 例题1：客户端发送内容给服务端，服务端将内容打印到控制台上。
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:24
 * @Version 1.0
 */
public class TCPTest1Server {


    //服务端
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null; //阻塞式的方法
        InputStream is = null;
        try {
            //1. 创建一个ServerSocket
            int port = 8989;
            serverSocket = new ServerSocket(port);

            //2. 调用accept()，接收客户端的Socket
            socket = serverSocket.accept();
            System.out.println("服务器端已开启");

            System.out.println("收到了来自于" + socket.getInetAddress().getHostAddress() + "的连接");

            //3. 接收数据
            is = socket.getInputStream();
            byte[] buffer = new byte[5];
            int len;
            ByteArrayOutputStream baos = new ByteArrayOutputStream(); //内部维护了一个byte[]
            while ((len = is.read(buffer)) != -1) {
                //错误的，可能会出现乱码。
//                String str = new String(buffer, 0, len);
//                System.out.print(str);

                //正确的
                baos.write(buffer,0,len);
            }

            System.out.println(baos.toString());

            System.out.println("\n数据接收完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭Socket、ServerSocket、流
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

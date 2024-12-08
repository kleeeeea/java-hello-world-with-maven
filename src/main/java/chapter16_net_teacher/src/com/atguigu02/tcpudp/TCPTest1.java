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
 * 例题1：客户端发送内容给服务端，服务端将内容打印到控制台上。
 *
 * @Author 尚硅谷-宋红康
 * @Create 9:24
 * @Version 1.0
 */
public class TCPTest1 {

    //客户端
//    @Test
    public static void main(String[] args) {

        Socket socket = null;
        OutputStream os = null;
        try {
            //1. 创建一个Socket
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1"); //声明对方的ip地址
//            192.168.21.107
            int port = 8989;//声明对方的端口号
            socket = new Socket(inetAddress, port);

            //2. 发送数据
            os = socket.getOutputStream();
            os.write("你好，我是客户端，请多多关照".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3. 关闭socket、关闭流
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

    //服务端
//    @Test

}
